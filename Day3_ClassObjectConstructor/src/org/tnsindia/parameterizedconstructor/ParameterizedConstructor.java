package org.tnsindia.parameterizedconstructor;

class Student
{
	String name;
	int age;
	
	Student(String name, int age)
	{
		System.out.println("name is : " + name);
		System.out.println("age is : " + age);
	}
}

public class ParameterizedConstructor {

	public static void main(String[] args) {
		Student s1 = new Student("asiya", 21);
		Student s2 = new Student("Fiza", 22);
		
	}

}
