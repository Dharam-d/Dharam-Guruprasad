package employeedetails; 
import java.util.Scanner;
class EmployeeInsuranceAssignment {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Employee Details:");
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Gender (M/F): ");
        char gender = scanner.next().charAt(0);

        System.out.print("Age: ");
        int age = scanner.nextInt();

        System.out.print("Salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.print("Designation: ");
        String designation = scanner.nextLine();

        String insuranceScheme = assignInsuranceScheme(salary, designation);

        System.out.println("\nEmployee Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Designation: " + designation);
        System.out.println("Insurance Scheme: " + insuranceScheme);

        scanner.close();
    }

    private static String assignInsuranceScheme(double salary, String designation) {
        if (salary < 5000) {
            return "No Scheme";
        } else if (salary >= 5000 && salary < 20000 && designation.equalsIgnoreCase("System Associate")) {
            return "Scheme C";
        } else if (salary >= 20000 && salary < 40000 && designation.equalsIgnoreCase("Programmer")) {
            return "Scheme B";
        } else if (salary >= 40000 && designation.equalsIgnoreCase("Manager")) {
            return "Scheme A";
        } else {
            return "No Scheme";
        }
    }
}
