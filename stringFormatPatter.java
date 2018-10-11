package coding;

import java.util.Scanner;

public class stringFormatPatter {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		System.out.println(formatedString(str));
	}

	public static String formatedString(String str) {
//		return null;

		if (str.length() == 1) {
			return str;
		}

		if (str.charAt(0) == str.charAt(1)) {
			return str.charAt(0) + "*" + formatedString(str.substring(1));
		} else {
			return str.charAt(0) + formatedString(str.substring(1));
		}

	}
}
