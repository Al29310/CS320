package Project1;

public class contact {
	private String contactID;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	
	public boolean checkIDandName(String info) {
		if(info.isEmpty() || info.length() > 10) {
			return false;
			
		}
		
		return true;
	}
	
	public boolean checkPhoneNumber(String number) {
		if(number.isEmpty() || number.length() != 10) {
			return false;
			
		}
		
		return true;
	}
		
	public boolean checkAddress(String address) {
		if(address.isEmpty() || address.length() > 30) {
			return false;
			
		}
		
		return true;
	}

		
	contact(String contactID, String firstName, String lastName, 
			String phoneNumber, String address ){
		
		if(checkIDandName(contactID)) {
			this.contactID = contactID;
		}
		else {
			throw new IllegalArgumentException("The contact id is either null or to long");
		}
		
		if(checkIDandName(firstName)) {
			this.firstName = firstName;
		}
		else {
			throw new IllegalArgumentException("The firstname entry is either null or to long");
		}
		
		if(checkIDandName(lastName)){
			this.lastName = lastName;
		}
		else {
			throw new IllegalArgumentException("The lastname entry is either null or to long");
		}
		
		if(checkPhoneNumber(phoneNumber)) {
			this.phoneNumber = phoneNumber;
		}
		else {
			throw new IllegalArgumentException("The PhoneNumber is either null or to long");
		}
		
		if(checkAddress(address)) {
			this.address = address;
		}
		else {
			throw new IllegalArgumentException("The address entered is either null or to long");
		}
}

	
	
	public String getContactID() {
		return contactID;
	}
	
	
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		
			this.address = address;
	}
}
