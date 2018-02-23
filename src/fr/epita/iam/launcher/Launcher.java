package fr.epita.iam.launcher;
/**
 * @author Ngoc Hieu
 *
 */

import java.io.FileNotFoundException;
import java.util.Scanner;

import fr.epita.iam.business.Activity;
import fr.epita.iam.exceptions.DaoDeleteException;
import fr.epita.iam.exceptions.DaoSearchException;
import fr.epita.iam.exceptions.DaoUpdateException;
import fr.epita.iam.services.Authenticator;



public class Launcher {
	/**
	 * @param args
	 * @throws FileNotFoundException 
	 * @throws DaoUpdateException 
	 * @throws DaoDeleteException 
	 * @throws DaoSearchException 
	 */
 public static void main(String[] args) throws DaoUpdateException, DaoDeleteException, DaoSearchException {
	 
	    System.out.println("WELCOME");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("User name :");
		String userName = scanner.nextLine();
		System.out.println("Password :");
		String password = scanner.nextLine();
		
		if (!Authenticator.authenticate(userName, password)==true) {
            System.out.println("Please enter correct user name or password");
            
		} else {
			System.out.println("Successfully authenticated");
			// We are authenticated
			
			String answer = "";
			while (!"5".equals(answer)) {
           /**
            * crud menu
            */
				System.out.println("1. Create Identity");
				System.out.println("2. Update Identity");
				System.out.println("3. Delete Identity");
				System.out.println("4. Search Identity");
				System.out.println("5. Quit");
				System.out.println("your choice : ");
				


				answer = scanner.nextLine();

				switch (answer) {
				case "1":
					/**
					 * Calling Insert 
					 */
					Activity.insert(scanner);
					break;
				case "2":
					/**
					 * Calling Update 
					 */
					Activity.update(scanner);
					break;
				case "3":
					/**
					 *Calling  Delete 
					 */
                
					Activity.delete(scanner);
					break;

				case "4":
					/**
					 *Calling Search
					 */
					Activity.search(scanner);
					break;

					
				case "5":
					System.out.println("you decided to quit, bye!");
					break;
					
				default:

					System.out.println("unrecognized option : type 1,2,3 or 5 to quit");
					break;
				}

			}

		}

 }
}
