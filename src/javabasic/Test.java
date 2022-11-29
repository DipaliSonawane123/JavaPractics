package javabasic;

public class Test  implements  Runnable
{ 
public void main (String []args) throws InterruptedException {
Thread thread= new Thread(new Test());
System.out.println(thread.getState());
}
public void run () {
	 System.out.println(" Welcome");
}

}
