package br.com.generation.exercicioslacosrepeticao;
/*Autora: Fernanda Correia
 * Data: 05/07/21
 */

import java.util.Scanner;

public class ExercicioFor {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int n =10;
		int i, prova = 0, soma = 0, some = 0;
		
		for(i = 0; i <=n; i++) {
			System.out.println("\nDigite aqui 10 números inteiros: ");
			i = ler.nextInt();
	
		
		prova = i % 2;
			if(prova == 0) {
				System.out.println("Esse número é par");
				soma = soma + 1;
			}
			else {
				System.out.println("Esse número é ímpar");
				some = some +1;
			}
			}
			System.out.println("Você tem " + soma + "números pares" );
			System.out.println("Você tem " + some + "números ímpares" );
		}
	
	
	}


