package coding;

public class DynamicQueue extends Queue{
	@Override
	public void enqueue(int item) throws Exception {
		if(this.size()==this.data.length) {
			int nq[]=new int[this.data.length*2];
			System.out.println("doubling");
			for (int i = 0; i < this.data.length; i++) {
				nq[i]=this.data[(this.front+i)%this.data.length];
				
			}
			this.data=nq;
		}
		super.enqueue(item);
	}
}
