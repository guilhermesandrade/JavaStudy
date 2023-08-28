package Exercicios;
import java.util.Locale;
import java.util.Scanner;

public class exercicios_estruturacondicional {

	public static void main(String[] args) {
		
		
		
		// ex1: Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não

		//Scanner sc1 = new Scanner(System.in);
		//Locale.setDefault(Locale.US);
		
		//int n1;
		
		//System.out.println("Informe um numero inteiro");
		//n1= sc1.nextInt();
		//sc1.nextLine();
		
		//if(n1<0) {
			
		//	System.out.println("O numero é negativo!");
		//}
		//else {
			
		//	System.out.println("O numero é positivo!");
		//}
		
		//sc1.close();
		
		
		// ex2: Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
		
		//Locale.setDefault(Locale.US);
		//Scanner sc2= new Scanner(System.in);
		
		//int n2;
		
		//System.out.println("Informe um numero inteiro");
		//n2 = sc2.nextInt();
		//sc2.nextLine();
		
		//if(n2%2==0) {
			
		//	System.out.println("O numero é par!");
		//}
		//else {
			
		//	System.out.println("O numero é impar!");
		//}	
		
		//sc2.close();
		
		
		// ex3: Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao 
		// Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em 
		// ordem crescente ou decrescente.
		
		//Locale.setDefault(Locale.US);
		//Scanner sc3= new Scanner(System.in);
		
		//int a3,b3;
		
		//System.out.println("Informe A");
		//a3= sc3.nextInt();
		//sc3.nextLine();
		
		//System.out.println("Informe B");
		//b3= sc3.nextInt();
		//sc3.nextLine();
		
		//if(a3%b3==0 || b3%a3== 0) {
			
		//	System.out.println("São multiplos!");
		//}
		//else {
			
		//	System.out.println("Não são multiplos!");
		//}
		
		//sc3.close();
		
		
		// ex4: Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode 
		// começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
		
		//Locale.setDefault(Locale.US);
		//Scanner sc4= new Scanner(System.in);
		
		//int inicio4, final4, duracao4;
		
		//System.out.println("Informe a hora inicial");
		//inicio4= sc4.nextInt();
		//sc4.nextLine();
		
		//System.out.println("Informe a hora final");
		//final4= sc4.nextInt();
		//sc4.nextLine();
		
		//if(final4<=inicio4) {
			
		//	duracao4 = (24-inicio4)+final4 ;
		//	System.out.printf("A partida durou %dH",duracao4);
		//}
		//else {
			
		//	duracao4= final4-inicio4;
			
		//	System.out.printf("A partida durou %dH",duracao4);
		//}
		
		//sc4.close();
		
		
		// ex5: Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A 
		// seguir, calcule e mostre o valor da conta a pagar
		
		//Scanner sc5= new Scanner(System.in);
		//Locale.setDefault(Locale.US);
		
		//int item5,qnt5;
		//double valor5;
		
		//System.out.println("Informe o código do item");
		//item5= sc5.nextInt();
		//sc5.nextLine();
		
		//System.out.println("Informe a quantidade");
		//qnt5= sc5.nextInt();
		//sc5.nextLine();
		
		//if(item5==1) {
			
		//	valor5= 4.0*qnt5;
		//	System.out.printf("O valor total da compra foi R$ %.2f",valor5);	
		//}
		//else if(item5==2) {
			
		//	valor5= 4.50*qnt5;
		//	System.out.printf("O valor total da compra foi R$ %.2f",valor5);
		//}
		//else if(item5==3) {
			
		//	valor5= 5.0*qnt5;
		//	System.out.printf("O valor total da compra foi R$ %.2f",valor5);
		//}
		//else if(item5==4) {
			
		//	valor5= 2.0*qnt5;
		//	System.out.printf("O valor total da compra foi R$ %.2f",valor5);
		//}
		//else if(item5==5) {
			
		//	valor5= 1.50*qnt5;
		//	System.out.printf("O valor total da compra foi R$ %.2f",valor5);
		//}
		//else {
			
		//	System.out.println("Código de item invalido!");
		//}
		
		
		//sc5.close();
		
		
		// ex6: Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos 
		// seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em 
		// nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
		
		//Locale.setDefault(Locale.US);
		//Scanner sc6= new Scanner(System.in);
		
		//double num6;
		
		//System.out.println("Informe qualquer numero");
		//num6= sc6.nextDouble();
		//sc6.nextLine();
		
		//if(num6>=0.25 && num6<=25.0) {
			
		//	System.out.println("O numero se encontra no intervalo [0,25]");
		//}
		//else if(num6>25.00 && num6<=50.0) {
			
		//	System.out.println("O numero se encontra no intervalo [25,50]");
		//}
		//else if(num6>50.0 && num6<=75.0) {
			
		//	System.out.println("O numero se encontra no intervalo [50,75]");
		//}
		//else if(num6>75.0) {
			
		//	System.out.println("O numero se encontra no intervalo [75,100]");
		//}
		//else {
			
		//	System.out.println("O numero não se encontra em nenhum intervalo!");
		//}
		
		//sc6.close();
		
		
		// ex7: Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas 
		// de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o 
		// ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
		// Se o ponto estiver na origem, escreva a mensagem “Origem”.
		// Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a 
		// situação.
		
		//Locale.setDefault(Locale.US);
		//Scanner sc7= new Scanner(System.in);
		
		//double x,y;
		
		//System.out.println("Informe X");
		//x= sc7.nextDouble();
		//sc7.nextLine();
		
		//System.out.println("Informe Y");
		//y= sc7.nextDouble();
		//sc7.nextLine();
		
		
		//if (x == 0.0 && y == 0.0) {
			
		//	System.out.println("Origem");
		//}
		//else if (x == 0.0) {
			
		//	System.out.println("Eixo Y");
		//}
		//else if (y == 0.0) {
			
		//	System.out.println("Eixo X");
		//}
		//else if (x > 0.0 && y > 0.0) {
			
		//	System.out.println("Q1");
		//}
		//else if (x < 0.0 && y > 0.0) {
			
		//	System.out.println("Q2");
		//}
		//else if (x < 0.0 && y < 0.0) {
			
		//	System.out.println("Q3");
		//}
		//else {
			
		//	System.out.println("Q4");
		//}
		
		//sc7.close();
		
		
		// ex8: Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem 
		// que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem 
		// qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
		// Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e 
		// mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
		// *tabela*
		// Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de 
		// salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é 
		// de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com 
		// duas casas decimais.
		
		Locale.setDefault(Locale.US);
		Scanner sc8= new Scanner(System.in);
		
		double salario,imposto;
		
		System.out.println("Informe o salario");
		salario= sc8.nextDouble();
		sc8.nextLine();
		
		if (salario <= 2000.0) {
			
			imposto = 0.0;
		}
		else if (salario <= 3000.0) {
			
			imposto = (salario - 2000.0) * 0.08;
		}
		else if (salario <= 4500.0) {
			
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}

		if (imposto == 0.0) {
			
			System.out.println("Isento");
		}
		else {
			
			System.out.printf("R$ %.2f%n", imposto);
		}
		
		sc8.close();
		
		
		
	}

}
