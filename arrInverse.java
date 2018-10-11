package coding;

import java.util.Scanner;

public class arrInverse {

	public static void main(String[] args) {
		
		int arr[]=input(5);
//		dispaly(arr);
		arr=inverse(arr);
		System.out.println();
//		dispaly(arr);
		
	}
		
	
	
	private static int[] inverse(int[] arr) {
		int temp[]=new int[arr.length];
		for (int i = 0; i < temp.length; i++) {
			temp[arr[i]]=i;

			System.out.println(arr[i]+" -> "+temp[arr[i]]);
		}
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
		dispaly(temp);
		return temp;
	}



	private static int[] input(int number) {
		// TODO Auto-generated method stub
		int arr[]=new int[number];
		Scanner sc=new Scanner(System.in);
		for (int i = 0; i < number; i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	
	
	public static void dispaly(int arr[]) {
		System.out.print("[ ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.print("]");
	}
	
	
}
