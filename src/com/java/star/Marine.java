package com.java.star;

public class Marine extends GroundUnit  implements Repairable1 {

	Marine(int hp) {
		super(hp);
		hitPoint = MAX_HP;
		// //�θ�Ŭ������ ������ �ѰŴϱ� ����Ŭ�������� ������ �ؾߵȴ�
	}
	@Override
	public String toString() {
	// source -> override-> to stringŬ��
	return "Marine";

}
	}
