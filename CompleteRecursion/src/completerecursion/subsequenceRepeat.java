package subsequences;

public class subsequenceRepeat {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int [] arr= {1,2}; //til k
		
			int k=8; 
			System.out.println(SubsequenceRepeat(0,k,arr));
	}
		public static int SubsequenceRepeat(int index,int k,int[]arr)
		{	if(index==arr.length)
		{
			if(k==0)
				return 1;
			else return 0;
			
		}int l=0;
		
		if(arr[index]<=k)
		{	
			l=SubsequenceRepeat(index,k-arr[index],arr);
			k+=arr[index];
		}
	
		int r=SubsequenceRepeat(index+1,k,arr);
		
			return l+r;
			
		}
}
