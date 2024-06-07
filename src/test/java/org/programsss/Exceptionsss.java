package org.programsss;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exceptionsss {
	
	
	public static void product() throws ProductNotAvailable {
		Scanner s=new Scanner(System.in);
		String value = s.next();
		if(value.equals("iphone")) {
			System.out.println("Product available");
		}
		else {
			System.out.println("Not available");
			throw new ProductNotAvailable();
		}

	}
	
	

	public static void main(String[] args) throws IOException{
		try {
			product();
		} catch (ProductNotAvailable e) {
			System.out.println("Done");
		}
		
		//compile time
		File f=new File("");
		f.createNewFile();
		
		
		//NumberFormatException
		String a="5000rs";
		System.out.println(a+5000);
		
		int b = Integer.parseInt(a);
		System.out.println(b+5000);
//		
		//ArithmeticException
		
		System.out.println(1);
		try{
		   System.out.println(2/0);
		}
		
		finally {
			try {
			System.out.println(2/0);
			}
			catch(ArithmeticException e) {
				System.out.println("Ok");
			}
			catch(NullPointerException e) {
				System.out.println("Ok");
			}
			finally {
				System.out.println("Dine");
			}
		}
		
		System.out.println(3);
		
		
		
		
		
		
	}
}
