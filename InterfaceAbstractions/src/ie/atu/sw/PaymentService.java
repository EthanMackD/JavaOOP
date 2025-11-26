package ie.atu.sw;
import java.util.List;

public class PaymentService {
	
	public void processAll(List<PaymentProcessor> processors, 
				double amount, String currency) {
		
		System.out.println("Processing " + processors.size());
		
		for (PaymentProcessor pp : processors) {
			boolean success = pp.processPayment(amount, currency);
			
			if(success) {
				System.out.println("Payment Processed Successfully!");
			}
			else {
				System.out.println("Payment Failed!");
			}
		}
	}

}
