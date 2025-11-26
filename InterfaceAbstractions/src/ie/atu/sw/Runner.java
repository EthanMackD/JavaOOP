package ie.atu.sw;

import java.util.List;

public class Runner {
	
	void main() {
		PaymentProcessor pp = new CreditCardProcessor("123456", "Mike");
		boolean res = pp.processPayment(8_000.00d, "USD");
		System.out.println(res);
		
		
		//boolean processPayment(double amount, String currency);
		PaymentProcessor pp1 = (a, c) -> c.equals("JPN")? false : true;
		
		List<PaymentProcessor> list = List.of(pp, pp1);
		
		var service = new PaymentService();
		service.processAll(list, 100.00, "EUR");
		
	}

}
