package classes.SymbolTable;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
    private List<SymbolTableRow> rows;
    private Map<String, List<SymbolTableRow>> scopeMap;
    private String currentScope;

    public SymbolTable() {
        this.rows = new ArrayList<>();
        this.scopeMap = new HashMap<>();
        this.currentScope = "global";
        scopeMap.put(currentScope, new ArrayList<>());
    }

    public void enterScope(String scope) {
        currentScope = scope;
        if (!scopeMap.containsKey(scope)) {
            scopeMap.put(scope, new ArrayList<>());
        }
    }

    public void exitScope() {
        currentScope = "global";
    }

    public void addSymbol(String name, String type, String value, int line, int column) {
        SymbolTableRow row = new SymbolTableRow(name, type, value, line, column);
        rows.add(row);
        scopeMap.get(currentScope).add(row);
    }

    public SymbolTableRow lookup(String name) {
        // First look in current scope
        List<SymbolTableRow> scopeRows = scopeMap.get(currentScope);
        if (scopeRows != null) {
            for (SymbolTableRow row : scopeRows) {
                if (row.getName().equals(name)) {
                    return row;
                }
            }
        }
        
        // Then look in global scope if we're not already there
        if (!currentScope.equals("global")) {
            scopeRows = scopeMap.get("global");
            if (scopeRows != null) {
                for (SymbolTableRow row : scopeRows) {
                    if (row.getName().equals(name)) {
                        return row;
                    }
                }
            }
        }
        
        return null;
    }

    public Map<String, Map<String, Object>> getAllScopes() {
        Map<String, Map<String, Object>> result = new HashMap<>();
        
        for (Map.Entry<String, List<SymbolTableRow>> entry : scopeMap.entrySet()) {
            String scope = entry.getKey();
            Map<String, Object> scopeSymbols = new HashMap<>();
            
            for (SymbolTableRow row : entry.getValue()) {
                Map<String, Object> symbolInfo = new HashMap<>();
                symbolInfo.put("type", row.getType());
                symbolInfo.put("value", row.getValue());
                symbolInfo.put("line", row.getLine());
                symbolInfo.put("column", row.getColumn());
                
                scopeSymbols.put(row.getName(), symbolInfo);
            }
            
            result.put(scope, scopeSymbols);
        }
        
        return result;
    }

    public void print() {
        System.out.println("\n=== Symbol Table ===\n");
        
        for (Map.Entry<String, List<SymbolTableRow>> entry : scopeMap.entrySet()) {
            String scope = entry.getKey();
            List<SymbolTableRow> scopeRows = entry.getValue();
            
            if (!scopeRows.isEmpty()) {
                System.out.println("Scope: " + scope);
                System.out.println("-".repeat(80));
                
                for (SymbolTableRow row : scopeRows) {
                    System.out.println(row.toString());
                }
                
                System.out.println();
            }
        }
    }
} 