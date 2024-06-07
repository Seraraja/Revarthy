package org.programsss;

public class Programs {

	public static void main(String[] args) {
		
		//factorial
		int fact=1;
		for(int i=1;i<=5;i++) {
			fact=fact*i;
		}
		
		System.out.println("Factorial.."+fact);
		
		//palindrome
		int p=12241;  //121
		int temp=p;
		int i=0,j=0;
		while(p>0) {
			i=p%10;
			j=i+(j*10);
			p=p/10;
		}
		
		if(temp==j) {
			System.out.println("This number palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
		
		//count of digit and sum of digit
		int a=454545;
		int sum=0;
		int count=0;
		int i1=0,j1=0;
		while(a>0) {
			i1=a%10;
			sum=sum+i1;
			j1=i1+(j1*10);
			count++;
			a=a/10;
		}
		
		System.out.println("Count of digit...."+count);
		System.out.println("Sum of digit ...."+sum);
		
		//fibonacci series
		// 0 1 1 2 3 5 8 13
		int a1=0;
		int b1=1;
		System.out.print(a1+" ");
		System.out.print(b1+" ");
		
		for(int o=0;o<5;o++) {
			int c1=a1+b1;
			System.out.print(c1+" ");
			a1=b1;
			b1=c1;
		}
		
		//asmtrong number
		int ams=153;  //1+125+27=153
		int temp2=ams;
        int i2=0,j2=0;
		while(ams>0) {
			i2=ams%10;
			j2=j2+(i2*i2*i2);
			ams=ams/10;
		}
		
		System.out.println();
		if(temp2==j2) {
			System.out.println("Amstrong number");
		}
		else {
			System.out.println("Not a amstrong number");
		}
		
		//prime
		int prime=11;
		int pt=prime/2;
		int ct=0;
		for(int k=2;k<pt;k++) {
			if(prime%k==0) {
				ct++;
			}
		}
		if(ct==0) {
			System.out.println("Prime number");
		}
		else {
			System.out.println("Not a prime number");
		}
		
		
		
	}
	
}
