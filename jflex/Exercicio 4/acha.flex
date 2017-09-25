import java.util.*;

%% 
%class Acha  /* Nome da classe a ser gerada */
%standalone  /* Cria o programa principal */
/*
auto, break, case, char, const, continue, default, do, int,
long, register, return, short, signed, sizeof, static, struct,
switch, typedef, union, unsigned, void, volatile, while,
double, else, enum, extern, float, for, goto, if
*/

/* Declaracao de codigo do usuario (ex: atributos e metodos) */
%{
	int autoP=0, breakP=0, caseP=0, charP=0, constP=0, continueP=0, defaultP=0, doP=0, intP=0,longP=0, registerP=0, returnP=0, shortP=0, signedP=0, sizeofP=0, staticP=0, structP=0,switchP=0, typedefP=0, unionP=0, unsignedP=0, voidP=0, volatileP=0, whileP=0,doubleP=0, elseP=0, enumP=0, externP=0, floatP=0, forP=0, gotoP=0, ifP=0;
	public void finaliza(){
		System.out.println("auto: " + this.autoP);
		System.out.println("break: " + this.breakP);
		System.out.println("case :" + this.caseP);
		System.out.println("char: " + this.charP);
		System.out.println("const: " + this.constP);
		System.out.println("continue: " + this.continueP);
		System.out.println("default: " + this.defaultP);
		System.out.println("do: " + this.doP);
		System.out.println("int: " + this.intP);
		System.out.println("long: " + this.longP);
		System.out.println("register: " + this.registerP);
		System.out.println("return: " + this.returnP);
		System.out.println("short: " + this.shortP);
		System.out.println("signed: " + this.signedP);
		System.out.println("sizeof: " + this.sizeofP);
		System.out.println("static: " + this.staticP);
		System.out.println("struct: " + this.structP);
		System.out.println("switch: " + this.switchP);
		System.out.println("typedef: " + this.typedefP);
		System.out.println("unsigned: " + this.unsignedP);
		System.out.println("void: " + this.voidP);
		System.out.println("volatile: " + this.volatileP);
		System.out.println("while: " + this.whileP);
		System.out.println("double: " + this.doubleP);
		System.out.println("else: " + this.elseP);
		System.out.println("enum: " + this.enumP);
		System.out.println("extern: " + this.externP);
		System.out.println("float: " + this.floatP);
		System.out.println("for: " + this.forP);
		System.out.println("goto: " + this.gotoP);
		System.out.println("if: " + this.ifP);
	}
	public boolean getEOF(){
		return this.zzAtEOF;
	}
%}

/* Codigo a ser colocado no construtor da classe */
%init{
	
%init}

/* Declaracao de "MACROS" */

/* Declaracao de Regras */

%%
auto { this.autoP++;}
break { this.breakP++;}
case { this.caseP++;}
char { this.charP++;}
const { this.constP++;}
continue { this.continueP++;}
default { this.defaultP++;}
do { this.doP++;}
int { this.intP++;}
long { this.longP++;}
register { this.registerP++;}
return { this.returnP++;}
short { this.shortP++;}
signed { this.signedP++;}
sizeof { this.sizeofP++;}
static { this.staticP++;}
struct { this.structP++;}
switch { this.switchP++;}
typedef { this.typedefP++;}
unsigned { this.unsignedP++;}
void { this.voidP++;}
volatile { this.volatileP++;}
while { this.whileP++;}
double { this.doubleP++;}
else { this.elseP++;}
enum { this.enumP++;}
extern { this.externP++;}
float { this.floatP++;}
for { this.forP++;}
goto { this.gotoP++;}
if { this.ifP++;}
.	{}
\n	{}
<<EOF>> { finaliza(); System.exit(0);}
