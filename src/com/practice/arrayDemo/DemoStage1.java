package com.practice.arrayDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DemoStage1 {

	public static void main(String[] args) {
		System.out.println("hellooooo sinu");
		LinkedList<String> ls = new LinkedList<>();
		ls.add("yellow");
		ls.add("red");
		ls.add("orange");
		ls.add("blue");
		ls.add("green");
		
		Iterator<String> it = ls.iterator();
		while(it.hasNext())
			//ls.remove();
		System.out.print(it.next()+"..");

		List<Integer> al = (List<Integer>) Arrays.asList(5,20,40);
		System.out.println(al);
		
		int arr[] = {0,1,2,3};
		System.out.println(ls.get(0).length());
	}
}
