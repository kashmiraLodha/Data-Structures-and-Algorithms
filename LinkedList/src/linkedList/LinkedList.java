package linkedList;

public class LinkedList {
		public class Node
		{
			int data;
			Node next;
			public Node(int item)
			{
			this.data=item;
			this.next=null;
			}
		}
		private Node head;
		private Node tail;
		private int size;
		
	public void addFirst(int item)
	{
		Node nn=new Node(item);
		if(this.size==0)
		{	
			this.head=nn;
			this.tail=nn;
			this.size++;
		}
		else
		{	
			nn.next=this.head;
			this.head=nn;
			this.size++;
		}
	}
	public void addLast(int item)
	{
		if(this.size==0)
			this.addFirst(item);
		else
		{
			Node nn=new Node(item);
			this.tail.next=nn;
			this.tail=nn;
			this.size++;
		}
	}
	public void addAtIndex(int k,int item) throws Exception
	{
		if(k==0)
			this.addFirst(item);
		else if(k==this.size)
			this.addLast(item);
		else
		{
		Node before=getNode(k-1);
		Node nn=new Node(item);
		nn.next=before.next;
		before.next=nn;
		this.size++;
		}
		
		
	}
	private Node getNode(int k) throws Exception
	{
		Node temp=head;
		if(k<0|| k>this.size)
			throw new Exception();
		for(int i=1;i<=k;i++)
		{
			temp=temp.next;
		}
		return temp;
	}
	
	public void deleteFirst()
	{
		Node temp=head;
		this.head=temp.next;
		temp.next=null;
		this.size--;
		
	}
	public void deleteLast()
	{
		Node temp=head;
		while(temp.next.next!=null)
		{
			temp=temp.next;
		}
		this.tail=temp;
		temp.next=null;
		this.size--;
	}
	public void deleteAtIndex(int k) throws Exception
	{
		if(k==0)
			this.deleteFirst();
		else if(k==this.size)
			this.deleteLast();
		else
		{
			Node tobeDeleted = getNode(k);
			Node before =getNode(k-1);
			before.next=tobeDeleted.next;
			this.size--;
			
		}
	}
	
	public void display()
	{
		Node temp=head;
		while(temp !=null)
		{
			System.out.print(temp.data+">>");
			temp=temp.next;
		}
		System.out.println();
	 }
	
		
}
