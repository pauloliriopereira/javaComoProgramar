package exercicios2_25;

// Este aplicativo solicita ao usuário inserir um inteiro e determina e imprime se ele é ímpar ou par.

import java.util.Scanner;

public class ImparPar
{
	// método principal inicia a execução do programa
	public static void main( String[] args )
	{
		
		int num;
		int resto;
		
		Scanner input = new Scanner( System.in );
		System.out.print( "Insira um valor inteiro: " );
		num = input.nextInt();
		
		resto = num % 2;
		
		if( resto == 0 )
		{
			
			System.out.printf( "%d %s\n", num, "e par." );
			
		}
		else
		{
			
			System.out.printf( "%d %s\n", num, "e impar" );
			
		}
		
		input.close();
		
	} // fim do método main
	
} // fim da classe ImparPar