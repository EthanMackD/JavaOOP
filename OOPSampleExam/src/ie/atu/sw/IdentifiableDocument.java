package ie.atu.sw;

import java.time.LocalDate;

public interface IdentifiableDocument {
	
	String getDocumentNumber();
    LocalDate getIssueDate();
    LocalDate getExpiryDate();
    boolean isExpired();

}
