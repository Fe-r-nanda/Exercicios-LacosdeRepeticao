package br.com.generation.exercicioslacosrepeticao;
/*Autora: Fernanda Correia
 * Data: 25/07/21
 */

import java.util.Scanner;

public class ExercicioWhile02 {

	public static void main(String[] args) {
		
	
		Scanner ler = new Scanner(System.in);

        int idade, cont = 0, sexo, humor, calma = 0, mulheresNervosas = 0, homensAgressivos = 0, outrosCalmos = 0;
        int maisvelhosNervosos=0, menoresCalmos=0;

        while (cont < 150) {
            System.out.println("Digite a sua idade");
            idade = ler.nextInt();
            System.out.println("Digite o seu sexo\n" + "1-Feminino" + "\n2-Masculino" + "\n3-Outro");
            sexo = ler.nextInt();
            System.out.println("Digite o seu humor\n" + "1-Calmo/a" + "\n2-Nervoso/a" + "\n3-Agressivo/a");
            humor = ler.nextInt();
            cont++;
            System.out.println("\n" + "\n");

            if (humor == 1) {
                calma++;

            }
            if (sexo == 1 && humor == 2) {
                mulheresNervosas++;
            }
            if (sexo == 2 && humor == 3) {
                homensAgressivos++;
            }
            if (sexo == 3 && humor == 1) {
                outrosCalmos++;
            }
            if (idade > 40 && humor == 2) {
                maisvelhosNervosos++;
            }
            if (idade < 18 && humor == 1) {
                menoresCalmos++;
            }
        }
        System.out.println("O número de pessoas calmas é: " + calma);
        System.out.println("O número de mulheres nervosas é: " + mulheresNervosas);
        System.out.println("O número de homens agressivos é: " + homensAgressivos);
        System.out.println("O número de outros calmos é: " + outrosCalmos);
        System.out.println("O número de pessoas nervosas com mais de 40 anos: " + maisvelhosNervosos);
        System.out.println("O número de pessoas calmas com menos de 18 anos: " + menoresCalmos);



	}

}
