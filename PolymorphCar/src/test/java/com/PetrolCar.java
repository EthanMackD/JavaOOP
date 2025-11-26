package test.java.com;

public class PetrolCar extends Car{

	private double avgKmPerLitre;
	private int cylinders;
	
	
	
	public PetrolCar(String description) {
		super(description);
	}



	public PetrolCar(String description, double avgKmPerLitre, int cylinders) {
		super(description);
		this.avgKmPerLitre = avgKmPerLitre;
		this.cylinders = cylinders;
	}



	@Override
	public void startEngine() {
		System.out.printf("Petrol -> All %d cylinders are fired up, Ready!%n", cylinders);
	}



	@Override
	protected void runEngine() {
		System.out.printf("Petrol -> usage exceeds the average: %.2f %n", avgKmPerLitre);

	}
	
	
}
