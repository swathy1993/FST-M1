package activities;

import java.util.Arrays;

public class Activity4 {

	public void sort(int[] arr) 
	{
		
	for(int i=1;i<arr.length;i++)
	{
		int j=i-1;
		int key=arr[i];
		while(j>=0&&key<arr[j])
		{
			arr[j+1]=arr[j];
			--j;
		}
		arr[j+1]=key;
	}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Activity4 act = new Activity4();
		int[] arr1 = { 9, 5, 1, 4, 3 };
		act.sort(arr1);
		System.out.println("sorted array is");
		for(int k=0;k<arr1.length;k++)
		{
			System.out.println(arr1[k]);
		}
		System.out.println(Arrays.toString(arr1));
	}

}
