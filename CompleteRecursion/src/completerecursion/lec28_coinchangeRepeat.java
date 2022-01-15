package completerecursion;
//there are a few coins given with the liberty to use them infinite times.
//print all ways to reach a given target
//printing all permutations
public class lec28_coinchangeRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins= {2,3,5};
		int target=10;
		coinChange(coins,target,"",0);
		}

	private static void coinChange(int[] coins, int target, String ans, int sum) {
		// TODO Auto-generated method stub
		if(sum==target)
			{System.out.println(ans);
			return;
			}
		if(sum>target)
			return;
		for(int i=0;i<coins.length;i++)
		{
			sum+=coins[i];
			coinChange(coins,target,ans+coins[i]+" ",sum);
			sum-=coins[i];
		}
			
	
		
	}
	}


