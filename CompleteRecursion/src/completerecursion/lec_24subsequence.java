package completerecursion;
import java.util.*;
public class lec_24subsequence {
	public static void main(String[]args)
	{
	String s="abc";
	subsequence(s,0,s.length(),"");
	subseq(s,"");
	}
	public static void subsequence(String ques, int index,int len,String ans)
	{
		if(index==len)
			{System.out.println(ans);
			return;
			}
		
		subsequence(ques,index+1,len,ans+ques.charAt(index));
		subsequence(ques,index+1,len,ans);
		
			
	}
	public static void subseq(String ques, String ans)
	{
		if(ques.length()==0)
		{	System.out.println(ans);
		return;
		}
		char ch=ques.charAt(0);
		subseq(ques.substring(1),ans+ch);
		subseq(ques.substring(1),ans);
	}

}
