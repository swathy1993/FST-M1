package activities;

public class Activity6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Plane plane=new Plane(10);
		plane.onboard("Arya");
		plane.onboard("sajan");
		plane.takeOff();
		Thread.sleep(5000);
		plane.getPassengers();
		plane.getLastTimeLanded();

	}

}
