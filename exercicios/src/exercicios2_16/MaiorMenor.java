package exercicios2_16;

// Este aplicativo solicita ao usu�rio inserir dois inteiros, obt�m do usu�rio esses n�meros e exibe
// o n�mero maior seguido pelas palavras � maior. Se os n�meros forem iguais, imprime a mensagem 
// os numeros sao iguais.

import java.util.Scanner;

public class MaiorMenor
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
		
	} // fim do m�todo main
	
} // fim da classe MaiorMenor