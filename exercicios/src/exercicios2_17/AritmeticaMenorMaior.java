package exercicios2_17;

// Este aplicativo c�lcula os valores de tr�s inteiros digitados pelo usu�rio e exibe a soma, m�dia, 
// produto e os n�meros menores e maiores.


import java.util.Scanner;

public class AritmeticaMenorMaior
{
	// m�todo principal inicia a execu��o do programa
	public static void main( String[] args )
	{
		
		int num1;
		int num2;
		int num3;
		int menor;
		int maior;
		
		Scanner input = new Scanner( System.in );
		System.out.print( "Insira o primeiro valor: " );
		num1 = input.nextInt();
		
		menor = num1;
		maior = num1;
		
		System.out.print( "Insira o segundo valor: " );
		num2 = input.nextInt();
		
		if( menor > num2 )
		{
			
			menor = num2;
			
		}
		if( maior < num2 )
		{
			
			maior = num2;
			
		}
		
		System.out.print( "Insira o terceiro valor: " );
		num3 = input.nextInt();
		
		if( menor > num3 )
		{
			
			menor = num3;
			
		}
		if( maior < num3 )
		{
			
			maior = num3;
			
		}
		
		System.out.printf( "Soma = %d\n", num1 + num2 + num3 );
		System.out.printf( "Media = %d\n", ( int )( ( num1 + num2 + num3 ) / 3 ) );
		System.out.printf( "Produto = %d\n", num1 * num2 * num3 );
		System.out.printf( "Maior = %d\n", maior );
		System.out.printf( "Menor = %d\n", menor );
		
		input.close();
		
	} // fim do m�todo main
	
} // fim da classe AritmeticaMenorMaior