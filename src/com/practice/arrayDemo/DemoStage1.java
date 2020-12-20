package com.practice.arrayDemo;

import java.util.Iterator;
import java.util.LinkedList;

public class DemoStage1 {

	public static void main(String[] args) {
		System.out.println("hellooooo sinu");
		LinkedList<String> ls = new LinkedList<>();
		ls.add("yello");
		ls.add("red");
		ls.add("orange");
		ls.add("blue");
		ls.add("green");
		
		Iterator<String> it = ls.iterator();
		while(it.hasNext())
			ls.remove();
		System.out.println(ls);

	}
}
