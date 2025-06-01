import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import gen.*;
import classes.AST.*;
import classes.SymbolTable.SymbolTable;
import classes.SemanticAnalysis.SemanticError;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            String currentDir = System.getProperty("user.dir");
            File testFile = new File(currentDir, "Tests/Test3.txt");

            System.out.println("Current directory: " + currentDir);
            System.out.println("Looking for file: " + testFile.getAbsolutePath());

            if (!testFile.exists()) {
                System.err.println("Error: Test file not found at: " + testFile.getAbsolutePath());
                return;
            }

            String content = new String(Files.readAllBytes(testFile.toPath()));
            System.out.println("\nFile content:\n" + content + "\n");

            CharStream input = CharStreams.fromString(content);
            MyLexer lexer = new MyLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MyParser parser = new MyParser(tokens);

            parser.removeErrorListeners();
            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                      int line, int charPositionInLine,
                                      String msg, RecognitionException e) {
                    System.err.println("line " + line + ":" + charPositionInLine + " " + msg);
                }
            });

            ParseTree tree = parser.page();

            BaseVisitor visitor = new BaseVisitor();
            ASTNode ast = visitor.visit(tree);

            System.out.println("\n=== Abstract Syntax Tree for " + testFile.getName() + " ===\n");
            if (ast != null) {
                ast.print(0);
            } else {
                System.out.println("No AST generated - check for parsing errors.");
            }

            SymbolTable symbolTable = visitor.getSymbolTable();

            SemanticError semanticAnalyzer = new SemanticError(visitor.getSymbolTable());
            semanticAnalyzer.runAllChecks();

            List<String> errors = semanticAnalyzer.getErrorMessages();
            if (errors.isEmpty()) {
                System.out.println("\n=== No Semantic Errors Found ===\n");
            } else {
                System.out.println("\n=== Semantic Errors ===\n");
                for (String error : errors) {
                    System.out.println(error);
                }
                System.out.println();
            }

            System.out.println("=== Original Symbol Table ===");
            symbolTable.print();

            System.out.println("\n=== Filtered Symbol Table (After Semantic Analysis) ===");
            semanticAnalyzer.getFilteredSymbolTable().print();

            visitor.getLabelManager().print();

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Error during parsing: " + e.getMessage());
            e.printStackTrace();
        }
    }
}