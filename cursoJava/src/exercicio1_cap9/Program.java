package exercicio1_cap9;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double saldo;

		System.out.print("Olá! Para criar uma conta, informe o numero da conta: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Agora informe o nome do titular: ");
		String name = sc.nextLine();
		System.out.print("E por ultimo, informe se deseja fazer o depósito inicial s/n: ");
		char escolha = sc.next().charAt(0);

		if (escolha == 's' || escolha == 'n') {

			if (escolha == 's') {

				System.out.print("Informe o valor do deposito: R$");
				saldo = sc.nextDouble();
			} else {

				saldo = 0.00;
			}
		} else {
			
			do {
				System.out.print("Informação invalida!informe se deseja fazer o depósito inicial com s/n: ");
				escolha = sc.next().charAt(0);

			} while (escolha != 's' && escolha != 'n');

			if (escolha == 's') {

				System.out.print("Informe o valor do deposito: R$");
				saldo = sc.nextDouble();
			} else {

				saldo = 0.00;
			}

		}
		
		Account account = new Account(number,saldo,name);
		
		System.out.printf("Dados:%n"+ account);
		
		System.out.printf("%nFaça um depósito: R$");
		double deposito = sc.nextDouble();
		account.deposito(deposito);
		
		System.out.printf("%nDados:%n"+ account);
		
		System.out.printf("%nFaça um saque: R$");
		double saque = sc.nextDouble();
		account.saque(saque);
		
		System.out.printf("%nDados:%n"+ account);
		
		System.out.printf("%nDeseja alterar o nome? s/n: ");
		escolha = sc.next().charAt(0);
		sc.nextLine();

		if (escolha == 's' || escolha == 'n') {

			if (escolha == 's') {

				System.out.printf("%nInforme o novo nome de titular: ");
				name = sc.nextLine();
				
			} 
			
		} else {
			
			do {
				System.out.printf("%nInformação invalida!Deseja alterar o nome? s/n: ");
				escolha = sc.next().charAt(0);

			} while (escolha != 's' && escolha != 'n');

			if (escolha == 's') {

				System.out.printf("%nInforme o novo nome de titular: ");
				name = sc.nextLine();
				
			}

		}
		
		account.setName(name);
		
		System.out.printf("%nDados:%n"+ account);
		
		
		sc.close();
	}

}
