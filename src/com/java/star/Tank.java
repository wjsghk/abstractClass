package com.java.star;

public class Tank extends GroundUnit implements Repairable {

	Tank(int hp) {
		super(hp);
		hitPoint = MAX_HP;
		////�θ�Ŭ������ ������ �ѰŴϱ� ����Ŭ�������� ������ �ؾߵȴ�
	}

	@Override
	public String toString() {
		// source -> override-> to stringŬ
		return "Tank";
	}

}
