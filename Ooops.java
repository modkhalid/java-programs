package coding;

public class Ooops {
	private char sex ;
	private int age;
	private String name;
	
	
	public Ooops() {
		sex=0;
		age= 21;
		name="";
		
	}	
	public Ooops(int age,char s,String name) {
		this.age=age;
		sex=s;
		this.name=name;
	}
	
	public void setData(int age,char s,String name) {
		this.age=age;
		sex=s;
		this.name=name;
	}
	@Override
	public String toString() {
		return name+" and age is :"+this.age+" and sex is :"+this.sex;
	}
	
	public static void main(String[] args) {
		Ooops o=new Ooops(15, 'M', "modkhalid");
		System.out.println(o);
	}
}



