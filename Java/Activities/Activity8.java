package activities;

public class Activity8 {

	public static void main(String[] args) {
		try {
			
		
		String str = null;
		// TODO Auto-generated method stub
		CustomException cs=new CustomException(str);
		cs.exceptionTest(null);
		
        cs.exceptionTest("Won't execute");
    } 
	catch(CustomException cm) {
        System.out.println("Inside catch block: " + cm.getMessage());
    }

	}
}


