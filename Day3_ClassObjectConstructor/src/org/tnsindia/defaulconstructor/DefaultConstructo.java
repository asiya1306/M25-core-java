package org.tnsindia.defaulconstructor;

class Student
{
	String name;
	int age;
	
	void displayInfo()
	{
		System.out.println("Name is : "+ name);
		System.out.println("Age is : "+ age);
	}
	
	Student()
	{
		name = "asiya";
		age = 21;
	}
}

public class DefaultConstructo {

	public static void main(String[] args) {
		Student obj=new Student();
		obj.displayInfo();

	}

}
