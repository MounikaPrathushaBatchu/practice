package practice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter any string : ");
		String string = scanner.nextLine();
		String result = stringReverse(string);
		System.out.println(result);

	}
	static private String stringReverse(String string) {
		if((string == null) || (string.length()<=1))
			return string;
		else
			return stringReverse(string.substring(1))+string.charAt(0);
	}
}
