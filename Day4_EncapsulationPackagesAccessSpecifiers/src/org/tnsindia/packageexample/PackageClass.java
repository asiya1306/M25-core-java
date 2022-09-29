package org.tnsindia.packageexample;
import java.util.Scanner;
import org.tnsindia.packagedemo.*;
public class PackageClass {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str1=s.nextLine();
		
		PackageDemo d=new PackageDemo();
		d.str=str1;
		d.display();
		s.close();
	}

}
