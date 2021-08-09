import java.util.Scanner;


public class PractTwo {

	public static void readData(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Progran for calculating discount on product: ");
		System.out.println("Enter pid: ");
		int pid = sc.nextInt();
		
		System.out.println("Enter Product Name: ");
		String pname = sc.next();
		
		System.out.println("Enter Price: ");
		float price = sc.nextFloat();
		
		calDisc(price);
	}
	
	
	
	private static void calDisc(float price) {
		float disc = price * 0.02f;
		
		System.out.println("Discount calculated is: " + disc);
	}



	public static void main(String[] args) {
		readData();
		
}

}
