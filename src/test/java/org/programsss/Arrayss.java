package org.programsss;

import java.util.Arrays;
import java.util.List;

public class Arrayss {

	public static void main(String[] args) {
		//         0  1  2  3
		int a[]= {10,20,30,40,30};
		System.out.println(a);
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		for(int x : a) {
			System.out.println(x);
		}
		System.out.println("=======");
		
//		index
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==30) {
				System.out.println("index of 30 value is...."+count);
			}
			count++;
		}
		
		//sum of array
		int sum=0;
		int count1=0;
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
			count1++;
		}
		
		System.out.println("Sum of array..."+sum);
		System.out.println("Count of array..."+count1);
		
		//max and min of array
		int b[]= {10,50,90,30};
		int max=b[0];  //50  90
		for(int i=0;i<b.length;i++) {
			if(max<b[i]) { //10<10  10<50  50<90 90<30
				max=b[i];
			}
		}
		
		System.out.println("Maximum value of array..."+max);
		
		//min
		int min=b[0];  //
		for(int i=0;i<b.length;i++) {
			if(min>b[i]) { //10>10  10>50  10>90 10>30
				min=b[i];
			}
		}
		
		System.out.println("Minimum value of array..."+min);
		
		//ascending
		int c[]= {1,9,5,7};  //1579
		
		//Arrays.sort(c);
		for (int i : c) {
			System.out.println(i);
		}
		
		int temp=0;
		//    1,5,7,9
		for(int i=0;i<c.length;i++) {
			for(int j=i+1;j<c.length;j++) {
				if(c[i]>c[j]) {  //1>9    9>5      9>7
					temp=c[i];         // temp=9   temp=9
					c[i]=c[j];         // a[1]=5   a[2]=7
					c[j]=temp;         // a[2]=9   a[3]=9
				}
			}
		}
		
		for (int i : c) {
			System.out.println(i);
		}
		
		System.out.println("Minimun value..."+c[0]);
		System.out.println("Maximum value..."+c[c.length-1]);
		System.out.println("2nd Maximum value..."+c[c.length-2]);
		
		//descending
		int temp1=0;
		//    1,5,7,9
		for(int i=0;i<c.length;i++) {
			for(int j=i+1;j<c.length;j++) {
				if(c[i]<c[j]) {  //1>9    9>5      9>7
					temp1=c[i];         // temp=9   temp=9
					c[i]=c[j];         // a[1]=5   a[2]=7
					c[j]=temp1;         // a[2]=9   a[3]=9
				}
			}
		}
		for (int i : c) {
			System.out.println(i);
		}
		
		System.out.println("maximum value..."+c[0]);
		System.out.println("Minimum value..."+c[c.length-1]);
		System.out.println("2nd Minimum value..."+c[c.length-2]);
		
		//Duplicate removal
		int[] d= {1,2,3,1,4,2};
		Arrays.sort(d);  // 1 1 2 2 3 4
		int k=0;
		int ln=d.length;
		for(int i=0;i<ln-1;i++) {
			if(d[i]!=d[i+1]) {
				d[k++]=d[i];
			}
		}
		
		d[k++]=d[ln-1];
		ln=k;
		System.out.println(ln);
		
		for(int i=0;i<ln;i++) {
			System.out.println(d[i]);
		}
		
		System.out.println("=================");
		
		//join two array
		int[] f= {10,20,30};
		int[] g= {40,50,60};
		int[] w=new int[f.length+g.length]; //10 20 30 40 50 60
		
		for(int i=0;i<f.length;i++) {
			w[i]=f[i];
		}
		
		for(int i=0;i<g.length;i++) {
			w[f.length+i]=g[i];
		}
		
		for (int i : w) {
			System.out.println(i);
		}
		
		System.out.println("============");
		
		//Array to list
		Integer[] h= {1,2,3,4,5};
		List<Integer> li = Arrays.asList(h);
		System.out.println(li);
		
		//list to array
		Object[] ar = li.toArray();
		for (Object i : ar) {
			System.out.println(i);
		}
		
		//to move all negative numbers to beginning and positive to end
		int a1[]= {2,-1,4,-3,5,6,-7,8,9};   // -7,-3,-1,2,4,5,6,8,9
		int n=a1.length;
		int j=0,tem;             //1
		for(int i=0;i<n;i++) {
			if(a1[i]<0) {        //2<0 -1<0
				if(i!=j) {       //    1!=1       
					tem=a1[i];   //    
					a1[i]=a1[j];
					a1[j]=tem;
				}
				j++;
			}
		}
		Arrays.sort(a1);
		
		for (int i = 0; i < a1.length; i++) {
			System.out.print(a1[i]+" ");
		}
		
		
		
		
		
		
		
	}
}
