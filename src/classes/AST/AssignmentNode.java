package classes.AST;

public class AssignmentNode extends ASTNode {
    private String target;
    private String value;

    public AssignmentNode(int line, int column, String target, String value) {
        super(line, column);
        this.target = target;
        this.value = value;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("Assignment:");
        printIndent(indent + 1);
        System.out.println("Target: " + target);
        printIndent(indent + 1);
        System.out.println("Value: " + value);
    }
} 