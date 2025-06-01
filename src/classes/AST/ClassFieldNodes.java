package classes.AST;

public class ClassFieldNodes extends ASTNode {
    private String name;
    private String type;
    private ExpressionNode initializer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ExpressionNode getInitializer() {
        return initializer;
    }

    public ClassFieldNodes(int line, int column, String name, String type) {
        super(line, column);
        this.name = name;
        this.type = type;
    }

    public void setInitializer(ExpressionNode initializer) {
        this.initializer = initializer;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("Field Declaration:");
        printIndent(indent + 1);
        System.out.println("Name: " + name);
        printIndent(indent + 1);
        System.out.println("Type: " + type);
        
        if (initializer != null) {
            printIndent(indent + 1);
            System.out.println("Initial Value:");
            initializer.print(indent + 2);
        }
    }
} 