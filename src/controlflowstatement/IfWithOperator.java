package controlflowstatement;
import java.util.Scanner;
//program for enter  any charter and print "it is an aplhabet"
public class IfWithOperator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter alphabet");
		 char c1=sc.nextLine().charAt(0);
		if(c1>='a'&&c1<='z'||c1>='A'&&c1<='Z') 
		{
			System.out.println(c1+" is alphabet");
		} else {
			System.out.println(c1+" is not aplhabet");
		}
		 sc.close();
	}

}
