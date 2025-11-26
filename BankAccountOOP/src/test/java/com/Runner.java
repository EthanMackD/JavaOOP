package test.java.com;

public class Runner {

	public static void main(String[] args) {

		BankAccount b1 = new BankAccount();

		b1.setAccountNum(12345);
		b1.setCustomerName("Bob Brown");
		b1.setEmail("bob@email.com");
		b1.setPhoneNum("0861234567");

		b1.setBalance(400.00);

		b1.depositFunds(500.00);
		b1.withdrawFunds(850.00);

		// Student Class

		for (int i = 1; i <= 5; i++) {
			StudentRecord s = new StudentRecord("S92300" + i, switch (i) {
			case 1 -> "Mary";
			case 2 -> "Carol";
			case 3 -> "Tim";
			case 4 -> "Harry";
			case 5 -> "Lisa";
			default -> "Anonymous";
			}, "05/11/1985", "Java Masterclass");

			System.out.println(s);
		}
	}
}
