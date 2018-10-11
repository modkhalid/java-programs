package coding;

public class StackClient {
	public static void main(String[] args) throws Exception {
		Stack s=new Stack();
		s.push(12);
		s.push(45);
		s.display();
//		System.out.println();
		System.out.println(s.pop());
		s.display();
		System.out.println(s.size());
		System.out.println(s.pop());
		System.out.println(s.pop());//exception 
	}
}
