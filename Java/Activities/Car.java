package activities;

public class Car {

	String color;
	String transmission;
	int make;
	int tyres = 4;
	int doors = 4;

	public Car(String color, String transmission, int make) {
		this.transmission = transmission;
		this.color = color;
		this.make = make;
	}
	void displayCharacteristics()
	{
		// This displays the values of all the variables
		System.out.println("transmission for car is "+transmission);
		System.out.println("colour is :"+color);
		System.out.println("make is :"+make);
		System.out.println("number of tyres are"+tyres+"for car");
		System.out.println("number of doors are "+doors);
		
		
	}
	void accelarate()
	{
		// This prints "Car is moving forward."
		System.out.println("car is moving forward");
	}
	void brake() {
	// This prints "Car has stopped."
		System.out.println("the car has  stopped");
	}
	
}
