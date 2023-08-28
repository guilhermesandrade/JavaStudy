package Exemplo_membroestatico;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_fixacao_membroestatico {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc1 = new Scanner(System.in);
		
		double dollar,reais;
		
		System.out.print("What's the dollar price? ");
		dollar= sc1.nextDouble();
		
		System.out.println("How many dollars will be bought? ");
		reais= sc1.nextDouble();
		
		System.out.printf("Amount to be paid in reais: R$ %.2f", CurrencyConverter.TotalValue(dollar, reais));
		
		sc1.close();
		

	}

}
