package practice;

import java.util.Scanner;

public class SumOfArrayElements {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter array size : ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		System.out.println("enter " +size+" of elements for an array");
		for(int i=0;i<array.length;i++)
			array[i] = scanner.nextInt();
		AddArray(array);
	}
	static void AddArray(int array[]) {
		int total = 0;
		for(int j=0;j<array.length;j++) {
			total+=array[j];
		}
		System.out.println(total);
	}

}
