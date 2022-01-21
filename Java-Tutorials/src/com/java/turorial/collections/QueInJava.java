package com.java.turorial.collections;

import java.net.CacheRequest;
import java.util.PriorityQueue;
import java.util.Queue;
import javax.management.Query;

public class QueInJava {
	
	// fifo .. first in first out
	public static void main(String[] args) {
		
		Queue<String> queue= new PriorityQueue();
		
		
		queue.add("Nepal");
		queue.add("Germany");
		queue.add("Finland");
		queue.add("Taiwan");
		queue.add("America");
		
		System.out.println(queue);
		
		
		// head of the queue is removed on 
		queue.remove();
		
		// 
		System.out.println("After removing head" + queue);
		
		// viewing head of queue 
		System.out.println(queue.peek());
		
		// queue.poll will return and also remove head 
		String headString= queue.poll();
		System.out.println("Poll removed and returned like pop  " + headString);
		
		// after polling head
		
		System.out.println("After plling " + queue);
	}

}

