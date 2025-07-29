package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Plane {
private int max;
private List<String> passengers=new ArrayList<>(); 
private Date takeoffTime;
private Date lastTimeLanded;

public Plane(int i) {
	// TODO Auto-generated constructor stub
	this.max=max;
}

public void onboard(String passengerName) {
	// TODO Auto-generated method stub
	if(passengers.size()>= max) {
	passengers.add(passengerName);
	}
	else
		System.out.println("flight is full");
}

public void takeOff() {
	// TODO Auto-generated method stub
	
	takeoffTime=new Date();
	System.out.println(takeoffTime);
}
public void land() {
    this.lastTimeLanded = new Date();
    this.passengers.clear();
}

public Date getLastTimeLanded() {
    return lastTimeLanded;
}

public List<String> getPassengers() {
    return passengers;
}




}
