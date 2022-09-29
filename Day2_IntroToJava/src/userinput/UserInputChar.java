package userinput;
import java.util.Scanner;

public class UserInputChar {

	public static void main(String[] args) {
//		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of x: ");
		char x=s.next().charAt(4);
		System.out.println("The result is: ");
		System.out.print(x);
	}


}
