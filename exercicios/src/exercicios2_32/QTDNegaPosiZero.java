package exercicios2_32;

import java.util.Scanner;

// Escreva um programa que insere cinco números e determina e imprime quantos números negativos, 
// quantos números positivos e quantos zeros foram inseridos.

public class QTDNegaPosiZero 
{
	
	// método principal inicia a execução do programa
	public static void main( String[] args ) 
	{
		
		int valor;
		int qtd_positivo = 0;
		int qtd_negativa = 0;
		int qtd_zero = 0;
			
			Scanner entrada = new Scanner( System.in );
			System.out.print( "Insira o primeiro valor: " );
			valor = entrada.nextInt();
			
			if( valor > 0 )
			{
				
				qtd_positivo = qtd_positivo + 1;
				
			}
			else if( valor < 0 )
			{
				
				qtd_negativa = qtd_negativa + 1;
				
			}
			else
			{
				
				qtd_zero = qtd_zero + 1;
				
			}
			
			System.out.print( "Insira o segundo valor: " );
			valor = entrada.nextInt();
			
			if( valor > 0 )
			{
				
				qtd_positivo = qtd_positivo + 1;
				
			}
			else if( valor < 0 )
			{
				
				qtd_negativa = qtd_negativa + 1;
				
			}
			else
			{
				
				qtd_zero = qtd_zero + 1;
				
			}
			
			System.out.print( "Insira o terceiro valor: " );
			valor = entrada.nextInt();
			
			if( valor > 0 )
			{
				
				qtd_positivo = qtd_positivo + 1;
				
			}
			else if( valor < 0 )
			{
				
				qtd_negativa = qtd_negativa + 1;
				
			}
			else
			{
				
				qtd_zero = qtd_zero + 1;
				
			}
			
			System.out.print( "Insira o quarto valor: " );
			valor = entrada.nextInt();
			
			if( valor > 0 )
			{
				
				qtd_positivo = qtd_positivo + 1;
				
			}
			else if( valor < 0 )
			{
				
				qtd_negativa = qtd_negativa + 1;
				
			}
			else
			{
				
				qtd_zero = qtd_zero + 1;
				
			}
			
			System.out.print( "Insira o quinto valor: " );
			valor = entrada.nextInt();
			
			if( valor > 0 )
			{
				
				qtd_positivo = qtd_positivo + 1;
				
			}
			else if( valor < 0 )
			{
				
				qtd_negativa = qtd_negativa + 1;
				
			}
			else
			{
				
				qtd_zero = qtd_zero + 1;
				
			}
			
			System.out.printf( "QTD zeros = %d, QTD < 0 = %d, QTD > 0 = %d\n", 
					                qtd_zero, qtd_negativa, qtd_positivo );
			
			entrada.close();

	} // fim do método main

} // fim da classe QTDNegaPosiZero