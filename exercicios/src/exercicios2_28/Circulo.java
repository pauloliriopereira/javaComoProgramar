package exercicios2_28;

// Este aplicativo lê a entrada a partir do usuário do raio de um círculo como um inteiro e imprime 
// o diâmetro do círculo, perímetro e área utilizando o valor do ponto flutuante 3.14159 para pi.

import java.util.Scanner;

public class Circulo
{
	// método principal inicia a execução do programa
	public static void main( String[] args )
	{
		
		int raio;
		double pi = 3.14159;
		
		Scanner entrada = new Scanner( System.in );
		System.out.print( "Insira um valor inteiro para o raio: " );
		raio = entrada.nextInt();
		
		System.out.printf( "O valor do diametro e %d.\n", 2 * raio );
		System.out.printf( "O valor do perimetro e %f.\n", 2 * pi * raio );
		System.out.printf( "O valor do area e %f.\n", 2 * pi * raio * raio );
		
		entrada.close();

	} // fim do método main
	
} // fim da classe Circulo