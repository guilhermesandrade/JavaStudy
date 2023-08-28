import java.util.Locale;
import java.util.Scanner;

public class teste_saidaeentradadedados {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		int x,y;
		double z;
		
		x=5;
		y=2;
		z= (double) x/y;
		
		System.out.println("O resultado: "+ z);
		
		double a,b;
		
		a=5;
		b= (int) a/2;
		
		System.out.println("O resultado: "+ b);
		
		
		Scanner sc= new Scanner(System.in);
		
		String name;
		int age;
		double money;
		char initial;
		
		name=sc.next();
		age= sc.nextInt();
		money= sc.nextDouble();
		initial= sc.next().charAt(0);
		
		System.out.printf("%nVocê digitou: %n");
		System.out.println(name);
		System.out.println(age);
		System.out.printf("%.2f %n",money);
		System.out.println(initial);
		
		sc.close();
		
	}

}


