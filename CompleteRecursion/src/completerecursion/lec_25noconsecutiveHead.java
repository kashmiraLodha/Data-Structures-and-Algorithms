package completerecursion;
import java.util.*;
public class lec_25noconsecutiveHead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=2;
		CointossNohead(N,"",false);

	}
	public static void CointossNohead(int N,String ans,Boolean isHead)
	{
		if(N==0)
		{
			System.out.println(ans);
			return;
		}
		if(isHead==false)
		CointossNohead(N-1,ans+"H",true);
		CointossNohead(N-1,ans+"T",false);
	}

}
