import java.util.*;

%% 
%class Verifica  /* Nome da classe a ser gerada */
%standalone      /* Cria o programa principal */

/* Declaracao de codigo do usuario (ex: atributos e metodos) */
%{
	public boolean getEOF(){
		return this.zzAtEOF;
	}
%}

/* Codigo a ser colocado no construtor da classe */
%init{
	
%init}

%%

[0-9]{2}.[0-9]{3}.[0-9]{3}\/[0-9]{4}-[0-9]{2}    { System.out.println("Reconheci CNPJ "+yytext()); }
[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}    { System.out.println("Reconheci CPF "+yytext()); }
.	{}
\n	{}
