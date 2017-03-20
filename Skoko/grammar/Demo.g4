grammar Demo;	//0.1

program: imports+=importList* programPart+ EOF;

importList: 'import:' (importedFiles+=path)+ (',' (importedFiles+=path)*)* ;

path: IDENTIFIER ('.' IDENTIFIER)* ;

programPart: statement			#MainStatement
           | functionDefinition	#ProgPartFunctionDefinition
           | typeDeclaration	#ClassDeclaration
           ;

statement: javaNative ';'
     	 | print ';'
		 | println ';'
		 | systemCall ';'
		 | functionCall ';'
         | varDeclaration ';'
         | assignment ';'
         | branch
         | loop
         ;
         
branch: 'if' '(' condition=expression ')' onTrue=block ('else' onFalse=block)?
	  ;

javaNative: invokeNative
          | getNative
          | push
          ;

invokeNative: 'invoke' kind=STRING name=STRING '(' giveTypes+=stringGiver* ')' returnType=STRING ;

getNative: 'new'  type=STRING ;

push: 'pushToStack' expression;

stringGiver: STRING ;

loop: 'while' '(' condition=expression ')' body=block
	;

block: '{' statement* '}' ;

expression: left=expression '/' right=expression #Div
          | left=expression '*' right=expression #Mult
          | left=expression '-' right=expression #Minus
          | left=expression '+' right=expression #Plus
          | left=expression '<<' right=expression #LeftShift
          | left=expression '>>' right=expression #RightShift
          | left=expression operator=('<' | '<=' | '>' | '>='| '==' | '<>') right=expression #Relational
          | left=expression '&&' right=expression #And
          | left=expression '||' right=expression #Or
          | varName=IDENTIFIER '[' index=expression ']'		#ArrayElement
          | typeName=IDENTIFIER '.' varName = IDENTIFIER	#TypeElement
          | typeName=IDENTIFIER '.' varName=IDENTIFIER '[' index=expression ']'	#TypeArrayField
          | number=NUMBER 						 #Number
          | number=FLOAT						 #Float
          | bool=BOOL                			 #Boolean
          | txt=STRING 							 #String
          | varName=IDENTIFIER 					 #Variable
          | constructorCall						 #Constructor
          | systemCall							 #SystemFunctions
          | functionCall 						 #FuncCallExpression
          | importFunctionCall					 #ImportFuncExpression
          | 'tos'								 #TopOfStack
          ;

varDeclaration: type=object varName=IDENTIFIER
			  | type=object varName=IDENTIFIER '=' expr=expression
			  ;
			  
assignmentList: assignments+=expression (',' assignments+=expression)* ;

assignment: varName=IDENTIFIER '[' index=expression ']' '=' expr=expression
		  | varName=IDENTIFIER '=' expr=expression
		  | typeFieldAssignment
		  ;

typeFieldAssignment: varName=IDENTIFIER '.' typeVarName=IDENTIFIER '=' expr=expression
				   | varName=IDENTIFIER '.' typeVarName=IDENTIFIER '[' index=expression ']' '=' expr=expression
				   ;

println: 'print(' argument=expression ')' ;

print: 'out(' argument=expression ')' ;

functionDefinition: type=object funcName=IDENTIFIER '(' params=parameterDeclaration ')' '{' statements=statementList 'return' returnValue=expression ';' '}' ;

typeDeclaration: 'type' typeName= IDENTIFIER '{' declarations=typeParameterDeclaration '}' ;

typeParameterDeclaration: (declarations+=varDeclaration ';')+ ;

parameterDeclaration: declarations+=varDeclaration (',' declarations+=varDeclaration)*
                    |
                    ;

statementList: statement* ;

systemCall: funcName=SYSTEMFUNC '(' arguments=expressionList ')' ;

functionCall: funcName=IDENTIFIER '(' arguments=expressionList ')' ;

importFunctionCall: ident=object ':' importDir=IDENTIFIER '.' funcName=IDENTIFIER '(' arguments=expressionList ')' ;

expressionList: expressions+=expression (',' expressions+=expression)*
              |
              ;

constructorCall: 'new' ident=object '(' arguments=assignmentList ')'
			   | 'new' type=primitive '[' size=expression ']'
			   ;
              
object: primitive '[]'
	  | primitive
	  | IDENTIFIER '[]'
	  | IDENTIFIER
	  ;

primitive: 'int'
		 | 'float'
		 | 'void'
		 | 'string'
		 ;
              
SYSTEMFUNC: 'toString'
		  | 'toInt'
		  | 'toFloat'
		  | 'append'
		  | 'length'
		  ;

BOOL: 'true' | 'false' ;
IDENTIFIER: [a-zA-Z][a-zA-Z0-9]* ;
NUMBER: [0-9]+;
FLOAT: [0-9]+'.'[0-9]+ ;
WHITESPACE: [ \t\n\r]+ -> channel(HIDDEN);
STRING: '"' .*? '"';
COMMENT: '/*' (COMMENT|.)*? '*/' -> channel(HIDDEN);
LINECOMMENT: '//' .*? ('\n'|EOF) -> channel(HIDDEN);