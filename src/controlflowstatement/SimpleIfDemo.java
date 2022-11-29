package controlflowstatement;
import java.util.Scanner;
public class SimpleIfDemo {

	public static void main(String[] args) {
		System.out.println("Proggram start");
		Scanner sc= new Scanner(System.in);
		int age =sc.nextInt();
		if(age>=18) {
			System.out.println("Valid");
		}
		
			System.out.println("Program End");
		
		sc.close();
		}

}
