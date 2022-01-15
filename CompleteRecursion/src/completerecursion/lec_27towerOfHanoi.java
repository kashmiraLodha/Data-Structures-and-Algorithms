package completerecursion;

public class lec_27towerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int discs=3;
        toh(discs,"T1","T2","T3");
       
        System.out.println(count);
	}
	static int count=0;
    public static void toh(int n, String t1, String t2, String t3)
    {
        if(n==0)
        return;
        toh(n-1, t1,t3,t2);
        System.out.println("Move "+n+"th disc from "+t1+" to "+t2);
        count++;
        toh(n-1, t3, t2, t1);
       
    }
}
