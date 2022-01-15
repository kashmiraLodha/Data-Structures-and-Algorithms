package completerecursion;
//make target from the infinite supply of coins,but don't print permutations , only combinations.

public class lec28_coinChangeCombinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins= {2,3,5};
		int target=10;
		CoinChange(coins,target,0,"",0);
		}

	public static void CoinChange(int[] coins, int target, int sum, String ans, int index) {
		// TODO Auto-generated method stub
		if(sum==target)
		{
			System.out.println(ans);
			return;
		}
		if(sum>target)
			return;
		for(int i=index;i<coins.length;i++)
		{
			sum+=coins[i];
			
			CoinChange(coins,target,sum,ans+coins[i]+" ",i);
			sum-=coins[i];
		}
		
	}

}
