package exercicio3_cap8;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		school School= new school();
		
		System.out.print("Nome: ");
		School.nome = sc.nextLine();
		
		System.out.println("Nota 1: ");
		School.nota1 =sc.nextDouble();
		
		System.out.println("Nota 2: ");
		School.nota2 =sc.nextDouble();
		
		System.out.println("Nota 3: ");
		School.nota3 =sc.nextDouble();
		
		if(School.notafinal()< 60.0) {
			
			System.out.printf("Nota final: %.2f%nREPROVADO%nFaltou: %.2f pontos",School.notafinal(),School.pontos());
		}
		else {
			
			System.out.printf("Nota final: %.2f%nAPROVADO",School.notafinal());
		}
		
		sc.close();
		
	}

}
