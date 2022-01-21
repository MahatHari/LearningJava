package com.java.turorial.collections;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String args[]) {
		
		TreeMap<Integer, String> treeMap= new TreeMap<>();
		
		treeMap.put(3, "A");
		treeMap.put(4, "B");
		treeMap.put(2, "X");
		treeMap.put(1, "C");
		
		System.out.println(treeMap);
		
		
		TreeMap<String, Integer> stringTreeMap= new TreeMap<String, Integer>();
		
		stringTreeMap.put("D", 5);
		stringTreeMap.put("B", 4);
		stringTreeMap.put("A", 1);
		stringTreeMap.put("C", 20);
		
		System.out.println(stringTreeMap);
		
	}
	

}
