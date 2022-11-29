package javabasic;

public class WrapperClass
{
	public static void main(String[] args) {
		
		String s1 ="100";
		System.out.println(s1+100);//100100
		int i1 =Integer.parseInt(s1);
		System.out.println("String to int data is :"+i1);
		System.out.println("addition is :"+(i1+100));//200
		
		String s2 ="42.32";
		System.out.println("String data is :"+s2);
		double d1 =Double.parseDouble(s2);
		System.out.println("String to double data is :"+d1);
		System.out.println("addition is :"+(d1+10.10));
		
		String s3="Dipali";
		System.out.println("String data is :"+s3);
		 boolean b1=Boolean.parseBoolean(s3);
		 System.out.println("String to boolean data is :"+b1);
		 
		 String s4="True";
			System.out.println("String data is :"+s4);
			 boolean b2=Boolean.parseBoolean(s4);
			 System.out.println("String to boolean data is :"+b2);
			 
			 String s6="70.67";
				System.out.println("String data is :"+s6);
				 float f =Float.parseFloat(s6);
				 System.out.println("String to float data is :"+f);
				 
				 String s7="True";
					System.out.println("String data is :"+s7);
					char c3 =s7.charAt(1);
					 System.out.println("String to char data is :"+c3);
					 
					 String s8="7000";
						System.out.println("String data is :"+s8);
						 long l =Long.parseLong(s8);
						 System.out.println("String to float data is :"+l);
			 
			 // primitive to object conversion
			 int i2 =900;
			 System.out.println( "addtion is :"+(i2+100));//1000
			String s5= String.valueOf(i2);
			System.out.println( "int to string :"+s5);
			System.out.println("addition is :"+(s5+100));//900100
			
			char c1 ='R';
			 String ss2=String.valueOf(c1);
			 System.out.println( "char to String is :"+ss2);
			 
			 float f2 =900.20f;
			String s11= String.valueOf(f2);
			System.out.println( "float to string :"+s11);
			
			 double d2 =900d;
				String s10= String.valueOf(d2);
				System.out.println( "double to string :"+s10);
				
				boolean bb2=true;
				 String  s15=String.valueOf(bb2);
				System.out.println("boolean to string :"+s15);
				
				long l3 =200l;
				 String s16=String.valueOf(l3);
				 System.out.println( "long to String is :"+s16);
				
				 
			 
			
	}
}
