package exercicios_base;
import java.util.Locale;
import java.util.Scanner;

public class exercicios_estruturasequencial {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner g = new Scanner(System.in);

		// ex1: Faça um programa para ler dois valores inteiros, e depois mostrar na
		// tela a soma desses números com uma
		// mensagem explicativa, conforme exemplos.

		// int x,y,resultado;

		// x= g.nextInt();
		// g.nextLine();
		// y= g.nextInt();
		// g.nextLine();

		// resultado= x+y;

		// System.out.printf("A soma de %d + %d, resultou em: %d %n%n",x,y,resultado);

		// ex2: Faça um programa para ler o valor do raio de um círculo, e depois
		// mostrar o valor da área deste círculo com quatro
		// casas decimais conforme exemplos.
		// Fórmula da área: area = π . raio2
		// Considere o valor de π = 3.14159

		// double raio,area;

		// raio= g.nextDouble();
		// g.nextLine();
		// area= 3.14159*raio;

		// System.out.printf("O valor da área do círculo com raio = %f, é:
		// %.4f",raio,area);

		// ex3: Fazer um programa para ler quatro valores inteiros A, B, C e D. A
		// seguir, calcule e mostre a diferença do produto
		// de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D

		// int a,b,c,d,dif;

		// a=g.nextInt();
		// g.nextLine();
		// b=g.nextInt();
		// g.nextLine();
		// c=g.nextInt();
		// g.nextLine();
		// d=g.nextInt();
		// g.nextLine();

		// dif= (a*b)-(c*d);

		// System.out.printf("A diferença entre o produto de %d e %d, pelo produto de %d
		// e %d, é: %d",a,b,c,d,dif);

		// ex4: Fazer um programa que leia o número de um funcionário, seu número de
		// horas trabalhadas, o valor que recebe por
		// hora e calcula o salário desse funcionário. A seguir, mostre o número e o
		// salário do funcionário, com duas casas
		// decimais.

		// int numf;
		// double horast,valorh,salario;

		// System.out.println("Informe o numero do funcionario");
		// numf= g.nextInt();
		// g.nextLine();
		// System.out.println("Informe as horas trabalhadas");
		// horast= g.nextDouble();
		// g.nextLine();
		// System.out.println("Informe o valor por hora trabalhada");
		// valorh= g.nextDouble();
		// g.nextLine();

		// salario=horast*valorh;

		// System.out.printf("O numero do funcionario é %d e o salario dele é de R$
		// %.2f",numf,salario);

		// ex5: Fazer um programa para ler o código de uma peça 1, o número de peças 1,
		// o valor unitário de cada peça 1, o
		// código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
		// Calcule e mostre o valor a ser pago.

		//int code1, code2, nump1, nump2;
		//double value1, value2, total;

		//System.out.println("Informe o codigo da peça 1: ");
		//code1 = g.nextInt();
		//g.nextLine();
		//System.out.println("Informe a quantidade de peças 1");
		//nump1 = g.nextInt();
		//g.nextLine();
		//System.out.println("Informe o valor unitario de cade peça 1");
		//value1 = g.nextDouble();
		//g.nextLine();

		//System.out.println("Informe o codigo da peça 2: ");
		//code2 = g.nextInt();
		//g.nextLine();
		//System.out.println("Informe a quantidade de peças 2");
		//nump2 = g.nextInt();
		//g.nextLine();
		//System.out.println("Informe o valor unitario de cade peça 2");
		//value2 = g.nextDouble();
		//g.nextLine();

		//total = (nump1 * value1) + (nump2 * value2);

		//System.out.println("O total da compra foi de R$ " + total);
		
		
		// ex6: Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e 
		// mostre: 
		//	a) a área do triângulo retângulo que tem A por base e C por altura. 
		//	b) a área do círculo de raio C. (pi = 3.14159) 
		//	c) a área do trapézio que tem A e B por bases e C por altura. 
		//	d) a área do quadrado que tem lado B. 
		//	e) a área do retângulo que tem lados A e B
		
		double A,B,C, triangulo, circulo, trapezio, quadrado, retangulo;
		
		System.out.println("Informe o A");
		A = g.nextDouble();
		g.nextLine();
		System.out.println("Informe o B");
		B = g.nextDouble();
		g.nextLine();
		System.out.println("Informe o C");
		C = g.nextDouble();
		g.nextLine();
		
		triangulo = A * C / 2.0;
		circulo = 3.14159 * C * C;
		trapezio = (A + B) / 2.0 * C;
		quadrado = B * B;
		retangulo = A * B;
		
		System.out.printf("O triangulo: %.3f. O circulo: %.3f. O trapézio: %.3f. O quadrado: %.3f. O retangulo: %.3f", triangulo, circulo,trapezio, quadrado,retangulo);

		g.close();

	}

}
