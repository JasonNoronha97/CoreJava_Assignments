package com.twentyfifth;

import java.util.HashSet;

public class setDemo {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("Peter");
		hs.add("James");
		hs.add("PEter");
		hs.add("adam");
		hs.add("Adam");
		hs.add("ADam");
		System.out.println(hs);
	}

}
