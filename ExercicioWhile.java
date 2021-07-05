package br.com.generation.exercicioslacosrepeticao;
/*Autora: Fernanda Correia
 * Data: 05/07/21
 */

import java.util.Scanner;

public class ExercicioWhile {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int soma =0, some =0;
		int idade = -1;
		while(idade != -99) {
			
		System.out.println("Digite sua idade: ");
		idade = ler.nextInt();
		
		
		if (idade < 21) {
			soma = soma +1;
			
		}
		else if (idade > 50){
			some = some +1;	

	}}
		System.out.println("A quantidade de pessoas com menos de 21 anos é: " + soma);
		System.out.println("A quantidade de pessoas com mais de 50 anos é: " + some);
}}
