package practice;
import java.io.*;
public class ArrayEleRepeatCounter  {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Size of the Array: ");
		int size = Integer.parseInt(br.readLine());
		int[] array = new int[size];
		for(int a=0;a<size;a++)
		{
			System.out.print("Enter the " +(a+1)+ " Array values: ");
			array[a] = Integer.parseInt(br.readLine());
		}
		int[] duplicate = new int[array.length];
		int visited = -1;
		int count;
		for(int b=0;b<array.length;b++)
		{
			count = 1;
			for(int c=b+1;c<array.length;c++)
			{
				if(array[b] == array[c])
				{
					count++;
					duplicate[c] = visited;
				}
			}
			if(duplicate[b] != visited)
			{
				duplicate[b] = count;
			}
		}
		System.out.println("-------------------------");
		System.out.println("Element | Frequency");
		System.out.println("-------------------------");
		for(int d=0;d<duplicate.length;d++)
		{
			if(duplicate[d] != visited)
			{
				System.out.println(array[d]+ " -----------> " +duplicate[d]);
			}
		}

	}

}
