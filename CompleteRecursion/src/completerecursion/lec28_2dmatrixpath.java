package completerecursion;
//IN A 2D MATRIX print  all ways to go from (0,0) to (n-1,m-1)
// can travel only horizontally or vertically

public class lec28_2dmatrixpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n=3;
			int m=3;
			System.out.println(printallpath(0,0,n-1,m-1,""));
	}

	private static int printallpath(int i, int j, int n, int m,String ans) {
		// TODO Auto-generated method stub
		if(i==n&&j==m)
		{
			System.out.println(ans);
			return 1 ;
		}
		if(i>n||j>m)
			return 0 ;
		int l =printallpath(i,j+1,n,m,ans+"H");
		int r= printallpath(i+1,j,n,m,ans+"V");
		return l+r;
			
		
	}
	

}
