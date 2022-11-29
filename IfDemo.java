package mypractic;

import java.util.Scanner;

public class IfDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int age=sc.nextInt();
	    if (age>=18 ) {
		System.out.println("valid");
		}
		else {
			System.out.println("not valid");
		}
	    Scanner sc1   =new Scanner(System.in);
		System.out.println("Enter your Alphabet");
		
		 char name=sc1.nextLine().charAt(0);
		 switch(name) {
		 case 'a','A':
			 System.out.println("vowel");
		 break;
		 case 'e','E':
			 System.out.println("vowel");
		 break;
		 case 'i','I':
			 System.out.println("vowel");
		 break;
		 
		 case 'o','O':
			 System.out.println("vowel");
		 break;
		 case 'u','U':
			 System.out.println("vowel");
		 break;
		 default:
			 System.out.println("not vowel");
		 }
		 sc.close();
		 sc1.close();
}}
