package exercicios2_15;

// Calcula o produto, soma, diferen�a, divis�o de tr�s inteiros e exibe o resultado

import java.util.Scanner;

public class Calcula
{
	// m�todo principal inicia a execu��o do programa
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
		
	} // fim do m�todo main
	
} // fim da classe Calcula