package coding;

public class StringReverseNum {
//20*42/3*21
	public static void main(String[] args) {
		reverse("20*42/3*21");
	}
	
	
	public static void reverse(String str) {
		String str1="",str2="";
		for(int i=str.length()-1;i>=0;--i) {
			if(str.charAt(i)=='+'  || str.charAt(i)=='-' || str.charAt(i)=='/' || str.charAt(i)=='*') {
				str1=str.charAt(i)+str1;
				str2+=str1;
				str1="";
			}else {
				str1=str.charAt(i)+str1;
			}
		}
		System.out.println(str2+" "+str1);
	}
}
