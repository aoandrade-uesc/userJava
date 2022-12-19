package users;

import java.util.ArrayList;

public class Users {

	protected ArrayList<User> userList; 

	public Users() {
		userList = new ArrayList<User>();
	}
	/**
	 * 
	 * @param user
	 */
	public void createUser(User user) {
		
		for (User u:userList) 
		{
			if( u.getLogin() == user.getLogin() )
				return;
		}
		
		userList.add(user);
	}

	public ArrayList<User> getUserList() {
		return userList;
	}
}
