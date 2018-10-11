package coding;

public class Stack {
	private int top;
	private int[] data;
	
	public Stack() {
		this(5);
	}

	public Stack(int cap) {
		data=new int[cap];
		top=-1;
	}
	
	
	public void push(int item) throws Exception {
		if(this.size()==this.data.length) {
			throw new Exception("Stack Over flow");
		}
		++top;
		this.data[this.top]=item;
	}
	
	
	
	public int pop() throws Exception {
		if(this.size()==0) {
			throw new Exception("Stack is Empty");
		}
		int temp=this.data[this.top];
		this.data[this.top]=0;
		this.top--;
		return temp;
		
		
		
	}
	
	
	public int top() throws Exception {
		if(this.size()==0) {
			throw new Exception("Stack is Empty");
		}
		int temp=this.data[this.top];
//		this.data[this.top]=0;
//		this.top--;
		return temp;
	}
	
	
	public int size() {
		return this.top+1;
	}
	
	public boolean isEmpty() {
		return this.size()==0;
	}
	
	public void display() {
		for (int i = 0; i <= this.top	; i++) {
			System.out.print(this.data[i]+" ");
		}
		System.out.println();
	}
	
}
