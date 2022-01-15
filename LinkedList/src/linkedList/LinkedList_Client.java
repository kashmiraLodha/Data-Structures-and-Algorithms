package linkedList;

public class LinkedList_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList ll=new LinkedList();
		ll.addFirst(10);
		ll.addFirst(20);
		ll.addFirst(30);
		ll.addLast(40);
		ll.addAtIndex(2, 50);
		ll.addAtIndex(0, -10);
		ll.deleteAtIndex(2);
		ll.deleteAtIndex(0);
		
		
		ll.display();
		

	}

}
