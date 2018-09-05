import java.util.Scanner;
public class WhoGoesThere {
	public static void main(String[] args){
		int age = 0;
		String firstName;
		String lastName;
		Scanner inputDevice = new Scanner(System.in);
		
		System.out.println("How old are you? ");
			age = inputDevice.nextInt();
			inputDevice.nextLine();
		System.out.println("What is your first name? ");
			firstName = inputDevice.nextLine();
		System.out.println("What is your last name? ");
			lastName = inputDevice.nextLine();
			
		System.out.println("As long as you are over the age of " + (age-10) + " then");
		System.out.println("you are free to pass " + firstName + " " + lastName + "!");
		
	}
}