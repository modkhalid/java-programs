package coding;

import java.util.Scanner;

public class ArrayMirroInverse {

	public static void main(String[] args) {
		int arr[];
		arr = input(4);
		dispaly(arr);
//		rotateRight(arr, 3);
		mirrorInverse(arr);
		System.out.println();
		dispaly(arr);
	}

	private static int[] input(int number) {
		// TODO Auto-generated method stub
		int arr[] = new int[number];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < number; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	public static void dispaly(int arr[]) {
		System.out.print("[ ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("]");
	}

	public static void reverseArray(int arr[]) {
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
	}

	public static void rotateRight(int arr[], int rotation) {
		rotation = rotation % arr.length;
		if (rotation < 0)
			rotation = arr.length - rotation;
		for (int i = 0; i < rotation; i++) {
			int temp = arr[arr.length - 1];
			for (int j = arr.length - 1; j > 0; j--) {
				arr[j] = arr[j - 1];
			}
			arr[0] = temp;
		}
	}

	public static void mirrorInverse(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			arr[arr[i]] = i;
		}
	}

}
