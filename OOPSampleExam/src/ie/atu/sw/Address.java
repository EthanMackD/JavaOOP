package ie.atu.sw;

public record Address(String street, String city, String county, String postalCode) {

	@Override
	public String toString() {
		return String.format("%s, %s, %s %s", street, city, county, postalCode);
	}

}
