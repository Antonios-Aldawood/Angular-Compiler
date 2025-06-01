package classes.AST;

public class VariableDeclarationNode extends ASTNode {
    private String type;
    private String name;
    private String value;
    private LiteralNode initializer;

    public VariableDeclarationNode(int line, int column, String type, String name, String value, LiteralNode initializer) {
        super(line, column);
        this.type = type;
        this.name = name;
        this.value = value;
        this.initializer = initializer;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("Variable Declaration:");
        printIndent(indent + 1);
        System.out.println("Type: " + type);
        printIndent(indent + 1);
        System.out.println("Name: " + name);

        if (value != null) {
            printIndent(indent + 1);
            System.out.println("Initializer:");
            if (initializer != null) {
                initializer.print(indent + 2);
            } else {
                printIndent(indent + 2);
                System.out.println(value);
            }
        }
    }
} 