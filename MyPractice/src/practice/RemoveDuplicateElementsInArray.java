package practice;

import java.util.Scanner;

public class RemoveDuplicateElementsInArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter array size : ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		System.out.println("enter " +size+" of elements for an array");
		for(int i=0;i<array.length;i++)
			array[i] = scanner.nextInt();
		int[] duplicate = new int[size];
		
		int a=0;
		for(int i=0;i<array.length;i++) {
				if(array[i] != array[i+1]) 
					duplicate[a++] = array[i];
			}
			duplicate[a++] = array[(array.length)-1];
		for(int k=0;k<a;k++) {
			System.out.println(duplicate[k]+" ");
		}
	}

}
