package fifthone;
import java.util.Scanner;
public class PositiveString {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
	        boolean continueChecking = true;

	        while (continueChecking) 
	        {
	            System.out.print("Enter a string to check (or 'exit' to quit): ");
	            String inputString = scanner.nextLine().trim();

	            if (inputString.equalsIgnoreCase("exit")) 
	            {
	                continueChecking = false;
	                System.out.println("Exiting the program. Goodbye!");
	                break;
	            }
	            if (isPositiveString1(inputString)) 
	            {
	                System.out.println("\"" + inputString + "\" is a positive string.");
	            } 
	            else 
	            {
	                System.out.println("\"" + inputString + "\" is not a positive string.");
	            }
	        }
	        scanner.close();

	}
	public static boolean isPositiveString1(String s) {
        // Convert the string to lowercase for case-insensitive comparison
        s = s.toLowerCase();

        // Check if characters are in alphabetical order
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) > s.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
