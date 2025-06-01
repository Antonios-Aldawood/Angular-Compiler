parser grammar MyParser;

options { tokenVocab = MyLexer; }

page: statement*;

statement
//    : importRule   #ImportRuleStatment
    : importRule
    | decorator
    | declaration
    | controlFlow
    | structures
    | actions
    | function
    ;

declaration
    : const | let | var | constArray | letArray | varArray
    ;

actions
    : print | assign
    ;

controlFlow
    : ifStatement
    | whileStatement
    ;

structures
    : groupedExpression SemiColon*
    | object
    | array
    | class
    ;

importRule
    :
    Import (importedObject From)?
    StringLiteral
    SemiColon*;

importedObject
    : OpenCurlyBracket (id Comma?)+ CloseCurlyBracket SemiColon*;

decorator
    : Reference id  OpenBracket  OpenCurlyBracket
    (
        cssSelector?
        decoratorStandalone?
        htmlTemplate?
    )  CloseCurlyBracket  CloseBracket ;

cssSelector
    : Selector  DoubleColon  StringLiteral  Comma
    ;

decoratorStandalone
    : Standalone  DoubleColon  (True | False)  Comma
    ;

htmlTemplate
    : Template  DoubleColon  Html  Comma
    ;

const:  Const  field
    Assign  expression
    SemiColon* ;

var:  Var  field
    (Assign  expression)?
    SemiColon* ;

let:  Let  field
    (Assign  expression)?
    SemiColon* ;

constArray:  Const  OpenArrayBracket  (id  Comma )*  CloseArrayBracket  Assign
(
    StringLiteral  |
    id  |
    ( OpenBracket
        StringLiteral
     CloseBracket )  |
    array
)  SemiColon* ;

varArray:  Var  OpenArrayBracket  (id  Comma )*  CloseArrayBracket  Assign
(
    StringLiteral  |
    id  |
    ( OpenBracket
        StringLiteral
     CloseBracket )  |
    array
)  SemiColon* ;

letArray:  Let  OpenArrayBracket  (id  Comma )*  CloseArrayBracket  Assign
(
    StringLiteral  |
    id  |
    ( OpenBracket
        StringLiteral
     CloseBracket )  |
    array
)  SemiColon* ;

objectLiteralAttributeAssignment:
(
    literal |
    id
)  DoubleColon
    (
        literal |
        memberAccess parameters
    )
 SemiColon* ;

objectLiteral:  OpenCurlyBracket
(
    id  Comma  |
    objectLiteralAttributeAssignment
)*  CloseCurlyBracket ;

array:  OpenArrayBracket
(
    expression  Comma
)*  CloseArrayBracket  SemiColon* ;

object:  OpenCurlyBracket
(
    expression SemiColon+
)*  CloseCurlyBracket  SemiColon* ;

assign
    :
    (
        id Assign expression
        | (id (PlusOne | MinusOne))
        | (plusSomething | minusSomething)
    )
    SemiColon*
    ;

plusSomething: id PlusSomething expression;

minusSomething: id MinusSomething expression;

ifStatement
    : If OpenBracket expression CloseBracket scope ;

whileStatement
    : While OpenBracket expression CloseBracket scope ;

expression
    : logicalExpression
    ;

logicalExpression
  : comparisonExpression ((And | Or) comparisonExpression)*
  ;

comparisonExpression
  : additiveExpression ((SmallerOperator | LargerOperator | SmallerOrEqualsOperator | LargerOrEqualsOperator | Equals | TypeEquals | NotEquals | NotTypeEquals) additiveExpression)*
  ;

additiveExpression
  : multiplicativeExpression ((Plus | Minus) multiplicativeExpression)*
  ;

multiplicativeExpression
    : atomicExpression ((Multiply | Divide | Overflow) atomicExpression)*
    ;

atomicExpression
    : groupedExpression
    | literal
    | id
    | Not id
    | calls
    | dataContainers
    ;

calls
    : functionCall
    | methodCall
    | memberAccess
    ;

dataContainers
    : objectLiteral
    | array
    ;

groupedExpression
    : OpenBracket expression CloseBracket
    ;

literal
    : StringLiteral
    | Numbers
    | True
    | False
    ;

memberAccess: id (Dot id | Dot functionCall)*;

methodCall: id Dot functionCall;

functionCall: id parameters;

print:  Console  Dot  Log  parameters  SemiColon* ;

hooks:
    onInit  |
    onDestroy  |
    onChanges  |
    onAfterViewInit ;

onInit:  OnInit  parameters
    typeAnnotation?
    functionScope ;

onDestroy:  OnDestroy  parameters
    typeAnnotation?
    functionScope ;

onChanges:  OnChanges  parameters
    typeAnnotation?
    functionScope ;

onAfterViewInit:  OnAfterViewInit  parameters
    typeAnnotation?
    functionScope ;

class:  Export?  Class  id  ((Implements | Extends)  id)?  classScope ;

classScope
    : OpenCurlyBracket
        (
            classField |
            classFunctionDefinition |
            hooks
        )*
      CloseCurlyBracket
    ;

classField
    : privacyType? Static? field SemiColon+
    ;

classFunctionDefinition
    : privacyType? Static? classFunction
    ;

privacyType
    : Public
    | Private
    | Protected
    ;

classFunction
    : id parameters typeAnnotation? functionScope
    ;

field
    : fieldDeclaration
    ;

fieldDeclaration
    : id typeAnnotation? (Assign (expression | genericTypeInstance))? SemiColon*
    ;

typeAnnotation
    : DoubleColon type
    ;

type
    : primitiveType
    | genericType
    ;

primitiveType
    : String
    | Number
    | Boolean
    | Any
    | Unknown
    | Void
    ;

genericType
    : Set SmallerOperator type LargerOperator
    | Record SmallerOperator type Comma type LargerOperator
    | Map SmallerOperator type Comma type LargerOperator
    ;

genericTypeInstance
    : New genericType parameters;

scope: OpenCurlyBracket
    statement*
    CloseCurlyBracket ;

function: Export? Function  id  parameters
    typeAnnotation?
    functionScope ;

functionScope: OpenCurlyBracket
    statement*
    returnStatement?
    CloseCurlyBracket ;

parameters:  OpenBracket
        (
            (
                literal |
                objectLiteral |
                array |
                id DoubleColon (literal | structures) |
                memberAccess
            )
             Comma
        )*  CloseBracket ;

returnStatement: Return expression? SemiColon* ;

id: Identifier;
