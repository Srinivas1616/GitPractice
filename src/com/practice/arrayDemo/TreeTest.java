package com.practice.arrayDemo;

import java.util.*;

public class TreeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Comparator<Person> nameComp = (x,y) -> x.getName().compareTo(y.getName());
		Comparator<Person> ageComp = (x,y) -> x.getAge()- y.getAge();
		Set<Person> set = new TreeSet<>(ageComp);
		
		set.add(new Person("rajiv", 10));
		set.add(new Person("sandy", 34));
		set.add(new Person("ajay", 27));
		set.add(new Person("vajay", 27));
		set.add(new Person("ranvijay", 27));
		set.add(new Person("reddy", 12));
		set.add(new Person("bharati", 20));
		set.add(new Person("ravi", 40));
				
		Person str[]=set.toArray(new Person[set.size()]);
		
		//for(Person p:str)
		//System.out.println(p.getName());
		System.out.println(set.size());
		System.out.println(set);
	
		Deque<Integer> de = new ArrayDeque();
		
		
		

	}

}
