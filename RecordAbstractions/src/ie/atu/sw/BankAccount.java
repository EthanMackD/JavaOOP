package ie.atu.sw;

public record BankAccount(String accountNumber, double balance) {
	
	public BankAccount {
		if (balance < 0) throw new IllegalArgumentException("Balance cannot be negative");
		accountNumber = accountNumber.toUpperCase().trim();
	}
}
