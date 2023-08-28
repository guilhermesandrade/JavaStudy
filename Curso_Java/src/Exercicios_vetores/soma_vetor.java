package Exercicios_vetores;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {

	public static void main(String[] args) {
		/*	Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida: 
			- Imprimir todos os elementos do vetor 
			- Mostrar na tela a soma e a média dos elementos do vetor */
		
		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		
		int i, n;
		double soma=0, media=0;
		
		System.out.print("Enter the quantity of numbers do you want to read: ");
		n= sc.nextInt();
		sc.nextLine();
		
		double[] vect= new double [n];
		
		for(i=0;i<vect.length;i++) {
			
			System.out.print("Enter a number: ");
			vect[i]= sc.nextDouble();
			
			soma+=vect[i];
		}
		
		media= soma/n;
		
		System.out.print("Numeros digitados: ");
		
		for(i=0;i<vect.length;i++) {
			
			System.out.print(vect[i] + " / ");
		}
		
		System.out.printf("%nThe vector sum resulted in: %.2f%nAnd the average in: %.2f",soma,media);
		
		sc.close();


	}

}
