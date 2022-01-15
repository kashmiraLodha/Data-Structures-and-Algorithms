package completerecursion;
import java.util.*;

public class lec_25generateParantheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=3;
		printbrackets(N,0,"",0,0);
		// closing will be added only if there are less number of closing than the opening
		// the number of closing should never be more than the number of opening
		// we cannot add a closing bracket without an opening bracket
		

	}
	private static void printbrackets(int N, int total, String ans, int no, int nc) 
	{
		// TODO Auto-generated method stub
		if(total==N*2)
		{
			System.out.println(ans);
			return;
		}
		if(no<N)
			printbrackets(N,total+1,ans+"(",no+1,nc);
		if(nc<no)
			printbrackets(N,total+1,ans+")",no,nc+1);
		
	}


}
