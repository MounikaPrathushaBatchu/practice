package practice;

import java.util.Scanner;

public class TwoMaxNumsOfArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of elements for an Array : ");
		int size = scanner.nextInt();
		int array[] = new int[size];
		System.out.println("enter "+size +" elements for array");
		for(int i=0; i<array.length; i++) {
			array[i]=scanner.nextInt();
		}
		int largestOne,largestTwo,temp;
		largestOne = array[0];
		largestTwo = array[1];
		if(largestOne<largestTwo) {
			temp = largestOne;
			largestOne = largestTwo;
			largestTwo = temp;
		}
		for(int i=2;i<array.length;i++) {
			if(array[i]>largestOne) {
				largestTwo = largestOne;
				largestOne = array[i];
			}
			else if(array[i] > largestTwo && array[i] != largestOne){
				largestTwo = array[i];
			}
		}
		System.out.println("the first largest element in array is " +largestOne);
		System.out.println("the second largest element in array is " +largestTwo);
	}
}
