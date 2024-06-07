package org.stepdefinition;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
public class A {	
	public static void main(String[] args) {
		//2d with header or 2d map
		Map<String,String> mp=new LinkedHashMap<>();
		mp.put("username", "sera");
		mp.put("password", "1234");	
		Map<String,String> mp2=new LinkedHashMap<>();
		mp2.put("username", "kamal");
		mp2.put("password", "4545");
		Map<String,String> mp3=new LinkedHashMap<>();
		mp3.put("username", "dine");
		mp3.put("password", "9898");
		List<Map<String,String>> li=new LinkedList<Map<String,String>>();
		li.add(mp); //0
		li.add(mp2);//1
		li.add(mp3);//2
		Map<String, String> map = li.get(1);
		String user = map.get("username");
		System.out.println(user);
		String pass = map.get("password");
		System.out.println(pass);
		
	}
	
	
	

}
