package coding;

import java.util.Scanner;

public class Arrayv {

	public static void main(String[] args) {
//		System.out.println(power(2, 10));
//		Scanner sc=new Scanner(System.in);
//		
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		swap(a,b);
//		System.out.println(a+" ");
	}

	private static int numberOfDigits(int a) {
		int count = 0;
		while (a != 0) {
			count++;
			a = a / 10;
		}
		return count;
	}

	public static boolean isArmstrong(int number) {
		int temp = number;
		int sum = 0;
		while (temp != 0) {
			int rem = temp % 10;
			sum += Math.pow(rem, 3);
			temp /= 10;
		}
		return sum == number;
	}

	public static void printAllArmStrongNumber(int ll, int ul) {
		for (int i = ll; i < ul; i++) {
			if (isArmstrong(i)) {
				System.out.println(i);
			}
		}
	}

	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

	public static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}

	public static int power(int base, int r) {
		if (r != 0) {
			return base * power(base, r - 1);
		}
		return 1;
	}

	public static void printAllPrimeNumber(int ll, int ul) {
		for (int i = ll; i <= ul; i++) {
			if(isPrimeNumber(i))
				System.out.print(i+" ");
		}
	}

	public static  boolean isPrimeNumber(int number) {
		boolean flag = true;
		for (int i = 2; i < number / 2; i++) {
			if (number % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	public static void swap(int a, int b) {
		int temp=a;
		a=b;
		b=temp;
		
	}










}
