package test.java.com;

public class Adventure extends Movie {

	//Constructor using Superclass
	
	public Adventure(String title) {
		super(title);
	}

	//Implement override methods from Movie class
	@Override
	public void watchMovie() {
		super.watchMovie();
		
		System.out.printf(".. %s%n".repeat(3), 
				"Pleasant Scene", 
				"Scary Music", 
				"Something Bad Happens");
	}
	
	
}
