package controlflowstatement;
import java.util.Scanner;
public class SwitchClassDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		
		int num =sc.nextInt();
		switch(num) {
		case 0:
			System.out.println("zero");
			break;//use for run olny one (particular condition)condition
		
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
			default:
				System.out.print("invalid");
		}
	
sc.close();
	}

}
