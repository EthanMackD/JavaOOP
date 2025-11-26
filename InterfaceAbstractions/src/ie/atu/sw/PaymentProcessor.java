package ie.atu.sw;

public interface PaymentProcessor {
	static final double MAX_TRANSACTION_AMOUNT = 10_000.00d;
	static final String DEFAULT_CURRENCY = "EUR";
	
	//abstract method
	abstract boolean processPayment(double amount, String currency);
	
	//default methods
	default String getPaymentMethod() {
		return "Credit Card";
	}
	
	default boolean validatePayment(double amount) {
		return amount > 0;
	}

}
