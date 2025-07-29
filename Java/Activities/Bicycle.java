package activities;

public class Bicycle implements BicycleOperations, BicycleParts {
	private int gears;
	private int speed;
	int currentSpeed;

	public Bicycle(int gears,int currentspeed)
	{
		this.gears=gears;
		this.speed=currentspeed;
	}

	@Override
	public void applyBrake(int decrement) {
		// TODO Auto-generated method stub
		currentSpeed -= decrement;
        System.out.println("Current speed: " + currentSpeed);
    
	}

	@Override
	public void speedUp(int increment) {
		// TODO Auto-generated method stub
		currentSpeed += increment;
        System.out.println("Current speed: " + currentSpeed);
	}
	public String bicycleDesc()
	
	{
		return("number of gears and the maxSpeed of the bicycle"+gears+maxSpeed);
	}

}
