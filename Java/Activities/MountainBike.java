package activities;


	class MountainBike extends Bicycle {

	    
	    public int seatHeight;

	    
	    public MountainBike(int gears, int currentSpeed, int startHeight) {
	        //Invoking base-class(Bicycle) constructor
	        super(gears, currentSpeed);
	        seatHeight = startHeight;
	    }

	    // the MountainBike subclass adds one more method
	    public void setHeight(int newValue) {
	        seatHeight = newValue;
	    }

	    public String  bicycleDesc() {
	        
			return ((super.bicycleDesc()+ "\nSeat height is " + seatHeight)) ;
	    }  
	

}
