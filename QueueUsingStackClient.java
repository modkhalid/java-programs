package coding;

//import L15_March24.queueUsingStack;

public class QueueUsingStackClient {
	public static void main(String[] args) throws Exception {
		QueueUsingStack qus=new QueueUsingStack();
		qus.enqueue(45);
		qus.enqueue(98);
		qus.display();
	}
}
