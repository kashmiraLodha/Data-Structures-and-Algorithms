package subsequences;
import java.util.*;

public class divisibleByk {
	public static void main(String[] args) {
		
		int [] arr= {1,2,3};
		ArrayList<Integer> temp=new ArrayList<>();
		int sum=0;int k=3;
		SubsequenceDivisible(0,sum,k,arr,temp);
		
	}
	public static void SubsequenceDivisible(int index,int sum,int k,int [] arr,ArrayList<Integer>temp)
	{
		if(index==arr.length)
		{
			if(sum%k==0)
			{
				for(int element:temp)
					System.out.print(element+" ");
			System.out.println();
			
			}
			return;
		}
		temp.add(arr[index]);
		sum+=arr[index];
		SubsequenceDivisible(index+1,sum,k,arr,temp);
		temp.remove(temp.size()-1);
		sum-=arr[index];
		SubsequenceDivisible(index+1,sum,k,arr,temp);
	}
	
}
