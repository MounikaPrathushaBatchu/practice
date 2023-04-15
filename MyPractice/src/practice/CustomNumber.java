package practice;
import java.util.Scanner;
public class CustomNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter any number : ");
		String number = scanner.nextLine() ;
		if(number.length() != 10)
			System.out.println("number must have 10 digits");
		if(number.length() == 10) {
			System.out.print("("+number.substring(0, 3)+")");
			System.out.print(" "+number.substring(3, 6));
			System.out.print("-"+number.substring(6));
		}
	}

}
