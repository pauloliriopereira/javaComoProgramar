package exercicios2_6;

// Calcula o produto de tr�s inteiros e exibe o resultado

import java.util.Scanner;

public class ProdutoDeTres
{
	// m�todo principal inicia a execu��o do programa
	public static void main( String[] args )
	{
		
		int num1;
		int num2;
		int num3;
		int resultado;
		
		Scanner input = new Scanner( System.in );
		System.out.print( "Insira o primeiro valor: " );
		num1 = input.nextInt();
		
		System.out.print( "Insira o primeiro valor: " );
		num2 = input.nextInt();
		
		System.out.print( "Insira o primeiro valor: " );
		num3 = input.nextInt();
		
		resultado = num1 * num2 * num3;
		
		System.out.print( "O resultado do produto e: " + resultado );
		
		input.close();
		
	} // fim do m�todo main
	
} // fim da classe ProdutoDeTres