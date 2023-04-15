package practice;

import java.util.Scanner;

public class PrimeNumbersSum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter limit : ");
		int limit = scanner.nextInt();
		int count,sum=0;
		for(int number=0;number<=limit;number++) {
			count=0;
			for(int i=2;i<=number/2;i++) {
				if(number%i==0) {
					count++;break;
				}
			}
			if(count==0 && number!=0)
				sum+=number;
		}
		System.out.println("the sum of prime numbers is : "+sum);
	}
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("enter first number :");
//		int start = scanner.nextInt();
//		System.out.print("enter second number :");
//		int end = scanner.nextInt();
//		System.out.println("the prime numbers in between "+start+" and"+end);
//		for(int i=start;i<=end;i++) {
//			if(isPrime(i))
//				System.out.println(i);
//		}
//		isPrime(number);
//		for(int i=2;i<=number/2;i++) {
//			if(number%i==0) {
//				count++;break;
//			}
//		}
//		if(count==0 && number!=0)
//			sum+=number;
//	}
//	System.out.println("the sum of prime numbers is : "+sum);
//}
//	static boolean isPrime(int number) {
//		if(number<=1)
//			return false;
//		for(int i=2;i<=number/2;i++) {
//			if(number%i == 0) {
//				return false;
//			}
//		}
//		//int sum = number;
//		return true;
//	}

}
