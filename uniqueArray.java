package coding;

import java.util.HashMap;
import java.util.Scanner;

public class uniqueArray {
	public static void main(String[] args) {
		HashMap<Integer, Boolean> map=new HashMap<>();
		int arr[]=input(5);
//		int temp[]=new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			
			while(map.containsKey(arr[i])) {
				arr[i]++;
			}
		    map.put(arr[i], true);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
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
}
