package exercisepgm_1;

import java.util.Vector;

public class SubSequenceUsingRecursion {
	
	public static void subseq(int index, int[] arr, Vector<Integer> res, int n) {
		if (index >= n) {
			System.out.println(res);
			return;
		}
	    
		// Include the current element
	    res.add(arr[index]);
	    subseq(index + 1, arr, res, n);
	    
	    // Backtrack - remove the last added element
	    res.remove(res.size() - 1);
	    subseq(index + 1, arr, res, n);
	}

	public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int n = arr.length;
        Vector<Integer> res = new Vector<>();
        subseq(0, arr, res, n);
	}
}
