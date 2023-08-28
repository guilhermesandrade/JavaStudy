package Exercicios_vetores;

import java.util.Locale;
import java.util.Scanner;

public class alturas {

	public static void main(String[] args) {
		/* 	Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na 
			tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos, 
			bem como os nomes dessas pessoas caso houver.  */

		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		int n, i;
		double soma=0.0,media=0.0,porcentagem=0.0;
		
		System.out.print("Enter the quantity of peoples: ");
		n= sc.nextInt();
		sc.nextLine();
		
		alturas_class[] vect= new alturas_class[n];
		
		for(i=0;i<vect.length;i++) {
			
			System.out.printf("Insira o nome: ");
			String name = sc.nextLine();
			System.out.print("Insira a idade: ");
			int old = sc.nextInt();
			sc.nextLine();
			System.out.print("Insira a altura: ");
			double height= sc.nextDouble();
			sc.nextLine();
			
			sc.close();
			
			vect[i]= new alturas_class(name,old,height);
			
			soma+= height;
			
			if(old<16) {
				
				porcentagem++;
			}
		}
		
		media = soma/n;
		porcentagem = (porcentagem/n)*100.0;
		
		System.out.printf("A média de altura foi de: %.2f m %nE a porcentagem de pessoas com idade inferior a 16 foi de: %.0f%% %n",media,porcentagem);
		
		if(porcentagem>0) {
			System.out.println("Sendo elas:");
			
			for(i=0;i<vect.length;i++) {
						
				if(vect[i].getOld()<16) {
							
					System.out.println(vect[i].getName());
				}
			}
		}
		
		
		
		
	}

}
