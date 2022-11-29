package javabasic;

public class StudentData {
//data
	int id =18;
	String name ="Ajay";
	//method
public void display() {
	System.out.println(id);
	System.out.println(name);
}
	public static void main(String[] args) {
		//to call class member we need to object to create
		StudentData s1=new StudentData();
		s1.display();
		
	}

}
