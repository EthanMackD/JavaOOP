package test.java.com;

public class Car {
	
	private String description;
	
	public Car(String description) {
		super();
		this.description = description;
	}

	public void startEngine() {
		System.out.println(description + " engine has been started");
	}
	
	public void drive() {
		System.out.println(getClass().getSimpleName() + " is now driving");
		runEngine();
	}
	
	protected void runEngine() {
		System.out.println(description + " engine is running");
	}

	
}
