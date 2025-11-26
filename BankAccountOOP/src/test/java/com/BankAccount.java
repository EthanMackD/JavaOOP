package test.java.com;

public class BankAccount {

	private int accountNum;
	private double balance;
	private String customerName;
	private String email;
	private String phoneNum;
	

	public void depositFunds(double depositRequest) {

			if (depositRequest <= 0) {
				System.out.println("Cannot deposit a negative or null amount!");
		}
			else {
				balance += depositRequest;
				System.out.println("Deposit Successful! New balance is: " + balance);

		} 
	}

	public void withdrawFunds(double withdrawRequest) {
		
			if (balance < withdrawRequest) {
				System.out.println("Balance insufficient");
			}
			else {
				balance -= withdrawRequest;
				System.out.println("Withdraw Successful! New balance is: " + balance);
		} 
	}

	public int getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
		
		System.out.println("Balance is set to " + balance);
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

}
