package org.programsss;

public class Pattern {

	public static void main(String[] args) {
		
		//swap value
		int a=10;
		int b=20;
		
		//with using third var
		System.out.println("Before swap....a="+a+" b="+b);
		int c=0;
		c=a;  //c=10
		a=b;  //a=20
		b=c;  //b=10
		System.out.println("After swap....a="+a+" b="+b);

		//without using third var
		int a1=10;
		int b1=20;
		a1=a1+b1; //a=10+20=30  a=30
		b1=a1-b1; //b=30-20=10  b=10
		a1=a1-b1; //a=30-10=20  a=20
		System.out.println("After swap....a1="+a1+" b1="+b1);
		
		//pattern
		for (int i = 0; i<5; i++) { //row
			for(int j=0;j<5;j++) {   //column
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("=======");
		
		//right triangle
		for (int i = 0; i<5; i++) { //row
			for(int j=0;j<i+1;j++) {   //
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("=======");

		//inverted right triangle
		
		for (int i = 0; i<5; i++) { //row
			for(int j=5-i;j>0;j--) {   //
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("=======");

		//left triangle
		for(int i=0;i<5;i++) {
			for(int j=4-i;j>0;j--) {
				System.out.print("  ");
			}
			for(int j=0;j<i+1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("=======");

		//inverted left triangle
		for(int i=0;i<5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("  ");
			}
			for(int j=5-i;j>0;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("============");
		//pramid
		for(int i=0;i<5;i++) {
			for(int j=4-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<i+1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("==========");
		int row=10;
		for(int i=0;i<row;i++) {
			for(int j=(row-i);j>=0;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<i+1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("========");
		for(int i=0;i<5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=5-i;j>0;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("==========");
		int row1=10;
		for(int i=0;i<row1;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=row1-i;j>0;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("========");
		
		int var=65;
		for(int i=0;i<5;i++) {
			for(int j=4-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<i+1;j++) {
				System.out.print((char)(var+j)+" ");
			}
			System.out.println();
		}
	}
}
