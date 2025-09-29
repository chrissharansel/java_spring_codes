package com.example.myapp;

//@Component
public class Dev {
	private int age=10;
	private Laptop laptop;
	public void build() {
		System.out.println("Working on a project");
	}
	public Dev() {
		System.out.println("this is dev class");
	}
	public Dev(int age, Laptop laptop) {
		this.age=age;
		this.laptop=laptop;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
