package com.java.star;

public class AirUnit extends Unit {
	 
	AirUnit (int hp) {//�θ�Ŭ������ ������ �ѰŴϱ� ����Ŭ�������� ������ �ؾߵȴ�
			super(hp);
			hitPoint = MAX_HP;
			
			}	
    @Override
	public String toString() {
    // source -> override-> to stringŬ��
    return "AirUnit";
}
    
}
