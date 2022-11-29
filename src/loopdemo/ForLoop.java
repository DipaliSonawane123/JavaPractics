package loopdemo;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) 
	{
		for (int a=1;a<=4;a++) {
			for(int b=4;b>=4;b--) {
				System.out.print( " 1" );
			}System.out.println();
		}
		//1 1 1 1
		//2 2 2 2
		//3 3 3 3
		//4 4 4 4
		/*for (int a=1;a<=4;a++) {
			for(int b=1;b<=4;b++) {
				System.out.print( a+" " );
			}System.out.println();
		}*/
		
		//1  2  3  4
		//5  6  7  8
		//9 10 11 12
		/*int k=1;
		for(int a=1;a<=4;a++) {
			for(int b=1;b<=4;b++) {
				System.out.print(k+"    ");
				k++;
			}System.out.println();
		}*/
		//1 2 3 4
		//1 2 3 4
		//1 2 3 4
		//1 2 3 4
		/*for (int a=1;a<=4;a++) {
			for(int b=1;b<=4;b++) {
				System.out.print( b+" " );
			}System.out.println();
		}*/
		//star pattern matrix
		/*for(int r=1;r<=4;r++)//row|
		{
			for(int c=1;c<=4;c++) {
				System.out.print("      *");
			}System.out.println();		}*/
		//print 1 to 100 table
		//nested for loop
		/*Scanner sc=new Scanner (System.in);//to make code dyanamic means to accept range with we want

		System.out.println("Enter Two Number");
		int n=sc.nextInt();
		int k=sc.nextInt();
		
	 	for (int n1=1;n1<=10;n1++)//row
	 	{
			for(int n2=n;n2<=k;n2++)//column
			{
				System.out.print(n1*n2+" \t");
	}
			System.out.println();
		}sc.close();*/
		/*//table of 2 (logic for this )
		2 *1=2
		2*2=4
		2*3=6
		2*4=8
		2*5=10
		2*6=12
		2*7=14
		2*8=16
		2*9=18
		2*10=20*/
		//Scanner sc=new Scanner(System/*class*/.in);
	//System.out.println("Enter no");//for dynamic means for console printing
		//int n=sc.nextInt();//for all table
		//int n=2;
		//for (int n1=1;n1<=10;n1++) {
			//System.out.println(n*n1);
		//}
	//	sc.close();
		
		
		
		//for loop 

		/*for(int num=1;num<=10;num++) {
			System.out.println(num);
		}
//while loop
		int num =1;
		while(num<=10) {
				System.out.println(num);
				num ++;
				 }
		//do while
		int num1 =1;
		do
		{
		System.out.println(num1);
		num1++;
		
		}while (num<=10);*/
	}

}
