package exercicio2_cap8_introducao_POO;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		Employee employee= new Employee();
		double percentage;
		
		System.out.println("Enter informations");
		System.out.print("Name: ");
		employee.name= sc.nextLine();
		
		System.out.print("Gross salary: ");
		employee.grossSalary= sc.nextDouble();
		
		System.out.print("Tax: ");
		employee.tax= sc.nextDouble();
		
		System.out.println("Employee: "+ employee);
		
		System.out.print("Which percentage to increase salary? ");
		percentage= sc.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println("Updated data: "+ employee);
		sc.close();
		
	}

}
