package exercicios2_28;

// Este aplicativo l� a entrada a partir do usu�rio do raio de um c�rculo como um inteiro e imprime 
// o di�metro do c�rculo, per�metro e �rea utilizando o valor do ponto flutuante 3.14159 para pi.

import java.util.Scanner;

public class Circulo
{
	// m�todo principal inicia a execu��o do programa
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

	} // fim do m�todo main
	
} // fim da classe Circulo