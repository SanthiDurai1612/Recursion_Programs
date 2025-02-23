package exercisepgm_1;

import java.util.Arrays;

public class QuickSort {

    public static int partition(int[] arr,int left,int right)
    {
    	int pivot=arr[left];
    	
    	int i=left+1;
    	int j=right;
    	while(i<=j)
    	{
    		while(i<=right && arr[i]<pivot)
    		{
    			i++;
    		}
    		while(arr[j]>=pivot && j>left) {
    			j--;
    		}
    		
    		
    		if(i<j)
    		{
    			swaping(i,j,arr);
    		}
    	}
    	swaping(left,j,arr);
    	return j;
    	}
    
    public static void quicksort(int[] arr,int left,int right)
    {
    	if(left<=right)
    	{
    		int partitionindex=partition(arr,left,right);
    		quicksort(arr,left,partitionindex-1);
    		quicksort(arr,partitionindex+1,right);
    	}
    }
    public static void swaping(int i,int j,int[] arr) {
    	int temp=arr[i];
    	arr[i]=arr[j];
    	arr[j]=temp;
    }
        

    public static void main(String[] args) {
        int[] arr = {4, 5, 7, 1, 2};
        int left=0;
        int right=arr.length-1;
        quicksort(arr,left,right);
        System.out.print(Arrays.toString(arr));
    }
}
