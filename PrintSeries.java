package coding;

import java.util.Scanner;

public class PrintSeries {
	public static void printSeries(int n1, int n2) {
		for (int i = 1; i <= n1; i++) {
			int p=3*i+2;
			if(p%n2!=0)
				System.out.print(p+" ");
			else
				n1++;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		printSeries(n1, n2);
	}
}
