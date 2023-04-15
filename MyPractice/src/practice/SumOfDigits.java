package practice;

import java.util.Scanner;

public class SumOfDigits {
	
	private static int DigitsSum(int num) {
		if(num == 0)
			return 0;
		return num % 10 + DigitsSum(num/10);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number : ");
		int number = scanner.nextInt();
		int result = DigitsSum(number);
		System.out.println("sum of digits of " +number + " is " +result);
	}
}
