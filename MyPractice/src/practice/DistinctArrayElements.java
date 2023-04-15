package practice;
import java.util.Scanner;
public class DistinctArrayElements {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter size for array");
		int size = scanner.nextInt();
		int array[] = new int[size];
		System.out.println("enter "+size+" elements for array");
		for(int i=0;i<array.length;i++) {
			array[i] = scanner.nextInt();
		}
		System.out.println("the distinct elements are:");
		DistinctArrayElements.printDistinctElements(array);
	}
	static void printDistinctElements(int[] array) {
		for(int i=0;i<array.length;i++) {
			boolean isDistinct = false;
			for(int j=0;j<i;j++) {
				if(array[i] == array[j]) {
					isDistinct = true;
					break;
				}
			}
			if(!isDistinct) {
				System.out.println(array[i]+" ");
			}
		}
	}
}
