package javabasic;

public class VariableDwemo {
	int id=20;//instant variable* declare within the class without the static keyword
	String name="Dipali";//instant variable
	static String cname="Manoj";//static variable *declare variable inside the class outside any method/block with static keyword
	public void show() {
		int marks=80;//local variable*
		System.out.println(marks);//80
		System.out.println(cname);
		System.out.println(name);
	}
	public static void main(String[] args) {
    int marks=90;//local
    System.out.println(marks);//90
    System.out.println(cname);
    VariableDwemo v1=new VariableDwemo();
    v1.show();
    

	}

}
