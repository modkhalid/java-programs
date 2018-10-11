package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
//import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;


class InputReader {
    public BufferedReader reader;
    public StringTokenizer tokenizer;
 
    public InputReader(InputStream stream) {
        reader = new BufferedReader(new InputStreamReader(stream), 32768);
        tokenizer = null;
        tokenizer = null;
    }
 
    public String next() {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }
 
    public int nextInt() {
        return Integer.parseInt(next());
    }
		
	public long nextLong() {
        return Long.parseLong(next());
    }
}





public class selectionGift {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
//		HashMap<Integer, Boolean> hm=new HashMap<>();
		int m=sc.nextInt();
		int arr[]=new int[m];
		int ans[]=new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[0]=sc.nextInt();
			ans[arr[0]-1]++;
			
		}
		
		int min=Integer.MAX_VALUE;
		int res=0;
		int minCOunt=1;
		for (int i = 0; i < ans.length; i++) {
			if(ans[i]==0) {
				res++;
			}
			if(ans[i]<min) {
				min=ans[i];
				minCOunt=1;
			}else if(ans[i]==min){
				minCOunt++;
			}
		}
		if(res>0) {
			System.out.println(res);
		}else {
			System.out.println(minCOunt);
		}
		
	}
}
