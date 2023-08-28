import java.util.Locale;
import java.util.Scanner;

public class teste_criacaodefuncoes {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		
		int x,y,result;
		
		System.out.println("Informe x");
		x= sc.nextInt();
		sc.nextLine();
		System.out.println("Informe y");
		y= sc.nextInt();
		
		result= sub(x,y);

		showResult(result);
		
		
		int a,b,c,d,higher;
		
		System.out.println("Informe a");
		a= sc.nextInt();
		sc.nextLine();
		System.out.println("Informe b");
		b= sc.nextInt();
		sc.nextLine();
		System.out.println("Informe c");
		c= sc.nextInt();
		sc.nextLine();
		System.out.println("Informe d");
		d= sc.nextInt();
		
		higher= max(a,b,c,d);
		
		resultado(higher);
		
		sc.close();
	}
	
	public static int sub(int z, int w) {
		
		int aux = z-w;
		
		return aux;
	}
	
	public static void showResult(int value) {
		
		System.out.println("O resultado da subtração de x e y, é: " + value);
		
	}
	
	public static int max(int e,int f,int g,int h) {
		
		int op;
		
		if(e>f && e>g && e>h) {
			
			op=e;
		}
		else if (f>g && f>h) {
			
			op=f;
		}
		else if(g>h) {
			
			op=g;
		}
		else {
			
			op=h;
		}
		
		return op;
	}
	
	public static void resultado(int number) {
		
		System.out.println("Higher = " + number);
	}

}
