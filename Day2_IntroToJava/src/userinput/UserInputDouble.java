package userinput;
import java.util.Scanner;

public class UserInputDouble {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("Enter decimal value for x: ");
		double x=s.nextDouble();
		System.out.println("The result is: ");
		System.out.print(x);
	}

}
