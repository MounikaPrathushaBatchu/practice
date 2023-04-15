package practice;
import java.util.Scanner;
public class CountFrequency {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter array size : ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		System.out.println("enter " +size+" of elements for an array");
		for(int i=0;i<array.length;i++)
			array[i] = scanner.nextInt();
		
		int count;
		int[] frequency = new int[size];
		
		for(int j=0;j<array.length;j++) {
			count = 1;
			for(int k=j+1;k<array.length;k++) {
				if(array[j]==array[k]) {
					count++;
				}
			}
		}
	}

}
