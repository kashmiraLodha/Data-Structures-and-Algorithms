package completerecursion;
import java.util.*;
public class lec_26Permutations {
	public static void main(String[] args)
	{
	String ques="abc";
	permutations(ques,"");
	}

	public static void permutations(String ques, String ans) {
		if(ques.length()==0)
			{System.out.println(ans);
			return;
			}
		for(int i=0;i<ques.length();i++)
		{
			char ch=ques.charAt(i);
			String part1=ques.substring(0,i);
			String part2=ques.substring(i+1);
			permutations(part1+part2, ans+ch);
		}
			
		
		// TODO Auto-generated method stub
		
	}
}
