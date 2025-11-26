package ie.atu.sw;

public enum Algorithm {

	GZIP 	("gz"),
	ZIP		("zip"),
	NONE	("txt");
	
	private final String extension;

	Algorithm(String extension) {
		this.extension = extension;

	}
	
	public String extension() {
		return extension;
	}
}
