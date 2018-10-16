package coding;

import java.util.Scanner;

public class code2 {
	public static void main(String[] args) {
		int t;
		Scanner sc=new Scanner(System.in);

		t=sc.nextInt();
		for (int i = 0; i < t; ++i)
		{
			int n;

			n=sc.nextInt();
			int arr[]=new int[n];
			int res[]=new int[n];
			int temper=0;
			for (int j = 0; j < n; ++j)
			{
				arr[j]=sc.nextInt();
				res[j]=temper+arr[j];
				temper=res[j];
			}
			int count=1;
			int day=0;
			while(count<n){
				day++;
				
				count+=res[count-1];
			}

			System.out.println(day);
		}
	}
}

