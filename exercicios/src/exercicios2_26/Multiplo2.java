package exercicios2_26;

// Este aplicativo l� dois inteiros, determina e imprime se o primeiro 
// � m�ltiplo do segundo e imprime o resultado.

import java.util.Scanner;

public class Multiplo2
{
	// m�todo principal inicia a execu��o do programa
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
		
	} // fim do m�todo main
	
} // fim da classe Multiplo2