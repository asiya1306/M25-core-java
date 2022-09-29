package org.tnsindia.abstraction;

class B
{

	public String dob="13-06-2002";
	public void display()
	{
		System.out.println("The DOB is: "+dob);
	}
}

public class AbstractionPublic {

	public static void main(String[] args) {
		B objb=new B();
		objb.display();
	}

}
