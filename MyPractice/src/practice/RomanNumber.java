package practice;

import java.io.*;
class RomanNumber 
{ 
	public static void main(String []ar)throws IOException 
	{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a Decimal Number: ");
		int num = Integer.parseInt(br.readLine()); 
      		RomanNumber rn = new RomanNumber();
		String str = rn.intToRoman(num);
		System.out.print("The Roman Equivalent of "+num+ " is " +str);
	} 
	String intToRoman(int n) 
	{ 
		String m[] = {"","M", "MM", "MMM"}; 
		String c[] = {"","C", "CC", "CCC", "CD", "D", 
							"DC", "DCC", "DCCC", "CM"}; 
		String x[] = {"","X", "XX", "XXX", "XL", "L", 
							"LX", "LXX", "LXXX", "XC"}; 
		String i[] = {"","I", "II", "III", "IV", "V", 
							"VI", "VII", "VIII", "IX"}; 	
		String thousands = m[n/1000]; 
		String hundereds = c[(n%1000)/100]; 
		String tens = x[(n%100)/10]; 
		String ones = i[n%10]; 
		String result = thousands + hundereds + tens + ones; 
		return result; 
	}
} 
