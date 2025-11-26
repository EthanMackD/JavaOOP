package ie.atu.sw;

public record Employee(String name, 
					   String department, 
					   double salary, 
					   boolean active) {
	
	//Re-constructed method in a record

	public Employee withSalary(double newSalary) {
		return new Employee(name, department, newSalary, active);
	}
	
}
