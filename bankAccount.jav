
public class bankAccount {
	private String name;
	private int accountNumber;
	private float balance;
	
	public bankAccount(String name, int accountNumber, float balance) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public bankAccount(String name, int accountNumber) {
		this.name = name;
		this.accountNumber = accountNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name.toUpperCase();
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public float getBalance() {
		return balance;
	}
	
	public void deposit(float value) {
		balance += value;
		System.out.println("Sucessfull deposit");
	}
	
	public void withdraw(float value) {
		balance -= value +5;
		if(balance < 0) {
			System.out.println("Your balance is negative");
		}
	}
	
	public String toString() {
		return name
				+ " account number: "
				+ accountNumber
				+ ", balance: $"
				+ balance;
	}
}