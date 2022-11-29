package javabasic;

public class ConstructorDemo
{
	int id=20;//instance
	String name="Dipali";
	ConstructorDemo()
	{
		System.out.println(id);
		System.out.println(name);
	}
	ConstructorDemo(int a,String n)//local a=21,n=manoj
	{
		System.out.println(a+" "+n); 
	}
public static void main(String[] args) 
{
		ConstructorDemo c1=new ConstructorDemo();//default
		ConstructorDemo c2=new ConstructorDemo(21,"manoj");
		
		
		
	}

}
