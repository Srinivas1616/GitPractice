package com.practice.arrayDemo;

import java.util.*;
import java.util.Map.Entry;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> map1 = new TreeMap<>();
		
		
		
		map1.put(10, "Peter");
		map1.put(25, "Dwayne");
		map1.put(7, "Keanu");
		map1.put(16, "Jonas");
		map1.put(80, "Lewis");
		System.out.println(map1.put(25, "Lara"));
		
		System.out.println(map1);
		System.out.println("hello");
		System.out.println("hi");
		System.out.println("updating for the stage skip");
		Iterator<Entry<Integer, String>> it = map1.entrySet().iterator();
		
		while(it.hasNext()) {
			it.next();
			it.remove();
			break;
		
		}
		
		
		
		
		System.out.println(map1);
		
	}
}
