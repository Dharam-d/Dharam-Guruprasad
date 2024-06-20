package reverse;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		String rev="";
		for(int i=name.length()-1; i>=0; i--)
		{
			rev=rev+name.charAt(i);
		}
		if(name.contentEquals(rev))
		{
			System.out.println(name+" Palindrome");
		}
		else
		{
			System.out.println(name+" Not a palindrome");
		}
 
	}

}
