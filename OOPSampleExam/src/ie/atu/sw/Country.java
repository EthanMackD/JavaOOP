package ie.atu.sw;

public enum Country {

	IRELAND("IRL", "Ireland"), UK("UK", "United Kingdom"), FRANCE("FR", "France");
	// Add more countries as needed

	private final String code;
	private final String name;

	Country(String code, String name) {
		this.code = code;
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}
}
