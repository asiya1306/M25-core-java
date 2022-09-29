package userinput;
import java.util.Scanner;

public class UserInputInt {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of x: ");
		int x=s.nextInt();
		System.out.println("The result is: ");
		System.out.print(x);
		s.close();

	}

}
