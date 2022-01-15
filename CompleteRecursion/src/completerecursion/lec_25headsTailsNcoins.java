package completerecursion;
import java.util.*;
public class lec_25headsTailsNcoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=2;
		printheadtail(N,"");
	}
	public static void printheadtail(int N,String ans)
	{
		if(N==0)
			{System.out.println(ans);
			return;
			}
		printheadtail(N-1, ans+"H");
		printheadtail(N-1,ans+"T");
			
		
	}

}
