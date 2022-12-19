package users;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestUser {

	@Test
	void testSetSenha() {		
		
	}
	
	@Test
	void testIsValidPswd() {

		
		assertTrue(User.isValidPasswd("Abc123"));
		assertFalse(User.isValidPasswd("Ab3"));
		assertFalse(User.isValidPasswd("ABC123"));
		assertFalse(User.isValidPasswd("abcd"));
		assertFalse(User.isValidPasswd("1123"));
	}

	@Test
	void testUserFactory() {
		User usr = User.userFactory("Fulano", "Fulano123", "fulano@sicrano.com");
		assertNotNull(usr);
		usr = User.userFactory("Sicrano", "1234", "sicrano@senhafacil.com");
		assertNull(usr);
	}
	
}
