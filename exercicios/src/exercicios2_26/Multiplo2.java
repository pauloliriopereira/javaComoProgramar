package exercicios2_26;

// Este aplicativo lê dois inteiros, determina e imprime se o primeiro 
// é múltiplo do segundo e imprime o resultado.

import java.util.Scanner;

public class Multiplo2
{
	// método principal inicia a execução do programa
	public static void main( String[] args )
	{
		
		int num1;
		int num2;
		
		Scanner input = new Scanner( System.in );
		System.out.print( "Insira dois inteiros separados por um espaco: " );
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		if( ( num1 % num2 ) == 0 )
		{
			
			System.out.printf( "%d %s %d\n", num1, "e multiplo de", num2 );
			
		}
		else
		{
			
			System.out.printf( "%d %s %d\n", num1, "nao e multiplo de", num2 );
			
		}
		
		input.close();
		
	} // fim do método main
	
} // fim da classe Multiplo2