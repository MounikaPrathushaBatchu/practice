package practice;
import java.util.Scanner;
public class FactorialNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter any number : ");
		int number = scanner.nextInt();
		System.out.println("Factorial of "+number+" is : "+Factorial(number));

	}
	static int Factorial(int n) {
		if(n == 0||n == 1)
			return 1;
		return n = n*Factorial(n-1);
	}
}
