package coding;

public class QueueUsingStack {
	private DynamicStack ds1 = new DynamicStack();
	private DynamicStack ds2 = new DynamicStack();

	public void enqueue(int item) throws Exception {
		while (!ds1.isEmpty()) {
			ds2.push(ds1.pop());
		}
		ds1.push(item);
		while (!ds2.isEmpty()) {
			ds1.push(ds2.pop());
		}
	}

	public int dequeue() throws Exception {
		if(ds1.size()==0) {
			throw new Exception("Queue is EMpty");
		}
		return ds1.pop();
	}
	
	public int size() {
		return ds1.size();
	}
	
	public boolean isEmpty() {
		return ds1.isEmpty();
	}
	
	public void display() throws Exception {
		while(!ds1.isEmpty()) {
			ds2.push(ds1.pop());
		}
		while(!ds2.isEmpty()) {
			System.out.print(ds2.pop()+" ");
		}
		System.out.println();
	}
	

}
