package com.daru.s5;

public class MyGod {
//신을 한명만 만들고 싶음

//	private static MyGod myGod = new MyGod();
//
//	private MyGod() {}
//	
//	public static MyGod getInstance() {
//		return myGod;
//	}
	private static MyGod myGod;
	
	private MyGod() {}
	
	
	public static MyGod makeGod() {
		
		if(MyGod.myGod == null) {
			MyGod.myGod = new MyGod();
		}
		
		return MyGod.myGod;
	}

}
