package javabasic;
//Data
public class EmployeeData {
	int id= 20;
	String name="Dipali";
	//method
	public void show()
	{	
	System.out.println("Employee id is:"+id);
	System.out.println("Employee name is:"+name);
	}
	public static void main(String[] args) {
		EmployeeData E1= new EmployeeData();
		E1.show();
	}
}

