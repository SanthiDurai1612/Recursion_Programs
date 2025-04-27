package interview;

import java.util.*;

public class Alphabets {
	
	public static void alphabet(String num,int i,Set<String> s,StringBuilder str)
	{
		if(i==num.length())
		{
			
			s.add(str.toString());
		
			return;
		}
		
		if(num.charAt(i)>='1' && num.charAt(i)<='9')
		{
			int temp=Integer.parseInt(String.valueOf(num.charAt(i)));
		    char alpha=(char)(65+temp-1);
		   
		    str.append(alpha);
		    alphabet(num,i+1,s,str);
		    str.deleteCharAt(str.length()-1);
		}
		
		if(i+1<num.length())
		{
			String temp1="";
			temp1+=num.charAt(i);
			temp1+=num.charAt(i+1);
			int integer=Integer.parseInt(temp1);
			if(integer>=10 && integer<=26)
			{
				char alpha=(char)(65+integer-1);
				str.append(alpha);
			
		
			}
			
			alphabet(num,i+2,s,str);
			 str.deleteCharAt(str.length()-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num="11112";
		int index=0;
		StringBuilder res=new StringBuilder();
		Set<String> s=new HashSet<>();
		alphabet(num,index,s,res);
		
		System.out.println(s);
	}

}
