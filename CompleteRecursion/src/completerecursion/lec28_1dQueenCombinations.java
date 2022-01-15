package completerecursion;

public class lec28_1dQueenCombinations {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int q=2;
		boolean[] board = new boolean[n];
		placequeen(n,q,"",0,board,0);

	}

	public  static void placequeen(int n, int q,String ans,int totalqueen,boolean[] board,int index) {
		// TODO Auto-generated method stub
		if(q==totalqueen)
		{
			System.out.println(ans);
			return;
		}
		for(int i=index;i<n;i++)
		{	if(!board[i])
			{
			board[i]=true;
			
			placequeen(n,q,ans+"Q"+totalqueen+" "+i+" ",totalqueen+1,board,i+1);
			
			board[i]=false;
			}
		}
		
	}

}
