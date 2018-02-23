package fr.epita.iam.services;

public class Authenticator {
	/**
	 * Checking the authentication
	 * @param userName
	 * @param password
	 * @return
	 * @author Ngoc Hieu
	 */
	
public static boolean authenticate(String userName, String password)
{
		
		return "hieu".equals(userName) && "hieu".equals(password);
}

}
