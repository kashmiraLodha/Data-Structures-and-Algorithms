package stack_implementation;

public class stack {
	private int[]arr;
	private int top;
	public stack(int size)
	{
		this.arr=new int[size];
		this.top=0;
	}
	public boolean isEmpty()
	{
		return this.top==0;
	}
	public boolean isFull()
	{
		return this.top==this.arr.length;
		
	}
	public void push(int item)
	{
		if(isFull()==false)
		{
		arr[top]=item;
		top++;
		}
		
	}
	public int pop()
	{		top--;
			return arr[top];
	}
	public int peek()
	{
		return arr[top-1];
		
	}
	public void display()
	{
		for(int i=0;i<top;i++)
			System.out.print(arr[i]+">");
	}
	public int size()
	{
		return top;
	}
}
