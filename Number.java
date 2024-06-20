package negative.positive;
import java.util.Scanner;
public class Number {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value");
		int num=sc.nextInt();
		if(num<0)
		{
			System.out.println("Negative");
		}
		else
		{
			System.out.println("positive");
		}
	}

}
