package queue;

public class Queue {
	protected int[] arr;
	protected int front;
	private int size;

	public Queue() {
		// TODO Auto-generated constructor stub
		
		this.arr = new int[5];
		this.front = 0;
		this.size = 0;
	}

	public Queue(int cap) {
		// TODO Auto-generated constructor stub
		this.arr = new int[cap];
		this.front = 0;
		this.size = 0;
	}

	public boolean IS_empty() {
		return this.size == 0;
	}

	public  boolean IS_full() {
		return this.size == this.arr.length;
	}

	public void Enqueue(int item) throws Exception {
		
		
		if(this.IS_full()) {
			throw new Exception();
		}
       int idx = (this.front+this.size)%this.arr.length;
		this.arr[idx] = item;
		this.size++;

	}

	public int getFront() throws Exception {
		if(this.IS_empty()) {
			throw new Exception();
		}

		int item = this.arr[this.front];
		return item;

	}

	public int Dequeue() throws Exception {
		
		if(this.IS_empty()) {
			throw new Exception();
		}

		int item = this.arr[this.front];
		this.front=(this.front+1)%arr.length;
		this.size--;
		return item;

	}

	public int size() {
		return this.size;
	}
	
	public void Display() {
		
		for (int i = 0; i <this.size; i++) {
			int idx=(this.front+i)%this.arr.length;
			
			System.out.print(this.arr[idx]+" --> ");
		}
		System.out.println(".");
		
	}
}
