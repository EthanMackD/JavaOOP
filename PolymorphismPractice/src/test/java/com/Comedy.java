package test.java.com;

public class Comedy extends Movie {

	//Constructor using Superclass
	
	public Comedy(String title) {
		super(title);
	}

	//Implement override methods from Movie class
	@Override
	public void watchMovie() {
		super.watchMovie();
		
		System.out.printf(".. %s%n".repeat(3), 
				"Something funny happens", 
				"Something even funnier happens", 
				"Happy ending");
	}
	
	
}

