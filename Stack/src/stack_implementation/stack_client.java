package stack_implementation;

public class stack_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stack s=new stack(10);
		s.push(5);
		s.push(10);
		s.push(20);
		s.push(30);
		//s.pop();
		//s.display();
		System.out.println(s.peek());

	}

}
