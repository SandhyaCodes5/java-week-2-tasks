package myPackage;

class Vehicle {
	public void start() {
		System.out.println("Vehicle starts.");
	}
	public void drive() {
		System.out.println("Vehicle is driving");
	}
}
class Car extends Vehicle {
	@Override
	public void drive() {
		System.out.println("Car is driving.");
	}
}
class Bike extends Vehicle {
	@Override
	public void drive() {
		System.out.println("Bike is riding.");
	}
}
public class Main {

	public static void main(String[] args) {
        Car c = new Car();
        Bike b = new Bike();
        c.drive();
        c.start();
        b.drive();
        b.start();
	}

}
