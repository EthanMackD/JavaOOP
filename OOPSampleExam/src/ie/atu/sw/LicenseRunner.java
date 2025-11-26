package ie.atu.sw;

import java.time.LocalDate;

public class LicenseRunner {

	public static void main(String[] args) {
		 
		        // Create personal information
		        PersonalInfo person = new PersonalInfo(
		            "DOE",
		            "JOHN",
		            LocalDate.of(1978, 12, 5),
		            Country.IRELAND
		        );
		        
		        // Create address
		        Address address = new Address(
		            "123 MAIN ST",
		            "ANYTOWN",
		            "ANYPLACE",
		            "B.A.M"
		        );
		        
		        // Create driving license
		        DrivingLicense license = new DrivingLicense(
		            "00000000X000",
		            person,
		            address,
		            LocalDate.of(2015, 1, 26),
		            LocalDate.of(2025, 1, 20),
		            "ROAD SAFETY AUTHORITY",
		            "000000000"
		        );
		        
		        // Add category endorsements
		        CategoryEndorsement catB = new CategoryEndorsement(
		            LicenseCategory.B,
		            LocalDate.of(2013, 1, 20),
		            LocalDate.of(2025, 1, 20)
		        );
		        license.addCategory(catB);
		        
		        // Use the license
		        System.out.println("License holder: " + 
		            person.getGivenNames() + " " + person.getSurname());
		        System.out.println("License number: " + license.getDocumentNumber());
		        System.out.println("Is expired: " + license.isExpired());
		        System.out.println("Can drive category B: " + 
		            license.canDriveCategory(LicenseCategory.B));
		    }
}
