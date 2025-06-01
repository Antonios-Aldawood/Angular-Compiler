package classes.AST;

import Labels.LabelManager;
import gen.MyParser;
import gen.MyParserBaseVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;
import java.util.ArrayList;
import classes.SymbolTable.SymbolTable;

public class BaseVisitor extends MyParserBaseVisitor<ASTNode> {
    private SymbolTable symbolTable;
    private LabelManager labelManager;

    public BaseVisitor() {
        this.symbolTable = new SymbolTable();
        this.labelManager = new LabelManager();
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public LabelManager getLabelManager() {
        return labelManager;
    }

    @Override
    public ASTNode visitPage(MyParser.PageContext ctx) {
        ProgramNode node = new ProgramNode(
            ctx.getStart().getLine(),
            ctx.getStart().getCharPositionInLine()
        );

        for (ParseTree child : ctx.statement()) {
            ASTNode childNode = visit(child);
            if (childNode != null) {
                if (childNode instanceof ImportNode) {
                    node.addImport((ImportNode) childNode);
                } else if (childNode instanceof DecoratorNode) {
                    node.addDecorator((DecoratorNode) childNode);
                } else if (childNode instanceof ClassNode) {
                    node.addClass((ClassNode) childNode);
                } else if (childNode instanceof VariableDeclarationNode) {
                    node.addVariable((VariableDeclarationNode) childNode);
                } else if (childNode instanceof IfStatementNode) {
                    node.addStatement((IfStatementNode) childNode);
                } else if (childNode instanceof PrintNode) {
                    node.addStatement(childNode);
                } else if (childNode instanceof ExpressionNode) {
                    node.addStatement(childNode);
                } else if (childNode instanceof AssignmentNode) {
                    node.addStatement(childNode);
                }
            }
        }

        return node;
    }

    @Override
    public ASTNode visitVar(MyParser.VarContext ctx) {
        String name = ctx.field().fieldDeclaration().id().getText();
        String type = "var";
        String value = null;

        if (ctx.field().fieldDeclaration().typeAnnotation() != null) {
            type = ctx.field().fieldDeclaration().typeAnnotation().type().getText();
        }

        if (ctx.expression() != null) {
            value = ctx.expression().getText();
        }

        symbolTable.addSymbol(name, type, value,
            ctx.getStart().getLine(),
            ctx.getStart().getCharPositionInLine()
        );

        labelManager.generateLabel(symbolTable.lookup(name));

        LiteralNode literalNode = null;
        if (value != null) {
            literalNode = new LiteralNode(
                ctx.expression().getStart().getLine(),
                ctx.expression().getStart().getCharPositionInLine(),
                value,
                "string"
            );
        }

        return new VariableDeclarationNode(
            ctx.getStart().getLine(),
            ctx.getStart().getCharPositionInLine(),
            type,
            name,
            value,
            literalNode
        );
    }

    @Override
    public ASTNode visitClass(MyParser.ClassContext ctx) {
        String className = ctx.id(0).getText();

        symbolTable.addSymbol(className, "class", null,
            ctx.getStart().getLine(),
            ctx.getStart().getCharPositionInLine()
        );

        labelManager.generateLabel(symbolTable.lookup(className));

        ClassNode node = new ClassNode(
            ctx.getStart().getLine(),
            ctx.getStart().getCharPositionInLine(),
            className
        );

        symbolTable.enterScope(className);

        if (ctx.Implements() != null && ctx.id().size() > 1) {
            node.setImplementsInterface(ctx.id(1).getText());
        }

        if (ctx.classScope() != null) {
            for (ParseTree child : ctx.classScope().children) {
                ASTNode childNode = visit(child);
                if (childNode != null) {
                    if (childNode instanceof ClassFieldNode) {
                        node.addField((ClassFieldNode) childNode);
                    } else if (childNode instanceof ClassMethodNode) {
                        node.addMethod((ClassMethodNode) childNode);
                    }
                }
            }
        }

        symbolTable.exitScope();

        return node;
    }

    @Override
    public ASTNode visitClassField(MyParser.ClassFieldContext ctx) {
        if (ctx == null || ctx.field() == null || ctx.field().fieldDeclaration() == null) return null;

        String fieldName = ctx.field().fieldDeclaration().id().getText();
        String fieldType = null;
        String fieldValue = null;

        if (ctx.field().fieldDeclaration().typeAnnotation() != null) {
            fieldType = ctx.field().fieldDeclaration().typeAnnotation().type().getText();
        }

        if (ctx.field().fieldDeclaration().expression() != null) {
            fieldValue = ctx.field().fieldDeclaration().expression().getText();
        }

        symbolTable.addSymbol(fieldName, fieldType, fieldValue,
            ctx.getStart().getLine(),
            ctx.getStart().getCharPositionInLine()
        );

        labelManager.generateLabel(symbolTable.lookup(fieldName));

        ClassFieldNode fieldNode = new ClassFieldNode(
            ctx.getStart().getLine(),
            ctx.getStart().getCharPositionInLine(),
            fieldName,
            fieldType
        );

        if (fieldValue != null) {
            fieldNode.setInitializer(new LiteralNode(
                ctx.field().fieldDeclaration().expression().getStart().getLine(),
                ctx.field().fieldDeclaration().expression().getStart().getCharPositionInLine(),
                fieldValue,
                fieldType != null ? fieldType : "string"
            ));
        }

        return fieldNode;
    }

    @Override
    public ASTNode visitClassFunction(MyParser.ClassFunctionContext ctx) {
        if (ctx == null) return null;

        ClassMethodNodes node = new ClassMethodNodes(
            ctx.getStart().getLine(),
            ctx.getStart().getCharPositionInLine(),
            ctx.id().getText(),
            false
        );

        if (ctx.functionScope() != null) {
            for (var stmt : ctx.functionScope().statement()) {
                if (stmt.declaration() != null) {
                    if (stmt.declaration().var() != null) {
                        node.addStatement(visitVar(stmt.declaration().var()));
                    }
                    if (stmt.declaration().const_() != null) {
                        node.addStatement(visitConst(stmt.declaration().const_()));
                    }
                    if (stmt.declaration().let() != null) {
                        node.addStatement(visitLet(stmt.declaration().let()));
                    }
                }
                else if (stmt.actions() != null) {
                    if (stmt.actions().print() != null) {
                        node.addStatement(visitPrint(stmt.actions().print()));
                    }
                }
                else if (stmt.actions().assign() != null) {
                    node.addStatement(visitAssign(stmt.actions().assign()));
                }
            }
        }

        return node;
    }

    @Override
    public ASTNode visitAssign(MyParser.AssignContext ctx) {
        if (ctx == null) return null;

        String target = ctx.id().getText();
        String value = null;

        if (ctx.expression() != null) {
            value = ctx.expression().getText();
        }

        symbolTable.addSymbol(target, null, value,
            ctx.getStart().getLine(),
            ctx.getStart().getCharPositionInLine()
        );

        return new AssignmentNode(
            ctx.getStart().getLine(),
            ctx.getStart().getCharPositionInLine(),
            target,
            value
        );
    }

    @Override
    public ASTNode visitOnInit(MyParser.OnInitContext ctx) {
        ClassMethodNode node = new ClassMethodNode(
            ctx.getStart().getLine(),
            ctx.getStart().getCharPositionInLine(),
            "ngOnInit",
            true
        );

        if (ctx.functionScope() != null && ctx.functionScope().statement() != null) {
            for (var stmt : ctx.functionScope().statement()) {
                if (stmt.actions() != null) {
                    if (stmt.actions().print() != null) {
                        List<String> args = new ArrayList<>();

                        if (stmt.actions().print().parameters() != null) {
                            ParseTree params = stmt.actions().print().parameters();
                            for (int i = 0; i < params.getChildCount(); i++) {
                                ParseTree child = params.getChild(i);
                                if (!(child instanceof TerminalNode)) {
                                    args.add(child.getText());
                                }
                            }
                        }

                        PrintNode printNode = new PrintNode(
                            stmt.getStart().getLine(),
                            stmt.getStart().getCharPositionInLine(),
                            args
                        );

                        node.addStatement(printNode);
                    } else if (stmt.actions().assign() != null) {
                        node.addStatement(visitAssign(stmt.actions().assign()));
                    }
                }
            }
        }

        return node;
    }

    @Override
    public ASTNode visitOnChanges(MyParser.OnChangesContext ctx) {
        ClassMethodNode node = new ClassMethodNode(
            ctx.getStart().getLine(),
            ctx.getStart().getCharPositionInLine(),
            "ngOnChanges",
            true
        );

        if (ctx.functionScope() != null && ctx.functionScope().statement() != null) {
            for (var stmt : ctx.functionScope().statement()) {
                if (stmt.actions() != null) {
                    if (stmt.actions().print() != null) {
                        List<String> args = new ArrayList<>();
                        if (stmt.actions().print().parameters() != null) {
                            ParseTree params = stmt.actions().print().parameters();
                            for (int i = 0; i < params.getChildCount(); i++) {
                                ParseTree child = params.getChild(i);
                                if (!(child instanceof TerminalNode)) {
                                    args.add(child.getText());
                                }
                            }
                        }
                        node.addStatement(new PrintNode(
                            stmt.getStart().getLine(),
                            stmt.getStart().getCharPositionInLine(),
                            args
                        ));
                    } else if (stmt.actions().assign() != null) {
                        node.addStatement(visitAssign(stmt.actions().assign()));
                    }
                }
            }
        }

        return node;
    }

    @Override
    public ASTNode visitOnDestroy(MyParser.OnDestroyContext ctx) {
        ClassMethodNode node = new ClassMethodNode(
            ctx.getStart().getLine(),
            ctx.getStart().getCharPositionInLine(),
            "ngOnDestroy",
            true
        );

        if (ctx.functionScope() != null && ctx.functionScope().statement() != null) {
            for (var stmt : ctx.functionScope().statement()) {
                if (stmt.actions() != null) {
                    if (stmt.actions().print() != null) {
                        List<String> args = new ArrayList<>();
                        if (stmt.actions().print().parameters() != null) {
                            ParseTree params = stmt.actions().print().parameters();
                            for (int i = 0; i < params.getChildCount(); i++) {
                                ParseTree child = params.getChild(i);
                                if (!(child instanceof TerminalNode)) {
                                    args.add(child.getText());
                                }
                            }
                        }
                        node.addStatement(new PrintNode(
                            stmt.getStart().getLine(),
                            stmt.getStart().getCharPositionInLine(),
                            args
                        ));
                    } else if (stmt.actions().assign() != null) {
                        node.addStatement(visitAssign(stmt.actions().assign()));
                    }
                }
            }
        }

        return node;
    }

    @Override
    public ASTNode visitOnAfterViewInit(MyParser.OnAfterViewInitContext ctx) {
        ClassMethodNodes node = new ClassMethodNodes(
            ctx.getStart().getLine(),
            ctx.getStart().getCharPositionInLine(),
            "ngAfterViewInit",
            true
        );

        if (ctx.typeAnnotation() != null && ctx.typeAnnotation().type() != null) {
            node.setReturnType(ctx.typeAnnotation().type().getText());
        }

        if (ctx.functionScope() != null) {
            for (MyParser.StatementContext stmt : ctx.functionScope().statement()) {
                ASTNode statement = visit(stmt);
                if (statement != null) {
                    node.addStatement(statement);
                }
            }
        }

        return node;
    }

    @Override
    public ASTNode visitHooks(MyParser.HooksContext ctx) {
        String hookName;
        String hookType;
        ClassMethodNode node = null;

        if (ctx.onInit() != null) {
            hookName = "ngOnInit";
            hookType = "OnInit";
            node = (ClassMethodNode) visitOnInit(ctx.onInit());
        } else if (ctx.onDestroy() != null) {
            hookName = "ngOnDestroy";
            hookType = "OnDestroy";
            node = (ClassMethodNode) visitOnDestroy(ctx.onDestroy());
        } else if (ctx.onChanges() != null) {
            hookName = "ngOnChanges";
            hookType = "OnChanges";
            node = (ClassMethodNode) visitOnChanges(ctx.onChanges());
        } else if (ctx.onAfterViewInit() != null) {
            hookName = "ngAfterViewInit";
            hookType = "AfterViewInit";
            node = (ClassMethodNode) visitOnAfterViewInit(ctx.onAfterViewInit());
        } else {
            return null;
        }

        symbolTable.addSymbol(hookName, "lifecycle_hook", hookType,
            ctx.getStart().getLine(),
            ctx.getStart().getCharPositionInLine()
        );

        labelManager.generateLabel(symbolTable.lookup(hookName));

        return node;
    }

    @Override
    public ASTNode visitImportRule(MyParser.ImportRuleContext ctx) {
        ImportNode node = new ImportNode(
            ctx.getStart().getLine(),
            ctx.getStart().getCharPositionInLine(),
            ctx.StringLiteral().getText().replaceAll("'|\"|`", "")
        );

        if (ctx.importedObject() != null) {
            for (MyParser.IdContext id : ctx.importedObject().id()) {
                node.addImportedObject(id.getText());
            }
        }

        return node;
    }

    @Override
    public ASTNode visitDecorator(MyParser.DecoratorContext ctx) {
        DecoratorNode node = new DecoratorNode(
            ctx.getStart().getLine(),
            ctx.getStart().getCharPositionInLine(),
            ctx.id().Identifier().getText()
        );

        if (ctx.cssSelector() != null) {
            node.addProperty("selector", ctx.cssSelector().StringLiteral().getText().replaceAll("'|\"|`", ""));
        }
        if (ctx.decoratorStandalone() != null) {
            node.addProperty("standalone", ctx.decoratorStandalone().True() != null ? "true" : "false");
        }
        if (ctx.htmlTemplate() != null) {
            node.addProperty("template", ctx.htmlTemplate().Html().getText());
        }

        return node;
    }

    @Override
    public ASTNode visitConst(MyParser.ConstContext ctx) {
        String name = ctx.field().fieldDeclaration().id().getText();
        String type = "const";
        String value = null;

        if (ctx.field().fieldDeclaration().typeAnnotation() != null) {
            type = ctx.field().fieldDeclaration().typeAnnotation().type().getText();
        }

        if (ctx.expression() != null) {
            value = ctx.expression().getText();
        }

        symbolTable.addSymbol(name, type, value,
            ctx.getStart().getLine(),
            ctx.getStart().getCharPositionInLine()
        );

        labelManager.generateLabel(symbolTable.lookup(name));

        LiteralNode literalNode = null;
        if (value != null) {
            literalNode = new LiteralNode(
                ctx.expression().getStart().getLine(),
                ctx.expression().getStart().getCharPositionInLine(),
                value,
                "string"
            );
        }

        return new VariableDeclarationNode(
            ctx.getStart().getLine(),
            ctx.getStart().getCharPositionInLine(),
            type,
            name,
            value,
            literalNode
        );
    }

    @Override
    public ASTNode visitIfStatement(MyParser.IfStatementContext ctx) {
        IfStatementNode node = new IfStatementNode(
            ctx.getStart().getLine(),
            ctx.getStart().getCharPositionInLine(),
            (ExpressionNode) visit(ctx.expression())
        );

        if (ctx.scope() != null) {
            for (MyParser.StatementContext stmt : ctx.scope().statement()) {
                ASTNode statement = visit(stmt);
                if (statement != null) {
                    node.addStatement(statement);
                }
            }
        }

        return node;
    }

    @Override
    public ASTNode visitExpression(MyParser.ExpressionContext ctx) {
        if (ctx == null || ctx.logicalExpression() == null) {
            return null;
        }
        return visit(ctx.logicalExpression());
    }

    @Override
    public ASTNode visitLogicalExpression(MyParser.LogicalExpressionContext ctx) {
        if (ctx == null || ctx.comparisonExpression() == null || ctx.comparisonExpression().isEmpty()) {
            return null;
        }

        ExpressionNode left = (ExpressionNode) visit(ctx.comparisonExpression(0));
        if (left == null) {
            return null;
        }

        if (ctx.comparisonExpression().size() == 1) {
            return left;
        }

        if (ctx.comparisonExpression().size() > 1) {
            ExpressionNode right = (ExpressionNode) visit(ctx.comparisonExpression(1));
            if (right == null) {
                return left;
            }

            String operator = "&&";
            if (ctx.Or() != null) {
                operator = "||";
            }

            return new BinaryExpressionNode(
                ctx.getStart().getLine(),
                ctx.getStart().getCharPositionInLine(),
                left,
                operator,
                right
            );
        }

        return left;
    }

    @Override
    public ASTNode visitComparisonExpression(MyParser.ComparisonExpressionContext ctx) {
        if (ctx == null || ctx.additiveExpression() == null || ctx.additiveExpression().isEmpty()) {
            return null;
        }

        ExpressionNode left = (ExpressionNode) visit(ctx.additiveExpression(0));
        if (left == null) {
            return null;
        }

        if (ctx.additiveExpression().size() == 1) {
            return left;
        }

        if (ctx.additiveExpression().size() > 1) {
            ExpressionNode right = (ExpressionNode) visit(ctx.additiveExpression(1));
            if (right == null) {
                return left;
            }

            String operator = "==";
            if (ctx.Equals() != null) operator = "==";
            else if (ctx.NotEquals() != null) operator = "!=";
            else if (ctx.TypeEquals() != null) operator = "===";
            else if (ctx.NotTypeEquals() != null) operator = "!==";
            else if (ctx.SmallerOperator() != null) operator = "<";
            else if (ctx.LargerOperator() != null) operator = ">";
            else if (ctx.SmallerOrEqualsOperator() != null) operator = "<=";
            else if (ctx.LargerOrEqualsOperator() != null) operator = ">=";

            return new BinaryExpressionNode(
                ctx.getStart().getLine(),
                ctx.getStart().getCharPositionInLine(),
                left,
                operator,
                right
            );
        }

        return left;
    }

    @Override
    public ASTNode visitAdditiveExpression(MyParser.AdditiveExpressionContext ctx) {
        if (ctx == null || ctx.multiplicativeExpression() == null || ctx.multiplicativeExpression().isEmpty()) {
            return null;
        }

        ExpressionNode left = (ExpressionNode) visit(ctx.multiplicativeExpression(0));
        if (left == null) {
            return null;
        }

        if (ctx.multiplicativeExpression().size() == 1) {
            return left;
        }

        if (ctx.multiplicativeExpression().size() > 1) {
            ExpressionNode right = (ExpressionNode) visit(ctx.multiplicativeExpression(1));
            if (right == null) {
                return left;
            }

            String operator = ctx.Plus() != null ? "+" : "-";

            return new BinaryExpressionNode(
                ctx.getStart().getLine(),
                ctx.getStart().getCharPositionInLine(),
                left,
                operator,
                right
            );
        }

        return left;
    }

    @Override
    public ASTNode visitAtomicExpression(MyParser.AtomicExpressionContext ctx) {
        if (ctx == null) {
            return null;
        }

        if (ctx.literal() != null) {
            return visit(ctx.literal());
        }
        if (ctx.id() != null) {
            return visit(ctx.id());
        }
        if (ctx.groupedExpression() != null) {
            return visit(ctx.groupedExpression());
        }
        if (ctx.calls() != null) {
            return visit(ctx.calls());
        }
        if (ctx.dataContainers() != null) {
            return visit(ctx.dataContainers());
        }

        return null;
    }

    @Override
    public ASTNode visitGroupedExpression(MyParser.GroupedExpressionContext ctx) {
        if (ctx == null || ctx.expression() == null) {
            return null;
        }
        return visit(ctx.expression());
    }

    @Override
    public ASTNode visitLiteral(MyParser.LiteralContext ctx) {
        String type;
        String value;

        if (ctx.StringLiteral() != null) {
            type = "string";
            value = ctx.StringLiteral().getText();
        } else if (ctx.Numbers() != null) {
            type = "number";
            value = ctx.Numbers().getText();
        } else if (ctx.True() != null || ctx.False() != null) {
            type = "boolean";
            value = ctx.getText();
        } else {
            return null;
        }

        return new LiteralNode(
            ctx.getStart().getLine(),
            ctx.getStart().getCharPositionInLine(),
            value,
            type
        );
    }

    @Override
    public ASTNode visitId(MyParser.IdContext ctx) {
        return new IdentifierNode(
            ctx.getStart().getLine(),
            ctx.getStart().getCharPositionInLine(),
            ctx.Identifier().getText()
        );
    }

    @Override
    public ASTNode visitPrint(MyParser.PrintContext ctx) {
        if (ctx == null) return null;

        List<String> args = new ArrayList<>();
        if (ctx.parameters() != null) {
            for (int i = 0; i < ctx.parameters().getChildCount(); i++) {
                ParseTree child = ctx.parameters().getChild(i);
                if (!(child instanceof TerminalNode)) {
                    args.add(child.getText());
                }
            }
        }

        return new PrintNode(
            ctx.getStart().getLine(),
            ctx.getStart().getCharPositionInLine(),
            args
        );
    }

    @Override
    public ASTNode visitLet(MyParser.LetContext ctx) {
        String name = ctx.field().fieldDeclaration().id().getText();
        String type = "let";
        String value = null;

        if (ctx.field().fieldDeclaration().typeAnnotation() != null) {
            type = ctx.field().fieldDeclaration().typeAnnotation().type().getText();
        }

        if (ctx.expression() != null) {
            value = ctx.expression().getText();
        }

        symbolTable.addSymbol(name, type, value,
            ctx.getStart().getLine(),
            ctx.getStart().getCharPositionInLine()
        );

        labelManager.generateLabel(symbolTable.lookup(name));

        LiteralNode literalNode = null;
        if (value != null) {
            literalNode = new LiteralNode(
                ctx.expression().getStart().getLine(),
                ctx.expression().getStart().getCharPositionInLine(),
                value,
                "string"
            );
        }

        return new VariableDeclarationNode(
            ctx.getStart().getLine(),
            ctx.getStart().getCharPositionInLine(),
            type,
            name,
            value,
            literalNode
        );
    }
} 