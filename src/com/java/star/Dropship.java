package com.java.star;

public class Dropship extends AirUnit implements Repairable {

	Dropship(int hp) {//�θ�Ŭ������ ������ �ѰŴϱ� ����Ŭ�������� ������ �ؾߵȴ�
		super(hp);
		hitPoint = MAX_HP;
		
		}
	@Override
	public String toString() {
	// source -> override-> to stringŬ��
	return "Dropship";
}
}
