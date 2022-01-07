package com.daru.s5;

public class MyGodMain {

	public static void main(String[] args) {
		
		MyGod myGod = MyGod.makeGod();
		
		System.out.println(myGod);
		//singleton
		
		MyGod my2 = MyGod.makeGod();
		System.out.println(my2);
		System.out.println(MyGod.makeGod());
		
	}

}
