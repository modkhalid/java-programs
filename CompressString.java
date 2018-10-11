package coding;

public class CompressString {
	public static void main(String[] args) {
		System.out.println(compress("mooodoo"));
	}

	public static String compress(String str) {
		int counter;
		int i = 0;
		String mystr = "";
		while (i < str.length()) {
			counter = 1;
			for (int j = i + 1; j < str.length() && str.charAt(i) == str.charAt(j); j++) {
				counter++;
			}
			if (counter > 1) {
				mystr += str.charAt(i) + "" + counter;
			} else {
				mystr += str.charAt(i);
			}
			i += counter;
		}
		return mystr;
		
	}
}