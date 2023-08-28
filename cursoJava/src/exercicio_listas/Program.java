package exercicio_listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int quantity = sc.nextInt();
		sc.nextLine();
		
		List <Employee> list = new ArrayList <>();
		
		for(int i=0;i<quantity;i++) {
			
			System.out.println();
			System.out.println("Employee #"+(i+1)+" : ");
			
			System.out.print("Id: ");
			int id= sc.nextInt();
			sc.nextLine();
			
			//enquanto hasId existe na lista
			while(hasId(list,id)) {
				System.out.print("Id already taken! Try again: ");
				id= sc.nextInt();
				sc.nextLine();
			}
			
			System.out.print("Name: ");
			String name= sc.nextLine();
			
			System.out.print("Salary: ");
			double salary= sc.nextDouble();
			sc.nextLine();
			
			list.add(new Employee(id,name,salary));
		}
		
		System.out.println();
		for(Employee obj: list) {
			
			System.out.println(obj);
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int idSalary = sc.nextInt();
		sc.nextLine();
		
		//procurando id, jeito 1:
		
		//Integer pos= position(list,idsalary);
		
		//procurando id, jeito 2:
		
		/*Employee pos será igual ao: list.stream é a forma especial de tranformar a lista em um stream,que é uma forma especial
		que aceita funcoes Lambda, e após isso usamos a função filter que filtrará minha lista somente com os elementos que atenda o
		predicado: eu vou querer somente os employees x,tal que(->),o x.getId seja igual o idsalary. E após isso, ache o primeiro id
		correpondente, ou senão, retorne null*/
		
		Employee pos= list.stream().filter(x->x.getId()== idSalary).findFirst().orElse(null);
		
		if(pos== null) {
			
			System.out.println("This id does'nt exist");
		}
		else {
			
			System.out.print("Enter the percentage: ");
			double percent= sc.nextDouble();
			
			//incrementando o salario (pega o elemento da lista na tal posicao e aciona o increaseSalary)
			//se for com metodo 1-> list.get(pos).increaseSalary(percent);
			pos.increaseSalary(percent);
		}
		
		
		
		System.out.println();
		System.out.println("List of employees: ");
		
		//pra cada employee emp(nome q quiser) na minha lista list.. imprima emp
		for(Employee emp: list) {
			
			System.out.println(emp);
		}
		
		sc.close();
	}

	//criando uma funcao para verificar o id (opcao 1 para fazer)
	// deve ser static pois  o Main é static
	
	public static Integer position(List <Employee> list, int id){
		
		for(int i=0;i<list.size();i++) {
			
			if(list.get(i).getId()==id) {
				return i;
			}
		}
		
		return null;
		
		//o return null só funciona com a funcao Integer, se fosse int deveria retornar algum valor (ex: -1)
	}
	
	
	public static boolean hasId(List<Employee> list, int id) {
		
		Employee pos= list.stream().filter(x->x.getId()== id).findFirst().orElse(null);
		return pos!= null;
	}
}
