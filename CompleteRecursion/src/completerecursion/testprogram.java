package completerecursion;

import java.util.ArrayList;
import java.util.Collections;

public class testprogram {

	public static void main(String[] args)
	{
	String text="AAABABAA";
	String pat="AABA";
	ArrayList<Integer> indices =new ArrayList<>();
	permutations(pat,"",text,indices);
	Collections.sort(indices);
	for(int i :indices)
	{
		System.out.println(i);
	}
	
	
	}
	public static int Substr(String s2, String s1){
        int counter = 0; //pointing s2
        int i = 0;
        for(;i<s1.length();i++){
            if(counter==s2.length())
                break;
            if(s2.charAt(counter)==s1.charAt(i)){
                counter++;
            }else{
                //Special case where character preceding the i'th character is duplicate
                if(counter>0){
                    i -= counter;
                }
                counter = 0;
            }
        }
        return counter < s2.length()?-1:i-counter;
    } 
	public static void permutations(String ques, String ans,String text, ArrayList<Integer> indices) {
		if(ques.length()==0)
			
		{
			int index=Substr(ans, text);
			if(index!=-1)
				indices.add(index);
			
			
			return;
			}
		for(int i=0;i<ques.length();i++)
		{
			char ch=ques.charAt(i);
			boolean isp=false;
			for(int j=i+1;j<ques.length();j++)
			{
				if(ques.charAt(j)==ch)
					{isp=true;
					break;
					}
			}
			if(isp==false)
			{
			String part1=ques.substring(0,i);
			String part2=ques.substring(i+1);
			
			permutations(part1+part2, ans+ch,text,indices);
			}
		}
			
		
		// TODO Auto-generated method stub
		
	}

}
