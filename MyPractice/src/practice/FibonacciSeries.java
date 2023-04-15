package practice;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter limit for Fibonacci Series : ");
		int limit = scanner.nextInt();
		int a=0,b=1,c;
		c=a+b;
		System.out.print(a+" "+b+" ");
		//limit-=2;
		for(int i=0;i<limit-2;i++) {
			System.out.print(c+" ");
			a=b;b=c;c=a+b;
		}
	}
}
