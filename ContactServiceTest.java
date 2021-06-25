package Project1;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.junit.jupiter.api.*;


public class ContactServiceTest {
	
	
	@Test
	@DisplayName("Creates contacts with unique id's")
	void addContact() {
		ContactService service = new ContactService();
		service.addContact("Johnny", "Bravo", "0123456789", "Aron city");
		service.addContact("Naruto", "Uzumaki", "0123456789", "Hidden Leaf");
		assertNotEquals(service.getIdFromList(0), service.getIdFromList(1));
		
	}
	
	@Test
	@DisplayName("Deletes Contacts from list")
	void validateDeleteFunction() {
		ContactService service = new ContactService();
		service.addContact("Johnny", "Bravo", "0123456789", "Aron city");
		service.addContact("Naruto", "Uzumaki", "0123456789", "Hidden Leaf");
		assertEquals(2, service.getList().size());
		service.deleteContact(service.getIdFromList(0));
		assertEquals(1, service.getList().size());
		
	}
	
	@Test
	@DisplayName("Updates address, phone number and first name")
	void updateNameAndOtherValues() {
		ContactService service = new ContactService();
		service.addContact("Nate", "Diaz", "0123456789", "Stockton");
		service.updateAddress(service.getIdFromList(0), "Arizona");
		service.updateFirstName(service.getIdFromList(0), "Nick");
		service.updatePhoneNumber(service.getIdFromList(0), "1234567890");
		assertEquals(service.getList().get(0).getAddress() , "Arizona");
		assertEquals(service.getList().get(0).getFirstName(), "Nick");
		assertEquals(service.getList().get(0).getPhoneNumber(), "1234567890");
			
		
		
		}
	
	
	@Test
	@DisplayName("Improperly updating a phoneNumber")
	void improperUpdate() throws Exception{
		assertThrows(IllegalArgumentException.class, () ->{
		ContactService service = new ContactService();
		service.addContact("Nick", "Diaz", "0123456789", "Stockton");
		service.updatePhoneNumber(service.getIdFromList(0), "012345678901");
		
		});
		
		
	}
	
	@Test
	@DisplayName("Improperly updating a First Name")
	void improperUpdateFirstName() throws Exception{
		assertThrows(IllegalArgumentException.class, () ->{
		ContactService service = new ContactService();
		service.addContact("Nick", "Diaz", "0123456789", "Stockton");
		service.updateFirstName(service.getIdFromList(0), "This is not a valid entry");
		
		});
		
		
	}
	
	@Test
	@DisplayName("Improperly updating a First Name")
	void improperUpdateLastName() throws Exception{
		assertThrows(IllegalArgumentException.class, () ->{
		ContactService service = new ContactService();
		service.addContact("Nick", "Diaz", "0123456789", "Stockton");
		service.updateLastName(service.getIdFromList(0), "This is not a valid entry");
		
		});
		
		
	}
	
	@Test
	@DisplayName("Improperly updating a First Name")
	void improperUpdateAddress() throws Exception{
		assertThrows(IllegalArgumentException.class, () ->{
		ContactService service = new ContactService();
		service.addContact("Nick", "Diaz", "0123456789", "Stockton");
		service.updateAddress(service.getIdFromList(0), "The following input is to long and will throw"
				+ " an exception");
		
		});
		
		
	}
	
	
	

}
	

