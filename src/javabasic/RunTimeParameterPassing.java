package javabasic;

import java.io.IOException;
import java.util.Scanner;

public class RunTimeParameterPassing {
	public void show(String n) {
		System.out.println("Student name is calling fron scanner:"+n);
	}

	public static void main(String[] args) throws IOException
	{
		//method1:System.in.read()
		//System.out.println("Enter your age :");
		// int age=System.in.read();
		 // read() will accept single character so it store(return) ascii
		 //System.out.println("age is :"+age);//ascii value
		// System.out.println("age is :"+(char)age); //to convert ascii to original data need type conversion
		 
		 
		 //scanner class have its own method
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter your age");
		int age1= sc.nextInt();
System.out.println("age"+age1);
sc.close();//to relase the memery
		RunTimeParameterPassing r1=new RunTimeParameterPassing();
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter your name");
		String s1=sc1.nextLine();
		System.out.println("name is : "+s1);
		sc1.close(); 
		r1.show(s1);
	}

}
