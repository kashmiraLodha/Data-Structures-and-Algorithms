package trees;

import java.util.Scanner;

public class binary_tree {
Scanner sc=new Scanner(System.in);
	public class Node
	{
		int data;
		Node left;
		Node right;
		
		
	}
	protected Node root;
	public binary_tree()
	{
		this.root=Create_Node(null,false);
	}
	private Node Create_Node(Node parent, boolean ilc) {
		// TODO Auto-generated method stub
		if(parent==null)
		{
			System.out.println("Enter root Node data");
			
		}
		else if(ilc)
		{
			System.out.println("Enter data for left child of parent "+parent.data);
		}
		else
			System.out.println("Enter data for the right child of parent "+parent.data);
		int item=sc.nextInt();
		Node nn=new Node();
		nn.data=item;
		System.out.println("Does "+nn.data+" have left child?");
		boolean lc=sc.nextBoolean();
		if(lc)
		{
			nn.left=Create_Node(nn,true);
		}
		System.out.println("Does "+nn.data+" have right child?");
		boolean rc= sc.nextBoolean();
		if(rc)
		{
			nn.right=Create_Node(nn,false);
		}
		return nn;
	}
	public void display()
	{
		display(this.root);
	}
	private void display(Node nn) {
		// TODO Auto-generated method stub
		if(nn == null)
			return;
		String str=""+nn.data;
		if(nn.left!=null)
		{
			str=nn.left.data+"<<"+str;
		}
		else
			str=".<<"+str;
		if(nn.right!=null)
		{
			str+=">>"+nn.right.data;
		}
		else
			str+=">>.";
		System.out.println(str);
		display(nn.left);
		display(nn.right);
		
	}
	public boolean find(int data)
	{
		return find(this.root,data);
	}
	private boolean find(Node nn, int item) {

		// TODO Auto-generated method stub
		if(nn==null)
			return false;
		if(nn.data==item)
			return true;
		boolean lt=find(nn.left,item);
		boolean rt=find(nn.right,item);
		return lt||rt;
	}
	public int min()
	{
		return min(this.root);
	}
	private int min(Node nn) 
{
		// TODO Auto-generated method stub
		if(nn==null)
			return Integer.MAX_VALUE;
		int lmin=min(nn.left);
		int rmin=min(nn.right);
		return Math.min(nn.data,Math.min(lmin, rmin));
		
	}
	public int size()
	{
		return size(this.root);
	}
	private int size(Node nn) {

		// TODO Auto-generated method stub
		if(nn==null)
			return 0;
		int ls=size(nn.left);
		int rs=size(nn.right);
		return ls+rs+1;
	}
	public int height()
	{
		return height(this.root);
	}
	private int height(Node nn) {
		// TODO Auto-generated method stub
		if(nn==null)
			return -1;
		int hl=height(nn.left);
		int hr=height(nn.right);
		return Math.max(hl, hr)+1;
		
	}
	
}
