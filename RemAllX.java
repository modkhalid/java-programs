package coding;

public class RemAllX {

	public static void main(String[] args) {
//		System.out.println(Rem("moxxmodxxddx", "moxxdmodxxdx".length()-1));
		System.out.println(duplicateChFormat("moooooods"));
	}
	
	
	public static String Rem(String str,int idx) {
		if(idx==0) {
			return str;
		}
		char ch=str.charAt(0);
		if(ch=='x') {
			return Rem(str.substring(1),idx-1)+ch;
		}else {
			return ch+Rem(str.substring(1),idx-1);
		}
	}
	
	public static String duplicateChFormat(String str) {
		if(str.length()==1) {
			return str;
		}
		if(str.charAt(0)==str.charAt(1)) {
			return str.charAt(0)+duplicateChFormat(str.substring(2));
		}else {
			return str.charAt(0)+duplicateChFormat(str.substring(1));
		}
		
	}
	
}
