package com.daru.s6.student;

public abstract class StudentDTO {// 부모클래스

	String name;
	int num;
	int kor;
	int eng;
	int math;
	int total;

	public abstract int setTotal();

//	public StudentDTO() {}
//	
//	public StudentDTO(String name) {//생성자
//		this.name = name;
}

// int history;//1학년 역사
// int physics //2학년 물리
