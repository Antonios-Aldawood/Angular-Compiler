package classes.AST;

import java.util.Map;
import java.util.HashMap;

public class DecoratorNode extends ASTNode {
    private String name;
    private Map<String, String> properties;

    public DecoratorNode(int line, int column, String name) {
        super(line, column);
        this.name = name;
        this.properties = new HashMap<>();
    }

    public void addProperty(String key, String value) {
        properties.put(key, value);
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("Decorator Declaration:");
        printIndent(indent + 1);
        System.out.println("Name: @" + name);
        
        if (!properties.isEmpty()) {
            printIndent(indent + 1);
            System.out.println("Properties:");
            for (Map.Entry<String, String> entry : properties.entrySet()) {
                printIndent(indent + 2);
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}