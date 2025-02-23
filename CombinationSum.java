package exercisepgm_1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;

//combination of sum without duplicate sets using hashset

public class CombinationSum {
	
	public static void combination(int[] arr,int n,int i,int target,Vector<Integer> res,HashSet<Vector<Integer>> hash)
	{
		
		if(i==n)
		{
			if(target==0)
			{
				hash.add(new Vector<>(res));
				
			}
			return;
		}
		if(target==0)
		{
			hash.add(new Vector<>(res));
			return;
		}
		
		if(arr[i]<= target)
		{
			res.add(arr[i]);
		combination(arr,n,i,target-arr[i],res,hash);
		res.remove(res.size() - 1);
		
		}
		
		combination(arr,n,i+1,target,res,hash);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,1,1,2,2};
		int n=arr.length-1;
		int target=4;
		int i=0;
		int flg=0;
		Vector<Integer> res=new Vector<Integer>();
		HashSet<Vector<Integer>> hash=new HashSet<>();
		combination(arr,n,i,target,res,hash);
		for(Vector<Integer> h:hash)
		{
			System.out.print(h);
		}

	}

}
