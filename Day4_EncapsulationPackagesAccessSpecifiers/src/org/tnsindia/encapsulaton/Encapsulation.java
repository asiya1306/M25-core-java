package org.tnsindia.encapsulaton;

public class Encapsulation {

	public static void main(String[] args) {
		HDFC h = new HDFC();
		h.setPin(10001);
		System.out.println("The pin is: "+ 	h.getPin());

	}
}
