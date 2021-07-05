package br.com.generation.exercicioslacosrepeticao;
/*Autora: Fernanda Correia
 * Data: 05/07/21
 */

import java.util.Scanner;

public class ExercicioDoWhile {

	public static void main(String[] args) {
	
		
		        Scanner ler = new Scanner(System.in);

		        int numero, armazenagem = 0;

		        do {
		            System.out.print("Digite os números desejados: " + "\n(Digite 0 para finalizar a soma)");
		            numero = ler.nextInt();
		            armazenagem += numero;
		        }
		        while(numero != 0);

		        System.out.println("A soma dos números digitados é: " + armazenagem);
		    
		ler.close();

	}

}
