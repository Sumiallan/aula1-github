package entities;

public class ContaBancaria {

	private int number;
	private String holder;
	private double saldo;
		
	public ContaBancaria(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public ContaBancaria(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public double getBalace() {
		return saldo;
	}

	public void deposit(double initialDeposit) {
		this.saldo += initialDeposit;	
	}
	
	public void withdraw(double amount) {
		this.saldo-= amount + 5.0;

	}
	
	public String toString() {
		return "Account: " + this.number + ", Holder: " + this.holder + ", Balance: "+ String.format("$ %.2f", this.saldo);
	}
	
	
}
