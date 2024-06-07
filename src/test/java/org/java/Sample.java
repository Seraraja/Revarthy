package org.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Sample {

	public static void main(String[] args) {

		List<Integer> li = new ArrayList<>();
		li.add(10);// 0
		li.add(20);// 1
		li.add(30);// 2

		System.out.println(li);

		// size
		int size = li.size();
		System.out.println(size);

		// get particular value
		Integer integer = li.get(2);
		System.out.println(integer);

		// index
		int indexOf = li.indexOf(20);
		System.out.println(indexOf);

		Integer a[] = { 10, 20, 30, 20, 40, 50, 60, 40 };

		List<Integer> l2 = Arrays.asList(a);
		System.out.println(l2);

		// remove
		li.remove(2);
		System.out.println(li);

		Set<Integer> si = new LinkedHashSet<>(Arrays.asList(a));
		si.addAll(l2);

		System.out.println(l2);
		System.out.println(si);

		List<Integer> l3 = new LinkedList<>();

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 30) {
				l3.add(a[i]);
			}
		}

		for (Integer x : a) {
			if (x == 40) {
				l3.add(x);
			}
		}

		System.out.println(l3);
		
		//map
		Map<Integer, String> mp=new LinkedHashMap<>();
		mp.put(10, "java");
		mp.put(20, "python");
		mp.put(30, "java");
		
		System.out.println(mp);
		
		Set<Integer> keySet = mp.keySet();
		System.out.println(keySet);
		
		Collection<String> values = mp.values();
		System.out.println(values);
		
		String string = mp.get(20);
		System.out.println(string);
		
		//entry
		Set<Entry<Integer, String>> entrySet = mp.entrySet();
		System.out.println(entrySet);
		
		for(Entry<Integer, String> x : entrySet) {
			System.out.println(x);
			//get key
			System.out.println(x.getKey());
			//get value
			System.out.println(x.getValue());
			
		}
		
		System.out.println("=======");
		
		for(Entry<Integer, String> x : entrySet) {
			if(x.getValue().equals("python")) {
				System.out.println(x.getKey());
			}			
		}
		
		

	}

}
