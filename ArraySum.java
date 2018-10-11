package coding;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[]= {7,9,3,5};
//		int arr2[]= {1,8,5,2,7};
//		int res[]=sumOfArray(arr, arr2);
//		for(int i=0;i<res.length;i++) {
//			System.out.print(res[i]+" ");
//		}
		System.out.println(strPal("amama"));

	}
	
	
	public static int[] sumOfArray(int arr1[],int arr2[]) {
		int res[]=new int[Math.max(arr1.length, arr2.length)+1];
		int carry=0;
		int i=arr1.length-1;
		int j=arr2.length-1;
		int counter=res.length-1;
		while(i>=0 && j>=0) {
			int temp =arr1[i]+arr2[j]+carry;
			if(temp>9) {
				res[counter]=temp-10;
				carry=1;
			}
			else {
				res[counter]=temp;
				carry=0;
			}
			j--;i--;
			counter--;
		}
		while(i>=0) {
			int temp =arr1[i]+carry;
			if(temp>9) {
				res[counter]=temp-10;
				carry=1;
			}
			else {
				res[counter]=temp;
				carry=0;
			}
			i--;
			counter--;
		}
		while(j>=0) {
			int temp =arr2[j]+carry;
			if(temp>9) {
				res[counter]=temp-10;
				carry=1;
			}
			else {
				res[counter]=temp;
				carry=0;
			}
			counter--;
			j--;
		}
		res[counter]=carry;
		return res;
	}

	
	public static int strPal(String str) {
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j < str.length(); j++) {
				String temp=str.substring(i,j);
				if(IsPalindrome(temp)) {
					count++;
					System.out.println(temp);
				}
			}
		}
		return count;
	}
	
	
	
	/**
	public static boolean isPallindrome(String str) {
		int j=str.length()-1;
		for (int i = 0; i < j; i++,j--) {
			if(str.charAt(i)!= str.charAt(j)) {
				return false;
			}
		}
		return true;
	}
	*/
	
	
	
	public static boolean IsPalindrome(String str) {
		for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
			if (str.charAt(i) != str.charAt(j))
				return false;
		}
		return true;
	}
	
	
	
	
	
	
	
	
	
}
