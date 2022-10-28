package com.java.star;

public class SCV extends GroundUnit implements Repairable {

	SCV(int hp) {
		super(hp);
		hitPoint = MAX_HP;
		// //�θ�Ŭ������ ������ �ѰŴϱ� ����Ŭ�������� ������ �ؾߵȴ�
	}
	
	void repair(Repairable r) {//Ŭ���� �ڿ� 'implements Repairable'�߰��Ǹ鼭 =>SCV�� ������ ������  scv, ��ũ,������� ġ�����ش�
		if(r instanceof Unit) {//p274
			Unit u = (Unit)r; //(unit) =ĳ���� ������ȯ
			
			while(u.hitPoint != u.MAX_HP){
				u.hitPoint++;
			}
			System.out.println(u.toString()+"�� ���� �Ϸ�");
	
		}
	}
	
	@Override
    public String toString() {
	// source -> override-> to stringŬ��
	return "SCV";
   }
	
}