package fourthone;
import java.util.Scanner;
public class Choice {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		boolean exit= false;
		while (!exit) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add the String to itself");
            System.out.println("2. Replace odd positions with #");
            System.out.println("3. Remove duplicate characters in the String");
            System.out.println("4. Change odd characters to upper case");
            System.out.println("5. Exit");

            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter a string: ");
                    String inputString1 = scanner.nextLine();
                    String doubledString = inputString1 + inputString1;
                    System.out.println("Result: " + doubledString);
                    break;
                case 2:
                    System.out.print("Enter a string: ");
                    String inputString2 = scanner.nextLine();
                    String replacedString = replaceOddPositions(inputString2);
                    System.out.println("Result: " + replacedString);
                    break;
                case 3:
                    System.out.print("Enter a string: ");
                    String inputString3 = scanner.nextLine();
                    String withoutDuplicates = removeDuplicates(inputString3);
                    System.out.println("Result: " + withoutDuplicates);
                    break;
                case 4:
                    System.out.print("Enter a string: ");
                    String inputString4 = scanner.nextLine();
                    String upperCasedOdd = changeOddToUpperCase1(inputString4);
                    System.out.println("Result: " + upperCasedOdd);
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 to 5.");
                    break;
            }
        }
		
    }
}



