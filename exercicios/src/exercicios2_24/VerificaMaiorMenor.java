package exercicios2_24;

// Este aplicativo solicita ao usuário inserir cinco inteiros, determina 
// e imprime o maior e o menor inteiro no grupo

import java.util.Scanner;

public class VerificaMaiorMenor
{
	// método principal inicia a execução do programa
	public static void main( String[] args )
	{
		
		int num;
		int min;
		int max;
		
		Scanner input = new Scanner( System.in );
		System.out.print( "Insira o primeiro valor: " );
		num = input.nextInt();
		min = num;
		max = num;
		
		System.out.print( "Insira o segundo valor: " );
		num = input.nextInt();
		
		if( num > max )
		{
			
			max = num;
			
		}
		
		if( num < min )
		{
			
			min = num;
			
		}
		
		System.out.print( "Insira o terceiro valor: " );
		num = input.nextInt();
		
		if( num > max )
		{
			
			max = num;
			
		}
		
		if( num < min )
		{
			
			min = num;
			
		}
		
		System.out.print( "Insira o quarto valor: " );
		num = input.nextInt();
		
		if( num > max )
		{
			
			max = num;
			
		}
		
		if( num < min )
		{
			
			min = num;
			
		}
		
		System.out.print( "Insira o quinto valor: " );
		num = input.nextInt();
		
		if( num > max )
		{
			
			max = num;
			
		}
		
		if( num < min )
		{
			
			min = num;
			
		}
		
		System.out.printf( "maior = %d, menor = %d\n", max, min );
		
		input.close();
		
	} // fim do método main
	
} // fim da classe VerificaMaiorMenor