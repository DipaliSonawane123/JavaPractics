package controlflowstatement;
import java.util.Scanner;
public class VowelTestUsingNestedIf {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter aplhabet");
		char c1 =sc.nextLine().charAt(0);//method to access char
		//String num=sc.nextLine();// second method for the String to char access
		//char c1=num.charAt(0);
		if (c1=='a'||c1=='A') {
			System.out.println(c1+ " vowel");
		}else 
			if (c1=='e'||c1=='E') {
			System.out.println(c1+ " vowel");
			}
			else if (c1=='a'||c1=='A') {
				System.out.println(c1+ " vowel");
			}else if (c1=='e'||c1=='E') {
				
			}else if (c1=='i'||c1=='I') {
				System.out.println(c1+ " vowel");
			}else if (c1=='o'||c1=='O') {
				System.out.println(c1+ " vowel");
			}else if (c1=='u'||c1=='U') {
				System.out.println(c1+ " vowel");
			}else {
				System.out.println(c1+ " non vowel");
				
			}
			sc.close();

	}

}
