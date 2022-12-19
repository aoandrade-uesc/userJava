package users;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestUsers {

	@Test
	void testCreateUser() {
		Users users = new Users();
		assertEquals(0, users.userList.size() );
		
		User user1 = new User();
		user1.setLogin("Jose");
		users.createUser(user1);
		assertEquals(1, users.userList.size() );
		

		User user2 = new User();
		user1.setLogin("Pedro");
		users.createUser(user2);
		assertEquals(2, users.userList.size() );
		

		User user3 = new User();
		user1.setLogin("Jose");
		users.createUser(user3);
		assertEquals(2, users.userList.size() );
	}

}
