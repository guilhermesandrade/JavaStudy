package Exercicios_vetores;

import java.util.Locale;
import java.util.Scanner;

public class negativos {

	public static void main(String[] args) {

		/* Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros 
		e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. */
		
		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		
		int n,i;
		
		System.out.print("Enter the quantity of numbers do you want to read (10 max): ");
		n = sc.nextInt();
		sc.nextLine();
		
		int[] vect = new int[n];
		
		for(i=0;i<vect.length;i++) {
			
			System.out.print("Enter a number: ");
			vect[i] = sc.nextInt();
			sc.nextLine();		
		}

		sc.close();
		
		System.out.println("Negative numbers writed:");
		
		for(i=0; i<vect.length; i++) {
		
			if(vect[i]<0) {
				
				System.out.println(vect[i]);
			}
			
			
		}
		

	}

}
