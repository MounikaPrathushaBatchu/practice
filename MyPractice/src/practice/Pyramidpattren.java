package practice;

import java.util.Scanner;

public class Pyramidpattren {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter any number : ");
		int number = scanner.nextInt();
		for(int i=0;i<number;i++) {
			for(int j=0;j<number-i;j++)
				System.out.print(" ");
			for(int k=0;k<=i;k++)
				System.out.print("* ");
			System.out.println(" ");
		}
	}

}
