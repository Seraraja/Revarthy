package org.java;

import java.util.Scanner;

public class Scannerssss {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		//int
		System.out.println("Enter your pincode..");
		int pincode=s.nextInt();
		System.out.println(pincode);
		
		//long
		System.out.println("Enter your phone..");
        long phone = s.nextLong();
        System.out.println("My phone number is..."+phone);
        
        //float
		System.out.println("Enter your salary..");
		float salary = s.nextFloat();
		System.out.println("My salary.."+salary);

		
		//string
		System.out.println("Enter your name..");
		String name = s.next();
		System.out.println("My name is.."+name);

		//string
		System.out.println("Enter your name..");
		String name1 = s.nextLine();
		System.out.println("My name is.."+name1);


		//character
		System.out.println("Enter your gender..");
		char gender = s.next().charAt(0);
		System.out.println("My gender is.."+gender);

		
		String value = s.next();
		
		for(int i=value.length()-1;i>=0;i--) {
			char t = value.charAt(i);
			System.out.println(t);
		}
		
		
		
	}
	
}
