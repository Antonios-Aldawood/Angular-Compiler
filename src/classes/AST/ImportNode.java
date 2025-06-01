package classes.AST;

import java.util.List;
import java.util.ArrayList;

public class ImportNode extends ASTNode {
    private String importPath;
    private List<String> importedObjects;

    public ImportNode(int line, int column, String importPath) {
        super(line, column);
        this.importPath = importPath;
        this.importedObjects = new ArrayList<>();
    }

    public void addImportedObject(String object) {
        importedObjects.add(object);
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("Import Statement:");
        printIndent(indent + 1);
        if (importedObjects.isEmpty()) {
            System.out.println("Importing module: " + importPath);
        } else {
            System.out.println("Importing objects: { " + String.join(", ", importedObjects) + " }");
            printIndent(indent + 1);
            System.out.println("From module: " + importPath);
        }
    }
} 