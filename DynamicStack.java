package coding;

public class DynamicStack extends Stack {
	@Override
	public void push(int item) throws Exception {
		if(this.size()==this.data.length) {
			int nr[]=new int[this.data.length*2];
			for (int i = 0; i < this.data.length; i++) {
				nr[i]=this.data[i];
			}
			this.data=nr;
			
		}
		super.push(item);
	}
}
