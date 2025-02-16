package exercisepgm_1;

public class PalindromeUsingRecursion {
	
	public static boolean palindrome(String str,int i)
	{
	   int n=str.length();
		if(i>=n/2)
		{
			return true;
		}
			if(str.charAt(i)!=str.charAt(n-i-1))
			{
				return false;
			}
		
			return palindrome(str,i+1);
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="MADAM";
		int i=0;
		boolean res=palindrome(str,i);
        System.out.print(res);
	
	}

}
