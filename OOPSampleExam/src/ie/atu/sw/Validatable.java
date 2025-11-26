package ie.atu.sw;

import java.util.List;

public interface Validatable {
	
	boolean validate();
    List<String> getValidationErrors();

}
