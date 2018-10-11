package coding;

import java.util.Scanner;

public class removeDuplicate {
	public static void main(String[] args) {
		String str;
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		
		System.out.println(remDup(str));
		
	}
	public static String remDup(String str) {
		String str1="";
		for(int i=0;i<str.length();i++) {
			if(i==0) {
				 str1 += str.charAt(i);
			}else {
				if(str.charAt(i-1)!=str.charAt(i)) {
					str1+=str.charAt(i);
				}
			}
		}
		return str1;
	}
}
