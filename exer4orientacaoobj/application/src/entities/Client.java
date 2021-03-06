package entities;


public class Client {

	private int number;
	private String name;
	private double balance; 

	public Client() {
		
	}
	
	public Client(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public Client(int number, String name, double initialDeposit) {
		this.number = number;
		this.name = name;
		deposit(initialDeposit);
	}	
	
	public long getNumber() {
		return number;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double deposit) {
		 balance += deposit;
	}
	
	public void withdraw(double withdraw) {
		 balance -= withdraw + 5.00;
	}
	
	public String toString() {
		return "Account "
				+ number
				+", Client: "
				+ name +
				", Balance: $ "
				+ String.format( "%.2f", getBalance());		
	}
}

