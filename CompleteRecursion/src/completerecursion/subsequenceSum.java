package subsequences;

public class subsequenceSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int []arr= {1,2,3};
			int k=0;
			int sum=0;
			System.out.println(SubsequenceSum(0,sum,k,arr));
			

}
	public static int SubsequenceSum(int index,int sum,int k,int[]arr)
	{
		if(sum==k)
			return 1;
		if(index==arr.length)
		{
			if(sum==k)
				return 1;
			else
				return 0;
		}
		int l=0;
		if(sum+arr[index]<=k)
			
		{	sum+=arr[index];
			l=SubsequenceSum(index+1,sum,k,arr);
			sum-=arr[index];
		}
		int r=SubsequenceSum(index+1,sum,k,arr);
		return l+r;
	}

}
