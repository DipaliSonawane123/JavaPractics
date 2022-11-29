package javabasic;

public class DatatypeDemo {

	public static void main(String[] args) {
		
        //boolean true/false(0/1) 1bit
		boolean status =true;
		System.out.println("Boolean data is :"+status);//true
		status=false;
		System.out.println("Upadated value is :"+status);//false
		 String s1="Dipali";
		 String s2="Dipali";
		 if(s1==s2) {
			 System.out.println("String are equals");
			 }else {
				 System.out.println("String are not eual");
			 }
				 
			 
		 }
		 
		 
		
		//character 2byte used to store single character
		char c1='A';
		System.out.println("Charactor is :"+c1);
		
		char c2='$';
		System.out.println("char data is :"+c2);
		
		char c3=97;//accepting ASCII code and storing its character
		System.out.println("char data is:"+c3);//a
		
		
		//byte 1 byte  -128 to127
		byte b1=127;
		System.out.println("byte data is :"+b1);
		
		
		//short 2byte 32768
		short s1=32000;
		System.out.println("short data is:"+s1);
		
		
		//int 4byte
		int i1=50000;
		System.out.println("int data is :"+i1);
		
		
		//long 8 byte
		long l1 =99999999999L;//int data not consider as default then use sufix
		System.out.println("long byte is:"+l1);
		
		
		//floating point 1.float2.double (by defult)
		//duble 8 byte (16 decimal digit)
		double d1=89.70d;
		System.out.println("double is :"+d1);
		
		
		//float 4 byte (8 decimal digit)
		float f1=12345612345612345656.70F;
		System.out.println("float is :"+f1);
		System.out.println("**********************************************");
		
		
		// type casting
		//Implicit (happen automatic)
		int a=100;
		long b=a;
		System.out.println("integer to long conversion :"+b);
		
		char cc1='A';
		int num1=cc1;//ascii of A//65
		System.out.println("Char to int data is :"+num1);
		
		float f2=num1;//65
		System.out.println("int to float data is :"+f2);
		
		
		//Explicite (happen manually)-- using casting operator
		double d2=49.98;
		int k=(int)/*casting operator*/d2;
		System.out.println("Double to integer conversion :"+k);
		
		char cc2=(char)num1;//ascii char gives
		System.out.println("int to char data is :"+cc2);
		
		int num2=(int)f2;
		System.out.println("float to int data is :"+num2);
		
		
		
		 
		 
		
	}

}
