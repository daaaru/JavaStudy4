package com.daru.s3.member;

public class Member { //DTO(Data Transfer Object),VO(Value Object)
	// 이름
	// 이메일주소
	// 몸무게
	// 키
	// 나이

	private String name;
	private String email;
	private double muge;
	private double ki;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getMuge() {
		return muge;
	}
	public void setMuge(double muge) {
		this.muge = muge;
	}
	public double getKi() {
		return ki;
	}
	public void setKi(double ki) {
		this.ki = ki;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
	
	//setter변수에 값을 입력(외부의 데이터를 가져옴)
	//getter변수에 값을 가져감
	//집어넣는 메서드는 set변수명
	//가져나가는건 get변수명
	
	// 멤버메서드를 통해서 꺼내고 넣음
	//메서드를 통해 검증
//	public void setAge(int age) {// age에 넣을값을 매개변수에넣음
//		this.age = 20; //이상한 데이터가 들어오면 기본값20을 출력하겠다.
//		if (age > 0 && age < 200) {//정상적인범위안에 오도록
//			this.age = age;
//		}
//	}
//	
//	public void setKi(double ki) {
//		if (ki > 0 && ki < 100) {
//			this.ki = ki;
//		}
//	}
//	
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	
//	
//	public String getEmail() {
//		return this.email;
//	}
//	
//	
//	
//	public double getKi() {
//		return this.ki;
//	}
//	
//	public int getAge() { // 매개변수가없음
//		return this.age; //age값이 return으로 나감
//	}
//	
//	
	
}
