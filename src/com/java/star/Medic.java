package com.java.star;

public class Medic extends GroundUnit  implements Repairable1 {

	Medic(int hp) {
		super(hp);
		hitPoint = MAX_HP;
		// //�θ�Ŭ������ ������ �ѰŴϱ� ����Ŭ�������� ������ �ؾߵȴ�
		
	}
	void repair(Repairable1 r1) {//Ŭ���� �ڿ� 'implements Repairable'�߰��Ǹ鼭 =>SCV�� ������ ������  scv, ��ũ,������� ġ�����ش�
		if(r1 instanceof Unit) {//p274
			Unit u = (Unit)r1; //(unit) =ĳ���� ������ȯ
			
			while(u.hitPoint != u.MAX_HP){
				u.hitPoint++;
			}
			System.out.println(u.toString()+"�� ġ�� �Ϸ�");
	
		}
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Medic";
	}
	
}
