package com.practice.arrayDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class first implements Runnable{
	int j=100;
	
	@Override
	public void run() {
		System.out.println("runnnn");
		
	}

	public static void main(String[] args) {
		
		//Initializtaion
		List<String> lst1= Arrays.asList("AAA", "BBB", "CCC", "DDD");
		Collection<String> lst2= Arrays.asList("AAA", "BBB", "CCC", "DDD");
				
		//Empty
		LinkedList<Integer> lst3 = new LinkedList<Integer>();
		
		for(int i =1; i<4;i++)
			lst3.add(i);
		
		System.out.println(lst3);
		System.out.println(lst3.size());
		System.out.println();
		
		lst3.forEach(value -> System.out.print(" "+value));
		System.out.println();
		lst3.forEach(System.out :: print);
		lst3.add(40);
		lst3.add(50);
		lst3.remove(2);
		
		
		lst3.add(null);
		lst3.add(1,200);
		System.out.println(lst3);
		
		
		
		Set<String> s = new LinkedHashSet();
		s.add("hello");
		s.add("i'am");
		s.add("groot");
		s.add("haha");
		s.add("zaha ");
		s.add("haha");
		System.out.println(s);

		String[] i = {};
		System.out.println(i.getClass().getName());
		first f = new first();
		f.change();
		
		System.out.println(f.j);
		//Thread.sleep(1000);
	}
	
	public void change() {
		j=j+100;
		System.out.println(j);
	}
	
}