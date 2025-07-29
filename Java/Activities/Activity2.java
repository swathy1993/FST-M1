package activities;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10, 77, 10, 54, -11, 10};
		int temp=0;
		for(int i:arr)
			
			
		{
			if(i==10)
			{
				temp+=i;
			}
			
		
		if(temp>30)
		{
			break;
		}
		
		}
		
		if(temp==30)
		{
			System.out.println("Sum is equal to 30.");
		}
			
		else
			{
			System.out.println("Sum is not equal to 30");
			}
		
				

	}

}
