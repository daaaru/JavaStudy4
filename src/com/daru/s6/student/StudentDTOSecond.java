package com.daru.s6.student;

public class StudentDTOSecond extends StudentDTO{

	
//	public StudentDTOSecond() {
//		super("daru");
//	}
//	
	
	int history;
	
	public int setTotal() {
		//overrriding
		this.total = this.kor+this.eng+this.math+this.history;
		System.out.println(this.total);
		return this.total;
	}
}
