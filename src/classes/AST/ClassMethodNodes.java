package classes.AST;

import java.util.List;
import java.util.ArrayList;

class ClassMethodNodes extends ASTNode {
    private String name;
    private List<ParameterNode> parameters;
    private String returnType;
    private List<ASTNode> body;
    private boolean isHook;
    private String hookType; // "OnInit", "OnChanges", "OnDestroy", "OnAfterViewInit"

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ParameterNode> getParameters() {
        return parameters;
    }

    public void setParameters(List<ParameterNode> parameters) {
        this.parameters = parameters;
    }

    public String getReturnType() {
        return returnType;
    }

    public List<ASTNode> getBody() {
        return body;
    }

    public void setBody(List<ASTNode> body) {
        this.body = body;
    }

    public boolean isHook() {
        return isHook;
    }

    public void setHook(boolean hook) {
        isHook = hook;
    }

    public String getHookType() {
        return hookType;
    }

    public void setHookType(String hookType) {
        this.hookType = hookType;
    }

    public ClassMethodNodes(int line, int column, String name, boolean isHook) {
        super(line, column);
        this.name = name;
        this.parameters = new ArrayList<>();
        this.body = new ArrayList<>();
        this.isHook = isHook;
        this.hookType = isHook ? determineHookType(name) : null;
    }

    private String determineHookType(String name) {
        switch (name) {
            case "ngOnInit": return "OnInit";
            case "ngOnChanges": return "OnChanges";
            case "ngOnDestroy": return "OnDestroy";
            case "ngAfterViewInit": return "OnAfterViewInit";
            default: return null;
        }
    }

    public void addParameter(ParameterNode parameter) {
        parameters.add(parameter);
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    public void addStatement(ASTNode statement) {
        body.add(statement);
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        if (isHook) {
            System.out.println("Lifecycle Hook Method: " + name);
            if (hookType != null) {
                printIndent(indent + 1);
                System.out.println("Hook Type: " + hookType);
            }
        } else {
            System.out.println("Class Method: " + name);
        }
        
        if (!parameters.isEmpty()) {
            printIndent(indent + 1);
            System.out.println("Parameters:");
            for (ParameterNode param : parameters) {
                param.print(indent + 2);
            }
        }
        
        if (returnType != null) {
            printIndent(indent + 1);
            System.out.println("Return Type: " + returnType);
        }

        if (!body.isEmpty()) {
            printIndent(indent + 1);
            System.out.println("Method Body:");
            for (ASTNode statement : body) {
                statement.print(indent + 2);
            }
        }
    }
} 