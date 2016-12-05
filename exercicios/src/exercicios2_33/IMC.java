package exercicios2_33;

import java.util.Scanner;

// Este é um programa que calcule o imc, pelos valores inseridos de altura em metros 
// e o peso em quilogramas.

public class IMC
{
	
	// método principal inicia a execução do programa
	public static void main( String[] args ) 
	{
		
		double altura;
		double peso = 0.0;
		double imc;
		
		Scanner entrada = new Scanner( System.in );
		System.out.print( "Insira sua altura: " );
		altura = entrada.nextDouble();
		
		System.out.print( "Insira sua peso: " );
		peso = entrada.nextDouble();
		
		imc = peso / ( altura * altura );
		
		System.out.printf( "Seu IMC e igual há %.2f\n", imc );
		
		System.out.println( "\n\nIMC valores\n\n" );
		System.out.printf( "%s\n%s\n%s\n%s",
				"Abaixo do peso:  menor que 18,5",
				"Normal:          entre 18,5 e 24,9",
				"Acima do peso:   entre 25 e 29,9",
				"Obeso:           maior ou igual 30" );
		
		entrada.close();
		
	} // fim do método main

} // fim da classe IMC