package userinput;
import java.util.Scanner;
public class UserInputString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		/* Difference between next() and nextLine() is 
		next() will take only first word from sentence. 
		nextLine() takes will take complete sentence */
		
		System.out.println("Enter the String: ");
		String x=s.nextLine();
		System.out.println("The result is: ");
		System.out.print(x);
		s.close();
	}

}
