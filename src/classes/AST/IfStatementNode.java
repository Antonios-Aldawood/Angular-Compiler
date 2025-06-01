package classes.AST;

import java.util.List;
import java.util.ArrayList;

public class IfStatementNode extends ASTNode {
    private ExpressionNode condition;
    private List<ASTNode> statements;

    public IfStatementNode(int line, int column, ExpressionNode condition) {
        super(line, column);
        this.condition = condition;
        this.statements = new ArrayList<>();
    }

    public void addStatement(ASTNode statement) {
        statements.add(statement);
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("If Statement:");
        printIndent(indent + 1);
        System.out.println("Condition:");
        condition.print(indent + 2);
        
        if (!statements.isEmpty()) {
            printIndent(indent + 1);
            System.out.println("Then Block:");
            for (ASTNode statement : statements) {
                statement.print(indent + 2);
            }
        }
    }
} 