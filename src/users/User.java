package users;

public class User {

	protected String login;
	protected String passwd;
	protected String email;
	
	protected User() {
		
	}
	
	public static User userFactory(String login, String passwd, String email) {
		if (isValidPasswd(passwd)) 
		{
			User user = new User();
			user.setPassword(passwd);
			user.setLogin(login);
			user.setEmail(email);
			return user;
		}			
		return null;
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * Constraints:
	 * 1 - A password must have 4 char or more
	 * @param senha
	 */
	public void setPassword(String senha) 
	{
		if (isValidPasswd(senha))
			this.passwd = senha;
	}
	
	protected static boolean isValidPasswd(String senha) 
	{
		
		boolean hasDigit = false;	
		boolean hasUpper = false;
		boolean hasLower = false;
		boolean hasFour = false;
		
		for (char c:senha.toCharArray()) 
		{
			if ( Character.isDigit(c) )
				hasDigit = true;
			if ( Character.isUpperCase(c))
				hasUpper = true;
			if ( Character.isLowerCase(c) )
				hasLower = true;
		}
		if ( senha.length() >= 4 )
			hasFour = true;
		
		return (hasDigit && hasLower && hasUpper && hasFour); 
		
	}
}
