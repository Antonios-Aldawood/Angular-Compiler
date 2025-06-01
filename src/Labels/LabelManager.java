package Labels;

import classes.SymbolTable.SymbolTableRow;
import java.util.HashMap;
import java.util.Map;

public class LabelManager {
    private Map<String, String> labels;
    private int labelCounter;

    public LabelManager() {
        this.labels = new HashMap<>();
        this.labelCounter = 0;
    }

    public String generateLabel(SymbolTableRow symbol) {
        String label = String.format("L%d_%s", labelCounter++, symbol.getName());
        labels.put(symbol.getName(), label);
        return label;
    }

    public String getLabel(String symbolName) {
        return labels.get(symbolName);
    }

    public void print() {
        System.out.println("\n=== Label Table ===\n");
        System.out.println("-".repeat(80));
        
        for (Map.Entry<String, String> entry : labels.entrySet()) {
            System.out.printf("%-20s -> %s%n", entry.getKey(), entry.getValue());
        }
        
        System.out.println("-".repeat(80));
        System.out.println();
    }
} 