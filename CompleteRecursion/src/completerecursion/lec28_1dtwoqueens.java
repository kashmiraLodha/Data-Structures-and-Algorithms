package completerecursion;
//different ways to place 2 queens on 1-d board of size n
//print all permutations.
public class lec28_1dtwoqueens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int q=2;
		boolean[] board = new boolean[n];
		placequeen(n,q,"",0,board);

	}

	public  static void placequeen(int n, int q,String ans,int totalqueen,boolean[] board) {
		// TODO Auto-generated method stub
		if(q==totalqueen)
		{
			System.out.println(ans);
			return;
		}
		for(int i=0;i<n;i++)
		{	if(!board[i])
			{
			board[i]=true;
			
			placequeen(n,q,ans+"Q"+totalqueen+" "+i+" ",totalqueen+1,board);
			
			board[i]=false;
			}
		}
		
	}

}
