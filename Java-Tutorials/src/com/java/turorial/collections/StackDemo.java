package com.java.turorial.collections;

import java.util.Stack;

public class StackDemo {
	
	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<>();
		
		stack.push("America");
		stack.push("Germany");
		stack.push("India");
		stack.push("Nepal");
		
		System.out.println(stack);
		
		String popedElementString= stack.pop();
		System.out.println("popped Elemenet: "+ popedElementString);
		
		System.out.println("Now stack looks like this " +stack);
		
		// peek to get only the element 
		
		String poppedElement1= stack.peek();
		System.out.println("to element1: "+ poppedElement1);
		
		System.out.println("Now stack looks like this " +stack);
	}

}
