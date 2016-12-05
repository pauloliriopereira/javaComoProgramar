package exemplo_figura2_7;

// Programa de adição de inteiros e exibi o resultado da soma na tela.

import java.util.Scanner;

public class Soma
{
	// método principal inicia a execução do programa
	public static void main( String[] args )
	{
		// Instância um objeto Scanner para obter os valores inseridos
		// prompt de comando pelo usuário
		Scanner input = new Scanner( System.in );
		
		int number1; // primeira parcela
		int number2; // segunda parcela
		int sum;  // resultado da soma de number1 e number2
		
		System.out.printf( "Primeira parcela: " ); //prompt
		number1 = input.nextInt(); // lê o valor inserido no prompt e atribui a variável number1
		
		System.out.printf( "Segunda parcela: " ); //prompt
		number2 = input.nextInt(); // lê o valor inserido no prompt e atribui a variável number2
		
		sum = number1 + number2;
		
		System.out.printf( "A soma e %d\n", sum );
		
		input.close();
		
	} // fim do método main
	
} // fim da classe Soma