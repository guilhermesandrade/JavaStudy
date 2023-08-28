package Exercicios;

import java.util.Scanner;

public class exercicios_estruturarepetitiva {

	public static void main(String[] args) {
		
		// WHILE
		
		// ex1: Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
		// incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
		// impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

		//Scanner sc1= new Scanner(System.in);
		
		//int x=0;
		
		//while(x!=2002) {
			
		//	System.out.println("%nInforme a senha:");
		//	x= sc1.nextInt();
			
		//	if(x==2002) {
				
		//		System.out.println("Acesso permitido!");
				
		//	}else {
				
		//		System.out.println("Senha invalida!");
		//	}
		//}
		
		//sc1.close();
		
		
		// ex2: Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
		// cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
		// menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
		
		//Scanner sc2 = new Scanner(System.in);

		//int x = sc2.nextInt();
		//int y = sc2.nextInt();
		
		//while (x != 0 && y != 0) {
		//	if (x > 0 && y > 0) {
		//		System.out.println("primeiro");
		//	}
		//	else if (x < 0 && y > 0) {
		//		System.out.println("segundo");
		//	}
		//	else if (x < 0 && y < 0) {
		//		System.out.println("terceiro");
		//	}
		//	else {
		//		System.out.println("quarto");
		//	}
		//	x = sc2.nextInt();
		//	y = sc2.nextInt();
		//}
		
		//sc2.close();
		
		
		// ex3: Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
		// um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
		//	4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
		//	que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
		//	mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
		//	exemplo.
		
		//Scanner sc3= new Scanner(System.in);
		
		//int x=0;
		//int alcool = 0;
		//int gasolina = 0;
		//int diesel = 0;
		
		//while (x!=4) {
			
			//System.out.println("Informe o combustivel: 1(alcool), 2(gasolina), 3(diesel), 4(fim do programa)");
			//x= sc3.nextInt();
			
			//	if(x==1) {
				
				//		alcool++;
				//	}
			//	else if(x==2) {
				
				//		gasolina++;
				//	}
			//	else if(x==3) {
				
				//		diesel++;
				//	}
			//	else if(x==4) {
				
				//		System.out.println("Muito Obrigado!");
		//	}
		//	else {
				
		//		while((x!=1) && (x!=2) && (x!=3) && (x!=4)) {
					
		//			System.out.println("Informe um código valido:");
		//			x= sc3.nextInt();
		//		}
		//		if(x==1) {
		//			
		//			alcool++;
		//		}
		//		else if(x==2) {
					
		//			gasolina++;
		//		}
		//		else if(x==3) {
					
		//			diesel++;
		//		}
		//		else if(x==4) {
					
		//			System.out.println("Muito Obrigado!");
		//		}
		//	}
			
		//}
		
		//sc3.close();
		
		//System.out.printf("Alcool: %d%nGasolina: %d%nDiesel: %d",alcool,gasolina,diesel);
		
		
		// FOR
		
		// ex1: Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o 
		// X, se for o caso
		
		/*Scanner sc= new Scanner(System.in);
		
		System.out.println("Informe x");
		int x = sc.nextInt();
		
		if(x<1 || x>1000) {
			
			while(x<1 || x>1000) {
			System.out.println("Valor invalido! Informe um valor de 1 até 1000");
			x = sc.nextInt();
			}
		}
		
		System.out.println("Numero impares de 1 até "+ x + " :");
		
		for(int y=1;y<=x;y++) {
			
			if(y%2==1) {
				
				System.out.println(y);
			}
		}
		
		sc.close();
		
		*/
		
		
		// ex2: Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
		// Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando 
		// essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Informe quantos numero ira ler");
		int x = sc.nextInt();
		
		int in=0, out=0;
		
		for(int y=0;y<x;y++) {
			
			System.out.println("Informe um numero");
			int aux = sc.nextInt();
			
			if(aux>=10 && aux<=20) {
				
				in++;
			}else {
				
				out++;
			}
			
		}
		
		sc.close();
		
		System.out.printf("%n%d in%n%d out",in,out);
		
		
		
		
	}
}
