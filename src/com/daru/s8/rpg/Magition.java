package com.daru.s8.rpg;

public class Magition extends Character implements Act {
	
	int mp;

	//마법사 is a 캐릭터
	//마법사 has a 캐릭터
	
	
	private void spel() {
		System.out.println("마법 공격");
	}

	@Override
	public void attack() {
		this.spel();
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	
	
}
