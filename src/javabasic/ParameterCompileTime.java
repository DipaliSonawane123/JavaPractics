package javabasic;

public class ParameterCompileTime 
{
	public void add()//declare *without return value
	{
		int a=10,b=20;
		System.out.println("Addition is :"+(a+b));
	}
	public void sub(int a,int b) //a=100,b=50
	{
		System.out.println("Subtraction is :"+(a-b));
	}
		// To return value from method we use return keyword
		public int mul(int a,int b)//a=10,b=10
		{ 
			
			return a*b;//it will return output calling method
			}

	public static void main(String[] args) 
	{

	ParameterCompileTime p1=new ParameterCompileTime();
		p1.add();//calling
		//ParameterCompileTime p2=new ParameterCompileTime();
		//p2.sub(100, 50);
		p1.sub(100, 50);//calling with parameter
		System.out.println(p1.mul(10, 10));
		//one method to print return value
		//int res=p1.mul(10, 10);//with return keyword declere one variable to print result and
		//System.out.println("multiplication is :"+res);// and print it

	}

}
