package coding;

public class QueuClient {
	public static void main(String[] args) throws Exception {
		Queue q=new Queue();
		q.enqueue(45);
		q.enqueue(65);
		q.display();
		System.out.println(q.dequeue());
		q.enqueue(78);
		q.enqueue(85);
		q.enqueue(23);
		q.enqueue(52);
		q.display();
		q.enqueue(123);
		System.out.println(q.size());//will show error : queueis full
	}
}
