package com.daru.s1.modifier;

class Test {//누구나 어디서든 사용가능함 public
	
	private int num;//외부에서는 불가능,내부에서가능
	
	public Test() {//default생성자
		
	}
	
	public void info(int num) { 
		this.num = num;
		System.out.println(this.num);
		
	}
	
}
