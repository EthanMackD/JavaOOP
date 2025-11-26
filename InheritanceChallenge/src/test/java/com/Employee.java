package test.java.com;

public class Employee extends Worker {
	
	private long employeeID;
	private String hireDate;
	private static int employeeNo = 1;
	
	public Employee(String name, String birthDate, String hireDate) {
		super(name, birthDate, hireDate);
		this.employeeID = Employee.employeeNo++;
		this.hireDate = hireDate;
	}


	@Override
	public String toString() {
		return String.format("Employee [employeeID=%s, hireDate=%s, toString()=%s]", 
				employeeID, hireDate,
				super.toString());
	}	
}
