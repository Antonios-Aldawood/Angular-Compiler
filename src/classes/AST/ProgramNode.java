package classes.AST;

import java.util.ArrayList;
import java.util.List;

public class ProgramNode extends ASTNode {
    private List<ImportNode> imports;
    private List<DecoratorNode> decorators;
    private List<ClassNode> classes;
    private List<VariableDeclarationNode> variables;
    private List<ASTNode> statements;

    public ProgramNode(int line, int column) {
        super(line, column);
        this.imports = new ArrayList<>();
        this.decorators = new ArrayList<>();
        this.classes = new ArrayList<>();
        this.variables = new ArrayList<>();
        this.statements = new ArrayList<>();
    }

    public void addImport(ImportNode importNode) {
        imports.add(importNode);
    }

    public void addDecorator(DecoratorNode decorator) {
        decorators.add(decorator);
    }

    public void addClass(ClassNode classNode) {
        classes.add(classNode);
    }

    public void addVariable(VariableDeclarationNode variable) {
        variables.add(variable);
    }

    public void addStatement(ASTNode statement) {
        statements.add(statement);
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("Program {");
        
        // Print imports
        for (ImportNode importNode : imports) {
            importNode.print(indent + 1);
        }
        
        if (!imports.isEmpty() && !decorators.isEmpty()) {
            System.out.println();
        }

        // Print decorators
        for (DecoratorNode decorator : decorators) {
            decorator.print(indent + 1);
        }

        if (!decorators.isEmpty() && !variables.isEmpty()) {
            System.out.println();
        }

        // Print variables
        for (VariableDeclarationNode variable : variables) {
            variable.print(indent + 1);
        }

        if (!variables.isEmpty() && !classes.isEmpty()) {
            System.out.println();
        }

        // Print classes
        for (ClassNode classNode : classes) {
            classNode.print(indent + 1);
        }

        if (!classes.isEmpty() && !statements.isEmpty()) {
            System.out.println();
        }

        // Print other statements
        for (ASTNode statement : statements) {
            statement.print(indent + 1);
        }

        printIndent(indent);
        System.out.println("}");
    }
} 