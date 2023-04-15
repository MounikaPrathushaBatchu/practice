package practice;
import java.util.Scanner;
public class ArrayDuplicateNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter array size : ");
		int size = scanner.nextInt();
		int array[] = new int[size];
		System.out.println("enter "+size+" elements for array");
		for(int i = 0; i<array.length;i++)
			array[i] = scanner.nextInt();
		for(int k=0;k<array.length;k++) {
			for(int j =k+1;j<array.length;j++) {
				if(array[k]==array[j])
					System.out.println("the duplicate elements are :"+array[j]);
			} 
		}
	}

}
