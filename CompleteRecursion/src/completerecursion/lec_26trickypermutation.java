package completerecursion;
import java.util.*;
public class lec_26trickypermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aabc";
		trickypermute(s,"");
		
	}
	private static void trickypermute(String ques, String ans) {
		// TODO Auto-generated method stub
		if(ques.length()==0)
		{
			System.out.println(ans);
			return;
		}
		for(int i=0;i<ques.length();i++)
		{
			char ch=ques.charAt(i);
			boolean isp=false;
			for(int j=i+1;j<ques.length();j++)
			{
				if(ques.charAt(j)==ch)
					{isp=true;
					break;
					}
			}
			if(isp==false)
			{
			String part1=ques.substring(0,i);
			String part2=ques.substring(i+1);
			
			trickypermute(part1+part2, ans+ch);
			}
		}
		
	}

}
