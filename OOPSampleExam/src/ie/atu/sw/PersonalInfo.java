package ie.atu.sw;

import java.time.LocalDate;

public class PersonalInfo {
	
	private String surname;
    private String givenNames;
    private LocalDate dateOfBirth;
    private Country placeOfBirth;
    
    // Constructor
    public PersonalInfo(String surname, String givenNames, 
                       LocalDate dateOfBirth, Country placeOfBirth) {
        this.surname = surname;
        this.givenNames = givenNames;
        this.dateOfBirth = dateOfBirth;
        this.placeOfBirth = placeOfBirth;
    }
    
    // Getters
    public String getSurname() { return surname; }
    public String getGivenNames() { return givenNames; }
    public LocalDate getDateOfBirth() { return dateOfBirth; }
    public Country getPlaceOfBirth() { return placeOfBirth; }
    
    // Setters
    public void setSurname(String surname) { this.surname = surname; }
    public void setGivenNames(String givenNames) { this.givenNames = givenNames; }
}


