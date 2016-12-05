package exercicios2_16;

// Este aplicativo solicita ao usuário inserir dois inteiros, obtém do usuário esses números e exibe
// o número maior seguido pelas palavras é maior. Se os números forem iguais, imprime a mensagem 
// os numeros sao iguais.

import java.util.Scanner;

public class MaiorMenor
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
		
		if( num1 > num2 )
		{
			
			System.out.printf( "%d %s\n", num1, "e maior" );
			
		}
		
		if( num2 > num1 )
		{
			
			System.out.printf( "%d %s\n", num2, "e maior" );
			
		}
		
		if( num2 == num1 )
		{
			
			System.out.printf( "%s\n", "Os numeros sao iguais." );
			
		}
		
		input.close();
		
	} // fim do método main
	
} // fim da classe MaiorMenor