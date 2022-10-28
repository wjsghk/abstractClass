package com.java.star;

public class Tank extends GroundUnit implements Repairable {

	Tank(int hp) {
		super(hp);
		hitPoint = MAX_HP;
		////부모클래스에 생성을 한거니까 서브클래스에도 생성을 해야된다
	}

	@Override
	public String toString() {
		// source -> override-> to string클
		return "Tank";
	}

}
