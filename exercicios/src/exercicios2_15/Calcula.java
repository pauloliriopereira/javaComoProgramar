package exercicios2_15;

// Calcula o produto, soma, diferença, divisão de três inteiros e exibe o resultado

import java.util.Scanner;

public class Calcula
{
	// método principal inicia a execução do programa
	public static void main( String[] args )
	{
		
		int num1;
		int num2;
		
		Scanner input = new Scanner( System.in );
		System.out.print( "Insira o primeiro valor: " );
		num1 = input.nextInt();
		
		System.out.print( "Insira o segundo valor: " );
		num2 = input.nextInt();
		
		System.out.printf( "%d + %d = %d\n", num1, num2, num1 + num2 );
		System.out.printf( "%d * %d = %d\n", num1, num2, num1 * num2 );
		System.out.printf( "%d / %d = %d\n", num1, num2, num1 / num2 );
		System.out.printf( "%d - %d = %d\n", num1, num2, num1 - num2 );
		
		input.close();
		
	} // fim do método main
	
} // fim da classe Calcula