package controlflowstatement;

public class MethodChanningDemo
{
	//public void startbrowser();//replace void with class name
	public MethodChanningDemo startbrowser() {
		System.out.println("start browser");
		return this;//use this return and this keyword for acess current object of this method
		
	}
	public  MethodChanningDemo openapplication() {
		System.out.println("open application");
		return this;
	}
	public MethodChanningDemo closebrowser() 
	{
		System.out.println(" close broswer");
		return this;
	}
public static void main(String[]agrs)
{
	MethodChanningDemo m1=new MethodChanningDemo();
	//m1.openapplication();//simple method
	////m1.openapplication();//simple method
	//m1.closebrowser();//simple method
	m1.startbrowser().openapplication().closebrowser();// method channing
	
	}
}
