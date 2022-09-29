package org.tnsindia.abstraction;

class C {
	String VehicleType;
}
public class AbstractionDefault {

	public static void main(String[] args) {
		C objc = new C();
		objc.VehicleType = "Train";
		System.out.println("Vehicle is : " +objc.VehicleType);

	}

}
