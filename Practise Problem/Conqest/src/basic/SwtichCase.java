package basic;

import java.util.Scanner;

public class SwtichCase {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter day mumber(1to7): ");
		int day=sc.nextInt();
		
		switch(day) {
		case 1:
			System.out.println("Monday");
			break;
			
		case 2:
			System.out.println("Thuesday");
			break;
		case 3:
			System.out.print("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		case 7:
			System.out.println("sunday");
			break;
		default:
			System.out.println("INVALID");
			break;
		

	

		
	}
		sc.close();

}
}
