package exemplo_figura2_7;

// Programa de adi��o de inteiros e exibi o resultado da soma na tela.

import java.util.Scanner;

public class Soma
{
	// m�todo principal inicia a execu��o do programa
	public static void main( String[] args )
	{
		// Inst�ncia um objeto Scanner para obter os valores inseridos
		// prompt de comando pelo usu�rio
		Scanner input = new Scanner( System.in );
		
		int number1; // primeira parcela
		int number2; // segunda parcela
		int sum;  // resultado da soma de number1 e number2
		
		System.out.printf( "Primeira parcela: " ); //prompt
		number1 = input.nextInt(); // l� o valor inserido no prompt e atribui a vari�vel number1
		
		System.out.printf( "Segunda parcela: " ); //prompt
		number2 = input.nextInt(); // l� o valor inserido no prompt e atribui a vari�vel number2
		
		sum = number1 + number2;
		
		System.out.printf( "A soma e %d\n", sum );
		
		input.close();
		
	} // fim do m�todo main
	
} // fim da classe Soma