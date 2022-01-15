package subsequences;
import java.util.*;

public class subsequenceCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3};
		
		int k=1;
		int sum=0;
		int count=SubsequenceCount(0,sum,k,arr);
		System.out.println(count-1);
	
		
		
	}

	public static int SubsequenceCount(int index,int sum,int k, int[] arr)
	{
		if(index==arr.length)
		{
			if(sum%k==0)
				return 1;
			else
				return 0;
		}
		sum+=arr[index];
		int l=SubsequenceCount(index+1,sum,k,arr);
		sum-=arr[index];
		int r=SubsequenceCount(index+1,sum,k,arr);
		return l+r;
	}

}
