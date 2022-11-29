 package javabasic;

public class CallbyValueReferance 
{
	 public void display(CallbyValueReferance obj) //obj=assign value to c1
	 {
		 System.out.println("This is call by reference");
		 obj.show("jay");
		 
	 }
	 public void disco( FirstCode obj2) //obj=assign value to f1
	 {
		System.out.println("this is call by referance");
		 obj2 .accept();
	 }
		
			 public void show(String name)//name =sarang
	 {
		 System.out.println("This is call by value");
		 System.out.println("name of student :"+name);
	 }
	
	 

	public static void main(String[] args) {
		CallbyValueReferance c1=new CallbyValueReferance();
		c1.show("Sarang");//call by value
		
		//call by referance---object reference variable
		c1.display(c1);	//call by reference
	FirstCode f1=new FirstCode();
	c1.disco(f1);
}
	}


