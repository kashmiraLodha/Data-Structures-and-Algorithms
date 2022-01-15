package completerecursion;
import java.util.*;
public class firstIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] arr=new int[5];
			for(int i=0;i<5;i++)
				arr[i]=i;
			System.out.println(firstindex(arr,0,2));
	}
	public static int firstindex(int[] arr, int index,int target)
	
	{
		if(arr[index]==target)
			return index;
		if(index==arr.length)
			return -1;
		return firstindex(arr,index+1,target);
	}

}
