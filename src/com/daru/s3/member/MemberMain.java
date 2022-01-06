package com.daru.s3.member;

public class MemberMain {

	public static void main(String[] args) {
		
		Member member = new Member();
		
		member.setAge(25);//검사하고 적절하다싶으면 넣어줌
		System.out.println(member.getAge());
		
		member.setKi(45);
		System.out.println(member.getKi());
		
		member.setEmail("test@gamil.com");
		String email = member.getEmail();
		System.out.println(email);
		System.out.println(member.getEmail());
		
	}

}
