
package completerecursion;
import java.util.*;
//There's a board given with N as the end value.
// We roll a dice and move forward the number on the dice from our current position
// Returning number of ways we can go to N by starting at 0
public class lec_25BoardDiceGame {
	public static void main(String[]args)
	{
		int N=10;
		Boarddice(N,0,"");	
}
	public static void Boarddice(int N, int curr_pos, String ans)
	{
		if(curr_pos==N)
		{
			System.out.println(ans);
			return;
		}
		if(curr_pos>N)
			return;
		for(int i=1;i<=6;i++)
		{
			Boarddice(N, curr_pos+i, ans+i+" ");
		}
	}
}
