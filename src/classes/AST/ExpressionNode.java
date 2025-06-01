package classes.AST;

public abstract class ExpressionNode extends ASTNode {
    public ExpressionNode(int line, int column) {
        super(line, column);
    }
}

class LiteralNode extends ExpressionNode {
    private String value;
    private String type; // "string", "number", "boolean"

    public LiteralNode(int line, int column, String value, String type) {
        super(line, column);
        this.value = value;
        this.type = type;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.print(value);
    }
}

class IdentifierNode extends ExpressionNode {
    private String name;

    public IdentifierNode(int line, int column, String name) {
        super(line, column);
        this.name = name;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.print(name);
    }
}

class BinaryExpressionNode extends ExpressionNode {
    private ExpressionNode left;
    private String operator;
    private ExpressionNode right;

    public BinaryExpressionNode(int line, int column, ExpressionNode left, String operator, ExpressionNode right) {
        super(line, column);
        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.print("(");
        left.print(0);
        System.out.print(" " + operator + " ");
        right.print(0);
        System.out.print(")");
    }
} 