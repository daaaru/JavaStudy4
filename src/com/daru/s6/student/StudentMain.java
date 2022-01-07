package com.daru.s6.student;

public class StudentMain {

	public static void main(String[] args) {

		StudentDTOSecond ss = new StudentDTOSecond();

		ss.kor = 10;
		ss.eng = 30;
		ss.math = 25;
		ss.history = 24;
		ss.setTotal();
		
		StudentDTOThird st = new StudentDTOThird();
		st.kor=40;
		st.eng=25;
		st.math=46;
		st.physics=55;
		st.setTotal();
	}
}
