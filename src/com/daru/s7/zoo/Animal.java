package com.daru.s7.zoo;

public abstract class Animal {
	
	String name;
	int age;
	
	public void eat() {
		System.out.println("얌얌");
		
	}
	
	public abstract void sleep();
	//클래스안에 추상메서드가 있으면 무조건 abstract
}
