package classes.AST;

import java.util.ArrayList;
import java.util.List;

public class ClassMethodNode extends ASTNode {
    private String name;
    private boolean isLifecycleHook;
    private List<ASTNode> statements;
    private String returnType;

    public ClassMethodNode(int line, int column, String name, boolean isLifecycleHook) {
        super(line, column);
        this.name = name;
        this.isLifecycleHook = isLifecycleHook;
        this.statements = new ArrayList<>();
    }

    public void addStatement(ASTNode statement) {
        statements.add(statement);
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        if (isLifecycleHook) {
            System.out.println("Lifecycle Hook: " + name + "() {");
        } else {
            System.out.println("Method: " + name + "() {");
        }

        if (returnType != null) {
            printIndent(indent + 1);
            System.out.println("Return Type: " + returnType);
        }

        for (ASTNode statement : statements) {
            statement.print(indent + 1);
        }

        printIndent(indent);
        System.out.println("}");
    }
} 