import java.util.*;

%% 
%class Inverte  /* Nome da classe a ser gerada */
%standalone     /* Cria o programa principal */


/* Declaracao de codigo do usuario (ex: atributos e metodos) */
%{
	public boolean getEOF(){
		return this.zzAtEOF;
	}
	public void inverte(String frase){
		String dados[] = frase.split("<REVERT>");
		String reverse =new StringBuilder(frase).reverse().toString();		
		String result = reverse.replaceAll(">TREVER/<", "<REVERTED>");
		result = result.replaceAll(">TREVER<", "</REVERTED>");
		System.out.print(result);
	}
%}

/* Codigo a ser colocado no construtor da classe */
%init{
	
%init}

%%
\<REVERT\>.*\<\/REVERT\> { inverte(yytext()); }

