package Exercicios_matriz;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter a value (n): ");
		int n= sc.nextInt();
		sc.nextLine();
		System.out.print("Enter a value (m): ");
		int m= sc.nextInt();
		sc.nextLine();
		
		int[][] mat= new int [n][m];
		
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				System.out.print("Enter a number (l"+i+"/c"+j+"): ");
				mat[i][j]= sc.nextInt();
			}
		}
		
		System.out.print("Enter an existing number in the matrix: ");
		int num= sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				if(mat[i][j]==num) {
					System.out.println("Position: "+ i+","+j);
					
					if(j>0) {
						
						System.out.println("Left: "+ mat[i][j-1]);
					}
					if(j < mat[i].length-1) {
						
						System.out.println("Right: "+ mat[i][j+1]);
					}
					if(i>0) {
						
						System.out.println("Up: "+ mat[i-1][j]);
					}
					if(i < mat.length-1) {
						
						System.out.println("Down: "+ mat[i+1][j]);
					}
					System.out.println();
				}
			}
		}
		
		sc.close();
		

	}

}
