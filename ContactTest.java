package Project1;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.junit.jupiter.api.*;
import static org.junit.Assert.assertEquals;





public class ContactTest {
	
	String improperContactId = "012345678901";
	String improperAddress = "This address is invalid because it contains to many characters";
	String improperName = "This name is not valid because it contains to many characters";
	String improperPhoneNumber = "12345678901234567890";
	
	
	
	@Test
	@DisplayName("Validates a contact id that has 10 characters")
	void validatesContactId() {
		contact one = new contact("0123456789", "Naruto", "Uzumaki", "111-222", "Hidden Leaf");
		assertEquals("123456789", one.getContactID());
		
	}
	

	@Test
	@DisplayName("Validates a First and last name that meet the required criteria")
	void validatesFirstName() {
		contact one = new contact("0123456789", "Naruto", "Uzumaki", "111-222", "Hidden Leaf");
		assertEquals("Naruto", one.getFirstName());
		assertEquals("Uzumaki", one.getLastName());
		
	}
	
	@Test
	@DisplayName("Validates a phonenumber that meet the required criteria")
	void validatesPhoneNumber() {
		contact one = new contact("0123456789", "Naruto", "Uzumaki", "111-222", "Hidden Leaf");
		assertEquals("111-222", one.getPhoneNumber());
	}

	
	@Test
	@DisplayName("Validates an address that meets the required criteria")
	void validatesAddress() {
		contact one = new contact("0123456789", "Naruto", "Uzumaki", "111-222", "Hidden Leaf");
		assertEquals("Hidden Leaf", one.getAddress());
		
		
	}
	
	@Test
	@DisplayName("Checks to make sure the program throws an error when all entries exceed character limits")
	void invalidArguments() {
		assertThrows(IllegalArgumentException.class, () ->{
		contact one = new contact(improperContactId, improperName,improperName,improperPhoneNumber, improperAddress);
		
	});
	
	}
	
	@Test
	@DisplayName("Checks to make sure the program throws an error when a blank contactId is entered")
	void invalidEmptyContactId() {
		assertThrows(IllegalArgumentException.class, () ->{
		contact one = new contact("", "Johnny","Bravo","123-456", "Aron city");
		
	});
	
	}
	
	@Test
	@DisplayName("Checks to make sure the program throws an error when a blank firstName is entered")
	void invalidEmptyFirstName() {
		assertThrows(IllegalArgumentException.class, () ->{
		contact one = new contact("012345678", "","Bravo","123-456", "Aron city");
		
	});
	
	}
	
	@Test
	@DisplayName("Checks to make sure the program throws an error when a blank lastName is entered")
	void invalidEmptyLastName() {
		assertThrows(IllegalArgumentException.class, () ->{
		contact one = new contact("012345678", "Johny","","123-456", "Aron city");
		
	});
	
	}
	
	
	@Test
	@DisplayName("Checks to make sure the program throws an error when a blank PhoneNumber is entered")
	void invalidEmptyPhoneNumber() {
		assertThrows(IllegalArgumentException.class, () ->{
		contact one = new contact("012345678", "Johny","Bravo","", "Aron city");
		
	});
	
	}
	
	@Test
	@DisplayName("Checks to make sure the program throws an error when a blank address is entered")
	void invalidEmptyAddress() {
		assertThrows(IllegalArgumentException.class, () ->{
		contact one = new contact("012345678", "Johny","Bravo","123-456", "");
		
	});
	
	}
	



	



}
