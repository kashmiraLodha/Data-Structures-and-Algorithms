package subsequences;
import java.util.*;

public class subsequencesone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3};
		
		ArrayList<Integer> temp=new ArrayList<>();
		printSubSequence(0,arr,temp);
		
		
	}
	public static void printSubSequence(int index,int[] arr,ArrayList<Integer>temp)
	{
		if(index==arr.length)
		{
			for(int element: temp)
				System.out.print(element+" ");
			System.out.println();
			return;
		}
		temp.add(arr[index]);
		
		printSubSequence(index+1,arr,temp);
		temp.remove(temp.size() - 1);
		printSubSequence(index+1,arr,temp);
		
		
		
	}

}
