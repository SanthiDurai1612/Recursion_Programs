package exercisepgm_1;

import java.util.Vector;

public class MergeSort {
	
	public static void merge(int[] arr,int low, int mid,int high)
	{
		Vector<Integer> res=new Vector<Integer>();
		int left=low;
		int right=mid+1;
		while(left<=mid && right<=high)
		{
			if(arr[left]<arr[right])
			{
				res.add(arr[left]);
				left++;
			}
			else
			{
				res.add(arr[right]);
				right++;
			}
		}
		while(left<=mid)
		{
			res.add(arr[left]);
			left++;
		}
		while(right<=high)
		{
			res.add(arr[right]);
			right++;
		}
		System.out.print(res);
		for (int i = 0; i < res.size(); i++) {
			arr[low + i] = res.get(i);
		}
	
	}

	public static void split(int[] arr,int low,int high)
	{
		if(low==high)
		{
			return;
		}
		int mid=(low+high)/2;
		split(arr,low,mid);
		split(arr,mid+1,high);
		merge(arr,low,mid,high);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,1,2,4,1};
		split(arr,0,arr.length-1);
		for (int num : arr) {
			System.out.print(num + " ");
		}
		
	}

}
