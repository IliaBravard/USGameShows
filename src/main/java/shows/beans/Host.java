package shows.beans; // The package where this bean class is located at

/**
 * @author Ilia Bravard - igbravard
 * CIS175 - Fall 2022
 * Oct 20, 2022
 */

// Including the needed import
import javax.persistence.Embeddable;

@Embeddable // Indicates that this class is meant to be embedded inside other entities
public class Host {
	private String firstName; // The host's first name
	private String lastName; // The host's last name
	
	/**
	 * This is the default, no argument constructor.
	 */
	public Host() {
	}
	
	/**
	 * This is the nondefault constructor that sets all fields of this bean.
	 * @param fName - the host's first name
	 * @param lName - the host's last names
	 */
	public Host(String fName, String lName) {
		setFirstName(fName);
		setLastName(lName);
	}
	
	// Generating the needed accessors and mutators
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * This method prints the value details for each field used in this
	 * class/entity, if any.
	 * 
	 * @return a string line showcasing the values of each field
	 */
	@Override
	public String toString() {
		return "Host --> First Name: " + firstName + ", Last Name: " + lastName;
	}
}