package com.daru.s9.himart;

//import com.daru.s8.*.*; 패키지명이 중복되면안되므로 패키지명은 다써야함
import com.daru.s8.rpg.*;

public class HimartMain {

	public static void main(String[] args) {
		
		//Tv, Coumputer, Phone 정보입력
		
		
		Knight knight;
		Archer archer;
		
		Tv tv = new Tv();
		tv.company = "Lg";
		tv.brand = "오브제";
		tv.point = 3;
		tv.price = 300;
		tv.size = 100;
		
		Computer computer = new Computer();
		computer.company = "Samsung";
		computer.brand = "갤럭시북";
		computer.cpu ="i7";
		computer.price=200;
		computer.point =2;
		
		Phone phone = new Phone();
		phone.company="Apple";
		phone.brand = "iphone12";
		phone.pixel = 100;
		phone.price =150;
		phone.point =5;
		
		Client daru = new Client();
		daru.money = 1000;
		daru.point = 0;
		daru.buy(phone);
		
		
	}

}
