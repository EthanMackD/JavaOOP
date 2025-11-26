package ie.atu.sw;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DrivingLicense implements IdentifiableDocument, Validatable{
	
	    // Private fields (encapsulation)
	    private String licenseNumber;
	    private PersonalInfo personalInfo;
	    private Address address;
	    private LocalDate issueDate;
	    private LocalDate expiryDate;
	    private String issuingAuthority;
	    private String driverNumber;
	    private List<CategoryEndorsement> categories;
	    
	    // Simple constructor with all essential fields
	    public DrivingLicense(String licenseNumber, PersonalInfo personalInfo, 
	                         Address address, LocalDate issueDate, 
	                         LocalDate expiryDate, String issuingAuthority,
	                         String driverNumber) {
	        this.licenseNumber = licenseNumber;
	        this.personalInfo = personalInfo;
	        this.address = address;
	        this.issueDate = issueDate;
	        this.expiryDate = expiryDate;
	        this.issuingAuthority = issuingAuthority;
	        this.driverNumber = driverNumber;
	        this.categories = new ArrayList<>();
	    }
	    
	    // Getters (providing read access to private data)
	    @Override
	    public String getDocumentNumber() { return licenseNumber; }
	    
	    @Override
	    public LocalDate getIssueDate() { return issueDate; }
	    
	    @Override
	    public LocalDate getExpiryDate() { return expiryDate; }
	    
	    @Override
	    public boolean isExpired() {
	        return LocalDate.now().isAfter(expiryDate);
	    }
	    
	    public PersonalInfo getPersonalInfo() { return personalInfo; }
	    public Address getAddress() { return address; }
	    public String getDriverNumber() { return driverNumber; }
	    public String getIssuingAuthority() { return issuingAuthority; }
	    public List<CategoryEndorsement> getCategories() { return categories; }
	    
	    // Method to add a category endorsement
	    public void addCategory(CategoryEndorsement endorsement) {
	        categories.add(endorsement);
	    }
	    
	    // Method to check if license holder can drive a specific category
	    public boolean canDriveCategory(LicenseCategory category) {
	        for (CategoryEndorsement endorsement : categories) {
	            if (endorsement.getCategory() == category && endorsement.isValid()) {
	                return true;
	            }
	        }
	        return false;
	    }
	    
	    // Simple validation method
	    public boolean isValid() {
	        if (licenseNumber == null || licenseNumber.isEmpty()) {
	            return false;
	        }
	        if (personalInfo == null || address == null) {
	            return false;
	        }
	        if (issueDate != null && expiryDate != null && 
	            issueDate.isAfter(expiryDate)) {
	            return false;
	        }
	        return true;
	    }

		@Override
		public boolean validate() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public List<String> getValidationErrors() {
			// TODO Auto-generated method stub
			return null;
		}
	}

