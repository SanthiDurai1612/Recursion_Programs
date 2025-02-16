package exercisepgm_1;

import java.util.Arrays;

public class ArrayReverseUsingRecursion {
	
	public static void reverse(int[] arr,int i)
	{
	
		int n=arr.length;
		
		if(i>=n/2)
		{
			return;
		}
		int temp;
		temp=arr[i];
		arr[i]=arr[n-i-1];
		arr[n-i-1]=temp;
		
		reverse(arr,i+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] arr= {8,7,5,9};
     int i=0;
     reverse(arr,i);
     System.out.print(Arrays.toString(arr));
     
	}

}
