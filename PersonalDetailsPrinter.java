package persondetails;
import java.util.Scanner;
public class PersonalDetailsPrinter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Person Details:");

        System.out.print("First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Gender (M/F): ");
        char gender = scanner.next().charAt(0);

        System.out.print("Age: ");
        int age = scanner.nextInt();

        System.out.print("Weight: ");
        double weight = scanner.nextDouble();

        System.out.println("\nPerson Details:");
        System.out.println("____________\n");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);

        scanner.close();
    }
}
