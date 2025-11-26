package ie.atu.sw;

public class Runner {
	record Person(String name, int age, String email) {}
	
	public static void main(String[] args) {
	
		var emp = new Employee("Joe", "HR", 20, false);
		
		emp = emp.withSalary(80);
		
		//var p1 = new Person("Joe", 18, "joe@atu.ie");
		
		
	} 

}
