package practice;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = scanner.nextInt();
		int duplicate,remainder,result = 0,n = 0;
		duplicate = number;
		while(duplicate != 0) {
			duplicate /= 10;
			++n;
		}
		duplicate = number;
		while(duplicate != 0) {
			remainder = duplicate % 10;
			result += Math.pow(remainder, n);
			duplicate /= 10;
		}
		
//		for(;duplicate != 0;duplicate/=10,++n);
//		duplicate = number;
//		for(;duplicate != 0;duplicate/=10) {
//			remainder = duplicate % 10;
//			result +=Math.pow(remainder, n);
//		}
		if(result == number)
			System.out.println(number + " is an Armstrong number");
		else
			System.out.println(number + " is not an Armstrong number");
	}
}
