package exercicios2_30;

//Escreva um aplicativo que lê um número consistindo em cinco dígitos do usuário, separa
//o número em seus dígitos e imprime os dígitos separados uns dos outros por três
//espaços cada.

import java.util.Scanner;


public class SeparadorDeDigitos
{
 // método principal inicia a execução do programa
 public static void main( String[] args )
 {
     
     int numero;
     
     Scanner entrada = new Scanner( System.in );
     System.out.print( "Insira um numero inteiro com 5 digitos: " );
     numero = entrada.nextInt();
     
     System.out.printf( "%d   ", numero / 10000 );
     numero = numero % 10000;
     System.out.printf( "%d   ", numero / 1000 );
     numero = numero % 1000;
     System.out.printf( "%d   ", numero / 100 );
     numero = numero % 100;
     System.out.printf( "%d   ", numero / 10 );
     numero = numero % 10;
     System.out.printf( "%d   ", numero );
     
     entrada.close();


 } // fim do método main
 
} // fim da classe SeparaDigitos