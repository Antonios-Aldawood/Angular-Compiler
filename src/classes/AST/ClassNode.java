package classes.AST;

import java.util.List;
import java.util.ArrayList;

public class ClassNode extends ASTNode {
    private String name;
    private String implementsInterface;
    private List<ASTNode> fields;
    private List<ASTNode> methods;

    public ClassNode(int line, int column, String name) {
        super(line, column);
        this.name = name;
        this.fields = new ArrayList<>();
        this.methods = new ArrayList<>();
    }

    public void setImplementsInterface(String interfaceName) {
        this.implementsInterface = interfaceName;
    }

    public void addField(ASTNode field) {
        fields.add(field);
    }

    public void addMethod(ASTNode method) {
        methods.add(method);
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("Class Declaration:");
        printIndent(indent + 1);
        System.out.println("Name: " + name);
        
        if (implementsInterface != null) {
            printIndent(indent + 1);
            System.out.println("Implements: " + implementsInterface);
        }

        if (!fields.isEmpty()) {
            printIndent(indent + 1);
            System.out.println("Fields:");
            for (ASTNode field : fields) {
                field.print(indent + 2);
            }
        }

        if (!methods.isEmpty()) {
            printIndent(indent + 1);
            System.out.println("Methods:");
            for (ASTNode method : methods) {
                method.print(indent + 2);
            }
        }
    }
}

class ClassFieldNode extends ASTNode {
    private String name;
    private String type;
    private ExpressionNode initializer;

    public ClassFieldNode(int line, int column, String name, String type) {
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
        System.out.print(name + ": " + type);
        if (initializer != null) {
            System.out.print(" = ");
            initializer.print(0);
        }
        System.out.println(";");
    }
}


class ParameterNode extends ASTNode {
    private String name;
    private String type;

    public ParameterNode(int line, int column, String name, String type) {
        super(line, column);
        this.name = name;
        this.type = type;
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.print(name + ": " + type);
    }
} 