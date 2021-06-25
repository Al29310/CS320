package Project1;
import java.util.*;

public class ContactService {
	private List<contact> contactList = new ArrayList<>();
	
	
	public static String generateUUID() {
		String UUID = "";
		Random rand = new Random();
		for(int i = 0; i < 10; i++) {
			int random = rand.nextInt(10);
			UUID = UUID + String.valueOf(random);
		}
		
		
		
		return UUID;
		
	}
	
	public void addContact(String firstName, String lastName, String phoneNumber, String address) {
		String UUID = generateUUID();
		contact newContact = new contact(UUID, firstName, lastName, phoneNumber, address);
		contactList.add(newContact);
		
	}
	
	public void deleteContact(String id) {
		for(contact contact : contactList) {
			if(contact.getContactID().equals(id)) {
				contactList.remove(contact);
			}
		}
		
	}
		
	
	public void updateFirstName(String id, String newName) throws IllegalArgumentException {
			for(contact contact : contactList) {
				if(contact.getContactID().equals(id))
				{
					if(newName.length() > 10 || newName.isEmpty()) {
						throw new IllegalArgumentException("Invalid entry");
					}else {
						contact.setFirstName(newName);
					}
				}
			}
	}
			
			
	public void updateLastName(String id, String newName)throws IllegalArgumentException {
				for(contact contact : contactList) {
					if(contact.getContactID().equals(id)) {
						if(newName.length() > 10 || newName.isEmpty()) {
							throw new IllegalArgumentException("Invalid entry");
							
						}else {
							contact.setLastName(newName);;
			}
		}
	}
}
		
	public void updatePhoneNumber(String id, String phoneNumber) throws IllegalArgumentException {
		for(contact contact : contactList) {
			if(contact.getContactID().equals(id)) {
				if(phoneNumber.length() != 10 || phoneNumber.isEmpty()) {
			
					throw new IllegalArgumentException("Invalid entry");
			}else {
				contact.setPhoneNumber(phoneNumber);
			}
	   }
			
    }	
		
  }

public void updateAddress(String id, String newAddress)throws IllegalArgumentException {
	for(contact contact : contactList) {
		if(contact.getContactID().equals(id)) {
			if(newAddress.length() > 30 || newAddress.isEmpty()) {
				throw new IllegalArgumentException("Invalid entry");
		
			
		}else {
			contact.setAddress(newAddress);
		}
   }
		

	
}	
	
}


public List<contact> getList(){
	return contactList;
}

public String getIdFromList(int index) {
	if(index < contactList.size()) {
		return contactList.get(index).getContactID();
	}
	return null;
}






}


			
			
	

