package ie.atu.sw;

import java.time.LocalDate;

public class CategoryEndorsement {

	private LicenseCategory category;
    private LocalDate validFrom;
    private LocalDate validUntil;
    
    public CategoryEndorsement(LicenseCategory category, 
                              LocalDate validFrom, LocalDate validUntil) {
        this.category = category;
        this.validFrom = validFrom;
        this.validUntil = validUntil;
    }
    
    // Getters
    public LicenseCategory getCategory() { return category; }
    public LocalDate getValidFrom() { return validFrom; }
    public LocalDate getValidUntil() { return validUntil; }
    
    // Check if this endorsement is currently valid
    public boolean isValid() {
        LocalDate now = LocalDate.now();
        return !now.isBefore(validFrom) && !now.isAfter(validUntil);
    }
}
