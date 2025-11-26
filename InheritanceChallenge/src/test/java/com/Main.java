package test.java.com;

public class Main {
	
	public static void main(String[] args) {
		
		Employee tim = new Employee("Tim", "11/11/1985", "01/01/2020");
		System.out.println(tim);
		System.out.println("Age = " + tim.getAge());
		System.out.println("Pay = " + tim.collectPay());
		
		SalariedEmployee joe = new SalariedEmployee("Joe", "11/11/1979","03/03/2020", 35000);

		System.out.println(joe);
		System.out.println("Age = " + joe.getAge());
		System.out.println("Pay = $" + joe.collectPay());
		
		joe.retire();
		System.out.println("Pension = $" + joe.collectPay());
		
		HourlyEmployee mary = new HourlyEmployee("Mary", "05/05/1970", "03/03/2021", 15);
		System.out.println(mary);
		System.out.println("Paycheck for Mary = $" + mary.collectPay());
		System.out.println("Mary's Holiday Pay = $" + mary.getDoublePay());
	}

}
