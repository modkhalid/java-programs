package coding;

public class frequency {
	public static void main(String[] args) {
		System.out.println(frequency("modkhalidl"));
	}
	
	
	public static char frequency(String str) {
		
		
		int max=0;
		char res=' ';
		for (int i = 0; i < str.length(); i++) {
			
			int t=0;
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					t++;
				}
			}
			if(max<t) {
				max=t;
				res=str.charAt(i);
			}
		}
		return res;
	}
}
