package queue;

public class Queue_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Queue q=new Queue(5);
		q.Enqueue(10);
		q.Enqueue(20);
		q.Enqueue(30);
		q.Enqueue(40);
		q.Enqueue(50);
		
		q.Dequeue();
		q.Enqueue(60);
		q.Display();
		

	}

}
