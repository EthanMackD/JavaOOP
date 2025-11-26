package test.java.com;

public class ScienceFiction extends Movie {

	//Constructor using Superclass
	
	public ScienceFiction(String title) {
		super(title);
	}

	//Implement override methods from Movie class
	@Override
	public void watchMovie() {
		super.watchMovie();
		
		System.out.printf(".. %s%n".repeat(3), 
				"Bad Aliens do bad stuff", 
				"Space guys chase aliens", 
				"Planet blows up");
	}
}
