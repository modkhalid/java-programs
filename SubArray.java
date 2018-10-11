package coding;

import java.util.Scanner;

public class SubArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		
		
		int Q=sc.nextInt();
		int query[][]=new int[Q][3];
		
		for (int i = 0; i < query.length; i++) {
			for (int j = 0; j < 3; j++) {
				query[i][j]=sc.nextInt();
			}
		}
		
		
		for (int i = 0; i < query.length; i++) {
			if(isPossible(arr, query[i])) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
		
	}
	
	
	
	public static boolean isPossible(int arr1[],int arr2[]) {
		boolean flag=false;
		for (int i = 0; i < arr1.length-arr2[2]; i++) {
			flag=false;
			for (int j = i; j < i+arr2[2]; j++) {
				if(arr1[j]>=arr2[0]  && arr1[j]<arr2[1]) {
					flag=true;
				}else {
					flag=false;
					break;
				}
				
			}
			if(flag) {
				return flag;
			}
		}
		
		
		return flag;
	}
}
























