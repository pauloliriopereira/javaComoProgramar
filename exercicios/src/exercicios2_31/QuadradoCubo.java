package exercicios2_31;

import java.util.Scanner;

// Escreva um aplicativo que calcule os quadrados e cubos dos números de 0 a 10 e 
// imprime os valores resultantes no formato de tabela como a seguir:( ver página 
// 86 do livro).

public class QuadradoCubo 
{

	// método principal inicia a execução do programa
	 public static void main( String[] args )
	 {
	     
	     int numero;
	     
	     Scanner entrada = new Scanner( System.in );
	     System.out.print( "Insira um numero inteiro com 5 digitos: " );
	     numero = entrada.nextInt();
	     
	     System.out.printf( "%d   ", numero / 10000 );
	     numero = numero % 10000;
	     System.out.printf( "%d   ", numero / 1000 );
	     numero = numero % 1000;
	     System.out.printf( "%d   ", numero / 100 );
	     numero = numero % 100;
	     System.out.printf( "%d   ", numero / 10 );
	     numero = numero % 10;
	     System.out.printf( "%d   ", numero );
	     
	     entrada.close();


	 } // fim do método main
	 
}// fim da classe SeparaDigitos