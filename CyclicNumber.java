package exercisepgm_1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CyclicNumber {

	
	public static Set<Integer> cyclic(int[] arr,int k,Set<Integer> cyclics)
	{
		int[] temp=new int[arr.length];
		if(k==arr.length)
		{
			
			return cyclics;
		}
		for(int i=0;i<arr.length;i++)
		{
			temp[i]=arr[i];
		}
		reverse(temp,0,arr.length-1);
		reverse(temp,0,k-1);
		reverse(temp,k,arr.length-1);
		StringBuilder res=new StringBuilder();
		for(int num:temp)
		{
			res.append(num);
		}
		
		cyclics.add(Integer.parseInt(res.toString()));
		return cyclic(arr,k+1,cyclics);
	}
	public static void reverse(int[] arr,int index,int index1)
	{
		while(index<index1)
		{
		int temp=arr[index];
		arr[index]=arr[index1];
		arr[index1]=temp;
		index++;
		index1--;
		}
	}
	
	public static boolean multiplies(int n,int length,Set<Integer> cyclics)
	{
	
		for(int i=1;i<=n;i++)
		{
			int res=n*i;
		
			if(!cyclics.contains(res))
			{
				return false;
			}
		}
		return true;
	}
	public static boolean invalidcheck(String n1, int length) {
		// TODO Auto-generated method stub
		int sub=length/2;
		for(int i=0;i<length;i++)
		{
			if(i==sub)
			{
				String cur=n1.substring(0, i);
				String next=n1.substring(i,length);
				if(cur.equals(next))
				{
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1212;
	     int temp=n;
	     String n1=String.valueOf(n);
		int length=n1.length();
		Set<Integer> cyclics=new HashSet<>();
		cyclics.add(n);
		int k=1;
		int[] arr=new int[length];
	    for(int i=length-1;i>=0;i--)
        {
		  int rem=n%10;
        	arr[i]=rem;
        	n=n/10;
        			
        }
		cyclic(arr,k,cyclics);
		System.out.print(cyclics);
		if(cyclics.size()==1)
		{
			System.out.print("Invalid Condition");
			return;
		}
		boolean invalid=invalidcheck(n1,length);
		if(invalid==true)
		{
			System.out.print("Invalid Condidtion");
			return;
		}
		boolean res=multiplies(temp,length,cyclics);
		
		if(res==true)
		{
			System.out.print("It is cyclic Number");
		}
		else
		{
			System.out.print("It is not cyclic Number");
		}
		
		

	}
	

}
