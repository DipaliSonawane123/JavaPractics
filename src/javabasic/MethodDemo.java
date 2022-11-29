package javabasic;

public class MethodDemo 
{
	public void accept() {
		System.out.println("This is instance method");
		
	}
	public static void show() {
		System.out.println("This is Static method");
		
	}

	public static void main(String[] args) {
		 MethodDemo.show();
		 MethodDemo m1=new MethodDemo();
		 m1.accept();
		//m1.show();
		}

}
