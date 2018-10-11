package coding;

import java.util.Scanner;

public class hdfcArray {
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			
		}
		
		int T=sc.nextInt();
		int query[][]=new int[T][3];
		for (int i = 0; i < T; i++) {
			for (int j = 0; j < 3; j++) {
				query[i][j]=sc.nextInt();
			}
		}
//		for (int i = 0; i < query.length; i++) {
//			System.out.println(query[i][0]+" "+query[i][1]+" "+query[i][2]);
//		}
		
		for (int i = 0; i < T; i++) {
			if(isPossible(arr, query[i][0],  query[i][1],  query[i][2])) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
		
		
		
		
		
		
		
		
	}

	public static boolean isPossible(int arr[],int l,int r,int k) {
		boolean flag=false;
		for (int i = 0; i < arr.length-k+1; i++) {
			if(!isUniue(arr, i, i+k-1)) {
				flag=false;
			}else {
				flag=true;
				for (int j = i; j < i+k; j++) {
					if(arr[i]<l || arr[j]>r) {
						flag=false;
						break;
					}
				}
				if(flag) {
					return flag;
				}
				
			}
		}
		return flag;
	}
	

	public static boolean isUniue(int arr[], int low, int high) {
		for(int i=low;i<high;i++) {
			for (int j = i+1; j < high; j++) {
				if(arr[i]==arr[j]) {
					return false;
				}
			}
		}
		return true;
	}

}