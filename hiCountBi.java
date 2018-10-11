package coding;

public class hiCountBi {
	public static void main(String[] args) {
		String str="himofhisddsdshi";
//		System.out.println(CountHi(str));
//		System.out.println(RemoveHi(str));
		System.out.println(RplaceHi(str));
//		System.out.println("hisjkdhskjdhs".substring(0,2).equals("hi"));
		
	}
	
	
	public static int CountHi(String str) {
		if(str.length()==1 || str.length()==0) {
			return 0;
		}
		
		
		if(str.substring(0,2).equals("hi")) {
			return CountHi(str.substring(2))+1;
			
		}else {
			return CountHi(str.substring(1));
		}
	}
	
	public static String RemoveHi(String str) {
		if(str.length()==1 || str.length()==0) {
			return str;
		}
		
		
		if(str.substring(0,2).equals("hi")) {
			return RemoveHi(str.substring(2));
			
		}else {
			return str.charAt(0)+RemoveHi(str.substring(1));
		}
	}
	
	
	
	public static String RplaceHi(String str) {
		if(str.length()==1 || str.length()==0) {
			return str;
		}
		
		
		if(str.substring(0,2).equals("hi")) {
			return "Bi"+RplaceHi(str.substring(2));
			
		}else {
			return str.charAt(0)+RplaceHi(str.substring(1));
		}
	}
	
	
	
	
	
	
	
	
}
