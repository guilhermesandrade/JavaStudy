package exercicio1_cap8;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		
		Rectangle rectangle= new Rectangle();
		
		System.out.println("Enter rectangle values");
		System.out.print("Width: ");
		rectangle.width = sc.nextDouble();
		
		System.out.print("Height: ");
		rectangle.height= sc.nextDouble();
		
		System.out.println(rectangle);
		
		sc.close();

	}

}
