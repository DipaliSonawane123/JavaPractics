package javabasic;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

public class FileInputStreamExample {

	public static void main(String[] args) throws IOException {
		File file= new File("C:/Java Program/auto.jpg");
		 FileInputStream inputStream =new  FileInputStream(file);
		 byte bytes[] = new  byte [(int)file.length()];
		 int numOfBytes = inputStream.read(bytes);
		 System.out.println("Data copied sucessfully");
		 System.out.println(numOfBytes);
		 

	}

}
