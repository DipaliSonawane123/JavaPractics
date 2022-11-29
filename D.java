package mypractic;

public class D implements B,C{
	
	

	public static void main(String[] args) {
		D d=new D();
		d.a();
		d.b();
		d.c();

	}

	@Override
	public void a() {
		System.out.println("A");
		
	}

	@Override
	public void c() {
		System.out.println("C");
		
	}

	@Override
	public void b() {
		System.out.println("B");
		
	}

}
