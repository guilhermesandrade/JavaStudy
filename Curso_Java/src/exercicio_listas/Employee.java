package exercicio_listas;

public class Employee {

	
	private int id;
	private String name;
	private double salary;
	
	public Employee (int id, String name, double salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}
	
	public void increaseSalary (double percent) {
		
		salary += salary * percent / 100.0;
	}
	
	//override ajuda a voce não escrever algo errado (ele acusa oq esta errado)
	@Override
	public String toString() {
		
		return id + ", "+ name + ", "+ String.format("%.2f", salary);
	}

	
}
