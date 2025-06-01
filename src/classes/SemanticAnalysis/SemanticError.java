package classes.SemanticAnalysis;

import classes.SymbolTable.SymbolTable;
import java.util.*;

public class SemanticError {
    private List<String> errorMessages;
    private SymbolTable originalSymbolTable;
    private SymbolTable filteredSymbolTable;

    public SemanticError(SymbolTable symbolTable) {
        this.originalSymbolTable = symbolTable;
        this.filteredSymbolTable = new SymbolTable();
        this.errorMessages = new ArrayList<>();
    }

    private String inferValueType(Object value) {
        if (value == null) return null;
        String strValue = value.toString();
        
        if (strValue.startsWith("'") || strValue.startsWith("\"")) {
            return "string";
        }
        
        if (strValue.equals("true") || strValue.equals("false")) {
            return "boolean";
        }
        
        try {
            Double.parseDouble(strValue);
            return "number";
        } catch (NumberFormatException e) {
            return null;
        }
    }

    private boolean areTypesCompatible(String declaredType, String valueType) {
        if (declaredType == null || valueType == null) return true;
        return declaredType.equals(valueType);
    }

    public void runAllChecks() {
        this.filteredSymbolTable = new SymbolTable();
        this.errorMessages = new ArrayList<>();
        
        Map<String, Map<String, Object>> allScopes = originalSymbolTable.getAllScopes();
        Map<String, Set<String>> declaredIdentifiers = new HashMap<>();
        Map<String, Map<String, String>> identifierTypes = new HashMap<>();
        Map<String, Map<String, Integer>> declarationLines = new HashMap<>();
        
        for (String scope : allScopes.keySet()) {
            declaredIdentifiers.put(scope, new HashSet<>());
            identifierTypes.put(scope, new HashMap<>());
            declarationLines.put(scope, new HashMap<>());
        }

        for (Map.Entry<String, Map<String, Object>> scopeEntry : allScopes.entrySet()) {
            String scopeName = scopeEntry.getKey();
            Map<String, Object> scope = scopeEntry.getValue();
            
            for (Map.Entry<String, Object> entry : scope.entrySet()) {
                String identifier = entry.getKey();
                Map<String, Object> symbolInfo = (Map<String, Object>) entry.getValue();
                String type = (String) symbolInfo.get("type");
                String declaredType = (String) symbolInfo.get("declaredType");
                Object value = symbolInfo.get("value");
                int line = ((Number) symbolInfo.get("line")).intValue();
                int column = ((Number) symbolInfo.get("column")).intValue();

                boolean isDeclaration = type != null && (type.equals("var") || type.equals("let") || type.equals("const"));
                boolean isClassRelated = type != null && (type.equals("class") || type.equals("method") || type.equals("lifecycle_hook"));
                boolean isClassField = !scopeName.equals("global") && declaredType != null;

                if (isDeclaration || isClassRelated || isClassField) {
                    if (declaredIdentifiers.get(scopeName).contains(identifier)) {
                        int firstLine = declarationLines.get(scopeName).get(identifier);
                        errorMessages.add(String.format(
                            "Semantic Error at line %d:%d - Identifier '%s' is already declared at line %d",
                            line, column, identifier, firstLine
                        ));
                        continue;
                    }

                    declaredIdentifiers.get(scopeName).add(identifier);
                    declarationLines.get(scopeName).put(identifier, line);
                    if (declaredType != null) {
                        identifierTypes.get(scopeName).put(identifier, declaredType);
                    }

                    if (value != null && declaredType != null) {
                        String valueType = inferValueType(value);
                        if (!areTypesCompatible(declaredType, valueType)) {
                            errorMessages.add(String.format(
                                "Semantic Error at line %d:%d - Cannot initialize identifier '%s' of type '%s' with value of type '%s'",
                                line, column, identifier, declaredType, valueType
                            ));
                            continue;
                        }
                    }

                    if (scopeName.equals("global")) {
                        filteredSymbolTable.addSymbol(identifier, type, value != null ? value.toString() : null, line, column);
                    } else {
                        filteredSymbolTable.enterScope(scopeName);
                        filteredSymbolTable.addSymbol(identifier, 
                            isClassField ? "field" : type, 
                            value != null ? value.toString() : null, 
                            line, column);
                        filteredSymbolTable.exitScope();
                    }
                }
            }
        }

        for (Map.Entry<String, Map<String, Object>> scopeEntry : allScopes.entrySet()) {
            String scopeName = scopeEntry.getKey();
            Map<String, Object> scope = scopeEntry.getValue();

            for (Map.Entry<String, Object> entry : scope.entrySet()) {
                String identifier = entry.getKey();
                Map<String, Object> symbolInfo = (Map<String, Object>) entry.getValue();
                String type = (String) symbolInfo.get("type");
                Object value = symbolInfo.get("value");
                int line = ((Number) symbolInfo.get("line")).intValue();
                int column = ((Number) symbolInfo.get("column")).intValue();

                if (type != null && (type.equals("var") || type.equals("let") || type.equals("const") ||
                    type.equals("class") || type.equals("method") || type.equals("lifecycle_hook"))) {
                    continue;
                }
                if (value == null) continue;

                boolean isDeclaredInCurrentScope = declaredIdentifiers.get(scopeName).contains(identifier);
                boolean isDeclaredInGlobal = !scopeName.equals("global") && declaredIdentifiers.get("global").contains(identifier);
                
                if (!isDeclaredInCurrentScope && !isDeclaredInGlobal) {
                    errorMessages.add(String.format(
                        "Semantic Error at line %d:%d - Identifier '%s' is used before being defined with var, let, or const",
                        line, column, identifier
                    ));
                    continue;
                }

                String existingDeclaredType = identifierTypes.get(scopeName).get(identifier);
                if (existingDeclaredType == null && !scopeName.equals("global")) {
                    existingDeclaredType = identifierTypes.get("global").get(identifier);
                }

                if (existingDeclaredType != null) {
                    String valueType = inferValueType(value);
                    if (valueType != null && !areTypesCompatible(existingDeclaredType, valueType)) {
                        errorMessages.add(String.format(
                            "Semantic Error at line %d:%d - Cannot assign value of type '%s' to identifier '%s' of type '%s'",
                            line, column, valueType, identifier, existingDeclaredType
                        ));
                        continue;
                    }
                }

                if (isDeclaredInCurrentScope) {
                    if (!scopeName.equals("global")) {
                        filteredSymbolTable.enterScope(scopeName);
                    }
                    filteredSymbolTable.addSymbol(identifier, "field", value.toString(), line, column);
                    if (!scopeName.equals("global")) {
                        filteredSymbolTable.exitScope();
                    }
                } else if (isDeclaredInGlobal) {
                    filteredSymbolTable.addSymbol(identifier, type, value.toString(), line, column);
                }
            }
        }

        for (String scope : allScopes.keySet()) {
            Map<String, Object> scopeSymbols = allScopes.get(scope);
            for (Map.Entry<String, Object> entry : scopeSymbols.entrySet()) {
                String identifier = entry.getKey();
                Map<String, Object> symbolInfo = (Map<String, Object>) entry.getValue();
                String type = (String) symbolInfo.get("type");
                Object value = symbolInfo.get("value");
                int line = ((Number) symbolInfo.get("line")).intValue();
                int column = ((Number) symbolInfo.get("column")).intValue();
                
                boolean isDeclaration = type != null && (type.equals("var") || type.equals("let") || type.equals("const"));
                boolean isClassRelated = type != null && (type.equals("class") || type.equals("method") || type.equals("lifecycle_hook"));
                boolean isClassField = !scope.equals("global") && symbolInfo.get("declaredType") != null;
                
                if ((isDeclaration || isClassRelated || isClassField) && declaredIdentifiers.get(scope).contains(identifier)) {
                    if (scope.equals("global")) {
                        filteredSymbolTable.addSymbol(identifier, type, value != null ? value.toString() : null, line, column);
                    } else {
                        filteredSymbolTable.enterScope(scope);
                        filteredSymbolTable.addSymbol(identifier, 
                            isClassField ? "field" : type, 
                            value != null ? value.toString() : null, 
                            line, column);
                        filteredSymbolTable.exitScope();
                    }
                }
            }
        }
    }

    public List<String> getErrorMessages() {
        return new ArrayList<>(errorMessages);
    }

    public SymbolTable getFilteredSymbolTable() {
        return filteredSymbolTable;
    }

    public void printErrors() {
        if (errorMessages.isEmpty()) {
            System.out.println("\n=== No Semantic Errors Found ===\n");
        } else {
            System.out.println("\n=== Semantic Errors ===\n");
            for (String error : errorMessages) {
                System.out.println(error);
            }
            System.out.println();
        }
    }
} 