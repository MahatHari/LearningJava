package com.java.turorial.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {
	
	public static void main(String [] args) {
		Map<String, Integer> map= new HashMap<>();
		
		map.put("a", 10);
		map.put("b", 20);
		map.put("c", 30);
		
		System.out.println("size of map is: "+ map.size());
		System.out.println(map);
		
		
		// checking if map contains key
		if(map.containsKey("a")) {
			Integer a= map.get("a");
			System.out.println("Value for key a is "+ a);
		}
		
		// accessing map with keySet , keySet returns array of keys and looping that array
		for (String key: map.keySet()) {
			System.out.println("key- "+ key +" value: "+ map.get(key));
		}
		
		// accessing map with entrySet
		for(Entry<String, Integer> entry: map.entrySet()) {
			System.out.println("key:-  "+ entry.getKey() + " Value: " + entry.getValue());
			
		}
		
		}

}
