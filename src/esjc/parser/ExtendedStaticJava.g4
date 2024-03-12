grammar ExtendedStaticJava;

//RQ1
program
  : d1+= simpleClassDefintion*
    classDefinition
    d2+= simpleClassDefintion*
  ;

//RQ2
simpleClassDefintion
  : 'class' ID '{'
    publicFieldDeclaration*
    '}'
  ;

//RQ3
publicFieldDeclaration
  : 'public' type ID ';'
  ;

//RQ4
type
  : basicType | intType | booleanType | arrayType
  ;

basicType
  : ID
  ;

intType
  : 'int'
  ;

booleanType
  : 'boolean'
  ;

arrayType
  : (booleanType | intType | ID) '[' size=exp? ']'
  ;

returnType
  : 'void'                   #VoidType
  | type                     #NonVoidReturnType
  ;

compilationUnit
  : program EOF
  ;

classDefinition
  : 'public' 'class' ID '{'
    mainMethodDeclaration
    memberDeclaration*
    '}'
  ;

memberDeclaration
  : fieldDeclaration | methodDeclaration
  ;

mainMethodDeclaration
  : 'public' 'static' 'void'
    id1=ID                   { "main".equals($id1.text) }?
    '(' id2=ID               { "String".equals($id2.text) }?
    '[' ']' id3=ID ')'
    '{' methodBody '}'
  ;

fieldDeclaration
  : 'static' type ID ';'
  ;

methodDeclaration
  : 'static' returnType ID '(' params? ')' '{' methodBody '}'
  ;

params
  : param ( ',' param )*
  ;

param
  : type ID
  ;

methodBody
  : localDeclaration* statement*
  ;

localDeclaration
  : type ID ';'
  ;

//RQ5
statement
  : assignStatement
  | ifStatement
  | whileStatement
  | invokeExpStatement
  | returnStatement
  | forStatement
  | doWhileStatement
  | incDecStatement
  ;

//RQ6
incDecStatement
  : incDec ';'
  ;

//RQ7
assignStatement
  : assign ';'
  ;

assign
  : lhs '=' exp
  ;

//RQ8
lhs
  : ID                                    #SimpleLHS
  | idField= exp '.' innerField = ID      #FieldAccessLHS
  | id=exp '[' inner=exp ']'                    #ArrayAccessLHS
  ;

//RQ9
forStatement
  : 'for' '(' forInits? ';' exp? ';' forUpdates? ')' '{' statement* '}'
  ;

//RQ10
forInits
  : assign (',' assign)*
  ;

//RQ11
forUpdates
  : incDec ( ',' incDec)*
  ;

//RQ12
incDec
  : lhs op='++' | lhs op='--';

//RQ13
doWhileStatement
  : 'do' '{' statement* '}'* 'while' '(' exp ')' ';';

ifStatement
  : 'if' '(' exp ')' '{' ts+=statement* '}'
    ( 'else' '{' fs+=statement* '}' )?
  ;

whileStatement
  : 'while' '(' exp ')' '{' statement* '}'
  ;

invokeExpStatement
  : invoke ';'
  ;

returnStatement
  : 'return' ( exp )? ';'
  ;

//RQ14
exp
  : INT                      { new java.math.BigInteger($INT.text).bitLength() < 32 }?
                                            #IntLiteral
  | booleanLiteral                          #LiteralExp
  | 'null'                                  #NullLiteral
  | '(' exp ')'                             #ParenExp
  | invoke                                  #InvokeExp
  | ID                                      #IdExp
  | op=( '-' | '+' | '!' | '~' ) exp        #UnaryExp
  | e1=exp
    op=( '*' | '/' | '%' )
    e2=exp                                  #BinaryExp
  | e1=exp
    op=( '+' | '-' )
    e2=exp                                  #BinaryExp
  | e1=exp
    op=( '<' | '>' | '<=' | '>=' )
    e2=exp                                  #BinaryExp
  | e1=exp
    op=( '==' | '!=' )
    e2=exp                                  #BinaryExp
  | e1=exp op='&&' e2=exp                   #BinaryExp
  | e1=exp op='||' e2=exp                   #BinaryExp
  | e1=exp op='<<' e2=exp                   #ShiftLeftExp
  | e1=exp op='>>' e2=exp                   #ShiftRightExp
  | e1=exp op='>>>' e2=exp                  #UnsignedShiftRightExp
  | condition=exp '?' p1=exp ':' p2=exp     #CondExp
  | e1=exp '.' id=ID                        #FieldAccessExp
  | id=exp '[' inner=exp ']'                #ArrayAccessExp
  | 'new' name=ID '(' ')'                        #NewExp
  | 'new' typeid=arrayType          #ArrayCreationExp
  | 'new' typeid=arrayType initexpr=arrayInit #ArrayCreationExp
  ;

booleanLiteral
  : 'true'      #TrueLiteral
  | 'false'     #FalseLiteral
  ;

arrayInit
  : '{' exp ( ',' exp )* '}'
  ;

invoke
  : ( id1=ID '.' )? id2=ID '(' args? ')'
  ;

args
  : exp ( ',' exp )*
  ;

ID
  : ( 'a'..'z' | 'A'..'Z' | '_' | '$' )
    ( 'a'..'z' | 'A'..'Z' | '_' | '0'..'9' | '$' )*
  ;

INT
  : '0' | ('1'..'9') ('0'..'9')*
  ;

// Whitespace -- ignored
WS
  : [ \r\t\u000C\n]+ -> skip
  ;

// Any other character is an error character
ERROR
  : .
  ;