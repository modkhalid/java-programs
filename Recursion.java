package coding;

import java.util.ArrayList;

public class Recursion {

	public static void main(String[] args) {
//		codesOfString("1125", "");
//		System.out.println(codesOfStringArli("11452365213256"));
//		removeDuplicate("hellomoodkhaaaaaaaaaaaaaaaaaaaaalid", "");

//		int arr[] = { 1, 4,3, 8, 6, 5, 10,9,3,2,1,0,-1,18,20,12,16,10 };
//		selectionSort(arr, 0, arr.length - 1);
//		for (int val : arr) {
//			System.out.print(val + " ");
//		}

		String str = "abbaaaaaabbaaaaaabb";
		if (str.charAt(0) == 'a') {
			System.out.println(isobidient(str));
		} else {
			System.out.println(false);
		}
	}

	public static void codesOfString(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}

		int c = Integer.parseInt(str.substring(0, 1)) + 'a' - 1;
		codesOfString(str.substring(1), ans + (char) c);

		if (str.length() >= 2) {
//			c=Integer.parseInt(str.substring(0, 1))+'a'-1;
			String str1 = str.substring(0, 2);
			c = Integer.parseInt(str1) + 'a' - 1;
			if (c <= 26 + 96) {
				codesOfString(str.substring(2), ans + (char) c);
			}
		}

	}

	public static ArrayList<String> codesOfStringArli(String str) {
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		ArrayList<String> mr = new ArrayList<>();
		int c = Integer.parseInt(str.substring(0, 1)) + 'a' - 1;
		ArrayList<String> rr1 = codesOfStringArli(str.substring(1));
		for (String val : rr1) {
			mr.add((char) c + val);

		}

		if (str.length() >= 2) {
			c = Integer.parseInt(str.substring(0, 2));
			if (c <= 26) {
				c += 'a' - 1;
				ArrayList<String> rr2 = codesOfStringArli(str.substring(2));
				for (String val : rr2) {
					mr.add((char) c + val);
				}
			}
		}
		return mr;

	}

	public static void removeDuplicate(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans);
			return;

		}

		if (str.length() >= 2) {
			if (str.charAt(0) == str.charAt(1)) {
				removeDuplicate(str.substring(1), ans);
			} else {
				removeDuplicate(str.substring(1), ans + str.charAt(0));
			}
		} else {
			removeDuplicate(str.substring(1), ans + str.charAt(0));
		}
	}

	public static int findMinndex(int arr[], int lo, int hi) {

		if (lo == hi)
			return lo;

		int rr = findMinndex(arr, lo + 1, hi);
		if (arr[lo] < arr[rr]) {
			rr = lo;
		}
		return rr;
	}

	public static void selectionSort(int arr[], int si, int ei) {
		if (si == ei)
			return;
		int min = findMinndex(arr, si, ei);
//		System.out.println(arr[min]+" "+min);
		int temp = arr[si];
		arr[si] = arr[min];
		arr[min] = temp;
		selectionSort(arr, si + 1, ei);
	}

	public static boolean isobidient(String str) {
		char ch = str.charAt(0);

		if (str.length() >= 1 && ch == 'a') {
			if (str.length() == 1) {
				return true;

			} else if (str.length() >= 2 && str.charAt(1) == 'a') {
				return isobidient(str.substring(1));

			} else if (str.length() >= 3 && str.substring(1, 3).equals("bb")) {
				return isobidient(str.substring(1));

			}
		} else if (str.length() >= 2 && str.substring(0, 2).equals("bb")) {
			if (str.length() == 2) {
				return true;
			} else if (str.length() >= 3 && str.charAt(2) == 'a') {
				return isobidient(str.substring(2));
			}
		}

		return false;
	}

}