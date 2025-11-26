package ie.atu.sw;

public class CreditCardProcessor implements PaymentProcessor {
	private String cardNumber;
	private String cardHolderName;
	
	

	public CreditCardProcessor(String cardNumber, String cardHolderName) {
		super();
		this.cardNumber = cardNumber;
		this.cardHolderName = cardHolderName;
	}


	@Override
	public boolean processPayment(double amount, String currency) {
		if (!validatePayment(amount))			 return false;
		if (amount > MAX_TRANSACTION_AMOUNT) 	 return false;
	
	System.out.println("Processing credit card " + cardNumber);
	System.out.println(cardHolderName + " amount:" + amount);

	return true;

	}
	@Override
	public String getPaymentMethod() {
		return PaymentProcessor.super.getPaymentMethod() + " -EU";
	}
}
