package classes.AST;

import java.nio.file.Paths;

public abstract class ASTNode {
    private int line;
    private int column;

    public ASTNode(int line, int column) {
        this.line = line;
        this.column = column;
    }

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }

    public abstract void print(int indent);

    protected void printIndent(int indent) {
        for (int i = 0; i < indent; i++) {
            System.out.print("    "); // Use 4 spaces for each indentation level
        }
    }

    protected void printPosition() {
        System.out.print(" [line " + line + ":" + column + "]");
    }
} 