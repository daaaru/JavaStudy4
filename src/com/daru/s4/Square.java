package com.daru.s4;

public class Square {
	// 멤버변수 int sero;
	public static final int SERO = 1;
	// 멤버변수가 아님. 공통의 클래스의 변수,클래스 안에있는 세로라는 변수

	final int GARO_SIZE; //=3; 한번 값을 줘야하고 변경할 수 없음, 이 방법
	public Square() {
		this.GARO_SIZE=5; //생성자에서 집어넣음
	}
	
	
	
	static {
		//Square.SERO = 3;
	}

	// 메서드
	public static void info() { // 클래스변수는 사용가능
		System.out.println("Class Method");
		// System.out.println(this.garo);
		System.out.println(Square.SERO);
		// this.info2();
	}

	public void info2() {
		final int NUM = 1;//상수
		//NUM = 2;
		System.out.println("Instance Method");
		// 멤버변수 인스턴스 변수는 사용하려면 객체먼저 만들어야함
		System.out.println(this.GARO_SIZE);
		System.out.println(Square.SERO);
		Square.info();
	}
}
