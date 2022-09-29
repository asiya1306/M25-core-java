package org.tnsindia.abstraction;
class A {
	
	private float salary;

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	 
}

public class AbstractionPrivate {

	public static void main(String[] args) {
		A obja = new A();
		obja.setSalary(30000);
		System.out.println("Salary is: " +obja.getSalary());

	}

}

