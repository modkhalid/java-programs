package coding;

public class strDiffAscii {
//	k-3h-7a8i-5d
	public static void main(String[] args) {
		diff("khaid");
	}

	public static void diff(String str) {
		int ch=str.charAt(0);
		System.out.print(str.charAt(0));
		for(int i=1;i<str.length();i++) {
			int temp=str.charAt(i)-ch;
//			if(temp)
			ch=str.charAt(i);
			System.out.print(temp+""+str.charAt(i));
		}
	}

}