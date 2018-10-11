package coding;

public class Queue {
	private int size,front;
	private int data[];
	public Queue() {
		this(5);
	}
	public Queue(int cap) {
		this.data=new int[cap];
		this.size=0;
		this.front=0;
		
	}
	
	
	public void enqueue(int item) throws Exception {
		if(this.size()==this.data.length) {
			throw new Exception("Queue is full");
		}
		data[(this.front+this.size)%this.data.length]=item;
		this.size++;
	}
	
	
	public int dequeue() throws Exception {
		if(this.size==0) {
			throw new Exception("Queue is Empty");
		}
		int temp=this.data[this.front];
		this.front=(this.front+1)%this.data.length;
		this.size--;
		return temp;
		
	}
	
	public int top() throws Exception {
		if(this.size==0) {
			throw new Exception("Queue is Empty");
		}
		int temp=this.data[this.front];
//		this.front=(this.front+1)%this.data.length;
//		this.size--;
		return temp;
		
	}	
	
	
	public void display() {
		for (int i = 0; i < this.size; i++) {
			System.out.print(this.data[(this.front+i)%this.data.length]+" ");
		}
		System.out.println();
	}
	

	public boolean isEmpty() {
		return this.size()==0;
	}
	public int size() {
		return this.size;
	}
}
