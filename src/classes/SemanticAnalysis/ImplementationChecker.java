package classes.SemanticAnalysis;

import classes.SymbolTable.SymbolTable;
import java.util.*;

public class ImplementationChecker {
    private List<String> errorMessages;
    private SymbolTable originalSymbolTable;
    private SymbolTable filteredSymbolTable;
    private Map<String, Set<String>> classMethods;
    private Map<String, String> implementsRelation;

    public ImplementationChecker(SymbolTable symbolTable) {
        this.originalSymbolTable = symbolTable;
        this.filteredSymbolTable = new SymbolTable();
        this.errorMessages = new ArrayList<>();
        this.classMethods = new HashMap<>();
        this.implementsRelation = new HashMap<>();
    }

    public void checkImplementations() {
        this.filteredSymbolTable = new SymbolTable();
        this.errorMessages = new ArrayList<>();
        this.classMethods.clear();
        this.implementsRelation.clear();

        Map<String, Map<String, Object>> allScopes = originalSymbolTable.getAllScopes();

        for (Map.Entry<String, Map<String, Object>> scopeEntry : allScopes.entrySet()) {
            String scopeName = scopeEntry.getKey();
            Map<String, Object> scope = scopeEntry.getValue();

            for (Map.Entry<String, Object> entry : scope.entrySet()) {
                String identifier = entry.getKey();
                Map<String, Object> symbolInfo = (Map<String, Object>) entry.getValue();
                String type = (String) symbolInfo.get("type");
                Object implementsClass = symbolInfo.get("implements");

                if (type != null && type.equals("class")) {
                    classMethods.put(identifier, new HashSet<>());
                    if (implementsClass != null) {
                        implementsRelation.put(identifier, implementsClass.toString());
                    }
                }
            }
        }

        for (String className : classMethods.keySet()) {
            if (allScopes.containsKey(className)) {
                Map<String, Object> classScope = allScopes.get(className);
                for (Map.Entry<String, Object> entry : classScope.entrySet()) {
                    String identifier = entry.getKey();
                    Map<String, Object> symbolInfo = (Map<String, Object>) entry.getValue();
                    String type = (String) symbolInfo.get("type");

                    if (type != null && type.equals("method")) {
                        classMethods.get(className).add(identifier);
                    }
                }
            }
        }

        for (Map.Entry<String, String> relation : implementsRelation.entrySet()) {
            String implementingClass = relation.getKey();
            String implementedClass = relation.getValue();

            if (!classMethods.containsKey(implementedClass)) {
                addError(implementingClass, String.format(
                    "Class '%s' tries to implement non-existent class '%s'",
                    implementingClass, implementedClass
                ));
                continue;
            }

            Set<String> requiredMethods = classMethods.get(implementedClass);
            Set<String> implementedMethods = classMethods.get(implementingClass);

            for (String method : requiredMethods) {
                if (!implementedMethods.contains(method)) {
                    addError(implementingClass, String.format(
                        "Class '%s' must implement method '%s' from class '%s'",
                        implementingClass, method, implementedClass
                    ));
                }
            }

            if (errorMessages.isEmpty()) {
                addToFilteredTable(implementingClass, implementedClass, allScopes);
            }
        }
    }

    private void addError(String className, String message) {
        Map<String, Object> globalScope = originalSymbolTable.getAllScopes().get("global");
        if (globalScope != null && globalScope.containsKey(className)) {
            Map<String, Object> classInfo = (Map<String, Object>) globalScope.get(className);
            int line = ((Number) classInfo.get("line")).intValue();
            int column = ((Number) classInfo.get("column")).intValue();
            errorMessages.add(String.format("Semantic Error at line %d:%d - %s", line, column, message));
        } else {
            errorMessages.add("Semantic Error - " + message);
        }
    }

    private void addToFilteredTable(String implementingClass, String implementedClass, Map<String, Map<String, Object>> allScopes) {
        Map<String, Object> globalScope = allScopes.get("global");
        if (globalScope != null) {
            if (globalScope.containsKey(implementedClass)) {
                Map<String, Object> classInfo = (Map<String, Object>) globalScope.get(implementedClass);
                filteredSymbolTable.addSymbol(
                    implementedClass,
                    "class",
                    null,
                    ((Number) classInfo.get("line")).intValue(),
                    ((Number) classInfo.get("column")).intValue()
                );

                if (allScopes.containsKey(implementedClass)) {
                    filteredSymbolTable.enterScope(implementedClass);
                    for (String method : classMethods.get(implementedClass)) {
                        Map<String, Object> methodInfo = (Map<String, Object>) allScopes.get(implementedClass).get(method);
                        filteredSymbolTable.addSymbol(
                            method,
                            "method",
                            null,
                            ((Number) methodInfo.get("line")).intValue(),
                            ((Number) methodInfo.get("column")).intValue()
                        );
                    }
                    filteredSymbolTable.exitScope();
                }
            }


            if (globalScope.containsKey(implementingClass)) {
                Map<String, Object> classInfo = (Map<String, Object>) globalScope.get(implementingClass);
                filteredSymbolTable.addSymbol(
                    implementingClass,
                    "class",
                    implementedClass,
                    ((Number) classInfo.get("line")).intValue(),
                    ((Number) classInfo.get("column")).intValue()
                );

                if (allScopes.containsKey(implementingClass)) {
                    filteredSymbolTable.enterScope(implementingClass);
                    for (String method : classMethods.get(implementingClass)) {
                        Map<String, Object> methodInfo = (Map<String, Object>) allScopes.get(implementingClass).get(method);
                        filteredSymbolTable.addSymbol(
                            method,
                            "method",
                            null,
                            ((Number) methodInfo.get("line")).intValue(),
                            ((Number) methodInfo.get("column")).intValue()
                        );
                    }
                    filteredSymbolTable.exitScope();
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
            System.out.println("\n=== No Implementation Errors Found ===\n");
        } else {
            System.out.println("\n=== Implementation Errors ===\n");
            for (String error : errorMessages) {
                System.out.println(error);
            }
            System.out.println();
        }
    }
} 