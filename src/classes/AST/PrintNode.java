package classes.AST;

import java.util.List;
import java.util.ArrayList;

public class PrintNode extends ASTNode {
    private List<String> arguments;

    public PrintNode(int line, int column, List<String> args) {
        super(line, column);
        this.arguments = args != null ? args : new ArrayList<>();
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("Console Log Statement:");
        printIndent(indent + 1);
        System.out.print("Arguments: ");
        if (arguments.isEmpty()) {
            System.out.println("(none)");
        } else {
            System.out.println();
            for (String arg : arguments) {
                printIndent(indent + 2);
                System.out.println(arg);
            }
        }
    }
} 