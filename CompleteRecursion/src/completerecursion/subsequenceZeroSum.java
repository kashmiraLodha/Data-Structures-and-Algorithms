package subsequences;

public class subsequenceZeroSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] arr= {1,2,3};
			int sum=0;
			int k=5;
			System.out.println(SubsequenceZero(0,sum,k,arr));
			}
		public static int SubsequenceZero(int index,int sum,int k,int[]arr)
		{	if(index==arr.length)
		{
			if(sum==k)
			{
				return 1;
			}
			else return 0;
		}
		sum+=arr[index];
		int l=SubsequenceZero(index+1,sum,k,arr);
		sum-=arr[index];
		int r=SubsequenceZero(index+1,sum,k,arr);
			return l+r;
		}

}
