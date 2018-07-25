package com.twentyfifth;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList<>();
		
		l1.add("Java");
		l1.add("Scala");
		l1.add("Pascal");
		l1.add("C#");
		l1.add("PHP");
		//add more
		
		System.out.println(l1);

		for (int i = 0; i < l1.size(); i++) {
			System.out.println("REading.."+l1.get(i));
			
		}
		

		ListIterator LI = l1.listIterator();
		
		while(LI.hasNext()) {
			System.out.println("iterator: "+LI.next());
		}
	}

}
