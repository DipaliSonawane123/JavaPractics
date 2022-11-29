package controlflowstatement;

import java.util.Scanner;

public class NestedIfDemo {
public static void main(String[]args) {
	System.out.println("Program Start");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	/*if(num==0)//== comparator operator
	{
		System.out.println("zero");
	}else if(num==1)//== comparator operator
	{
		System.out.println("One");
	}else if(num==2)//== comparator operator
	{
		System.out.println("Two");
	}else if(num==3)//== comparator operator
	{
		System.out.println("Three");
	}else if(num==4)//== comparator operator
	{
		System.out.println("Four");
	}else {
		System.out.println("Invalid number");
	}*/
	if (num==0||num==1||num==2||num==3||num==4) {
		System.out.println("valid number");
	}else {
		System.out.println("Invalid number");
	}
	sc.close();
}

}
