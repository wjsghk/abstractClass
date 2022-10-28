package com.java.star;
//부모클래스
public class Unit {
	int hitPoint;
	final int MAX_HP;
	
	 Unit (int hp) {//부모클래스에 생성을 한거니까 서브클래스에도 생성을 해야된다
		super();
		MAX_HP = hp;
	}
	
}
