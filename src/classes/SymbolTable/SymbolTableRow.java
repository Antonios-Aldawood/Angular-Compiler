package classes.SymbolTable;

public class SymbolTableRow {
    private String name;
    private String type;
    private String value;
    private int line;
    private int column;

    public SymbolTableRow(String name, String type, String value, int line, int column) {
        this.name = name;
        this.type = type;
        this.value = value;
        this.line = line;
        this.column = column;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getValue() {
        return value;
    }

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }

    @Override
    public String toString() {
        String valueStr = value != null ? value : "<none>";
        String typeStr = type != null ? type : "<none>";
        return String.format("Name: %-12s Type: %-8s Value: %-12s Location: [%d:%d]",
                name, typeStr, valueStr, line, column);
    }
} 