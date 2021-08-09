import java.util.Scanner;


public class Typecasting {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter int valu in float datatype variable: ");
		float f1= sc.nextFloat();
		
		System.out.println("Entered value is: " + f1);
		//above lines demonstarate automatice type conversion.......
		
		//below linews demonstrate type casting..... its explicite casting....
		int n1 = (int) (67.909f);
		System.out.println("type conversion demo: " + n1);
	
		// below code for explaning type promotion in expression.......
		int a= 258;
		byte b = (byte) (a);
		System.out.println(b);   
		// above demo shows 1. byte can store only 256 .... so exeding range it divides it and printing remender.....
		
		
		byte x = 12;
		byte y = 32;
		byte z = 99;
		int number = ('a');
		int w = x*y/z;    
		System.out.println(w + "    demo of automatc type conversion " + number); // above line of codes... it automatically treates it as an integer.... and evaluates....
		
		
	}

	
}
