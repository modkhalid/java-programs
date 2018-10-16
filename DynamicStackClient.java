package coding;

public class DynamicStackClient {
	public static void main(String[] args) throws Exception {
		DynamicStack ds=new DynamicStack();
		ds.push(45);
		ds.push(78);
		ds.push(156);
		ds.push(45);
		ds.push(78);
		ds.push(156);
		System.out.println(ds.pop());
		ds.display();
	}
	
}
