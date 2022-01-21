package com.java.tutorial.classes;


// class is blue print of real life object => logical entity in real life world (Actor,car, Student)
// an object is instance of class => 

public class Student {
	
	// attributes  => properties like name, age , address , what we have like eyes mouth 
	
	//  behavior => actions canWalk, canEat, canSleep  => methods 
	
	String name;
	int age;
	String address;
	public Student(String name, int age, String address) {
	
		this.name=name;
		this.age=age;
		this.address=address;
		
	}
	
	public void setName(String nameString) {
		this.name= nameString;
		
	}
	public void setAge(int age) {
		this.age=age;
		
	}
	public void setAddress(String addressString) {
		this.address=addressString;
	}
	
	public String getName() {
		return this.name;
								
	}
	public int getAge() {
			
		return age;
	}
	public String getAddress() {
		return address;
	}
	
 
	public String toString() {
		return("Student name is "+ this.getName() + ", age is "+ this.getAge() + ", address is "+ this.getAddress());
	}
	
	public static void main(String[] args) {
		Student jhonStudent = new Student("John", 23, "Nepal");
		
		System.out.println(jhonStudent);
	}

}
