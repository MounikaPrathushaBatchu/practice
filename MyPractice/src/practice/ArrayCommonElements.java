package practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ArrayCommonElements {
	private static void CommonElements(String[] array1,String[] array2) {
		Set<String> set = new HashSet<>();
		for(int i=0;i<array1.length;i++) {
			for(int j=0;j<array2.length;j++) {
				if(array1[i] == array2[j]) {
					set.add(array1[i]);
					break;
				}
			}
		}
		for(String i : set) {
			System.out.println(i+" ");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter first array size");
		int size1 = scanner.nextInt();
		String[] array1 = new String[size1];
		System.out.println("enter "+size1+" elements for array");
		for(int i=0;i<array1.length;i++)
			array1[i] = scanner.next();
		
		System.out.println("enter second array size");
		int size2 = scanner.nextInt();
		String[] array2 = new String[size2];
		System.out.println("enter "+size2+" elements for array");
		for(int i=0;i<array2.length;i++)
			array2[i] = scanner.next();
		
		System.out.println("Array1 : "+Arrays.toString(array1));
		System.out.println("Array2 : "+Arrays.toString(array2));
		System.out.println("Common elements in two arrays are: ");
		CommonElements(array1,array2);
	}
}
