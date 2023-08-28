package exercicio1_cap9;

public class Account {

	private int number;
	private double saldo;
	private String name;
	
	public Account (int number,double saldo, String name) {
		
		this.number =number;
		this.saldo=saldo;
		this.name=name;
	}
	
	public Account (double saldo, String name) {
			
			this.saldo=saldo;
			this.name=name;
	}
	
	public int getNumber() {
		
		return number;
	}
	
	public double getSaldo() {
		
		return saldo;
	}
	
	public String getName(){
			
			return name;
	}
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	public void deposito(double deposito) {
		
		saldo += deposito;
	}
	
	public void saque(double saque) {
		
		saldo -= saque+5.00;
	}
	
	
	
	public String toString() {
		
		return "nome: "+ name
				+", numero da conta: "+ number
				+", saldo: R$"+ String.format("%.2f", saldo);
	}
	
}
