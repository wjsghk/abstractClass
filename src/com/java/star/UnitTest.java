package com.java.star;

public class UnitTest {

	public static void main(String[] args) {
		Tank t = new Tank(150);
		Dropship d = new Dropship(125);
		SCV scv = new SCV(40);
		Marine mr = new Marine(40);
		Medic mc = new Medic(40);
		
        
		scv.repair(t);
		scv.repair(d);
		scv.repair(scv);
		mc.repair(mr);
		mc.repair(mc);
		//scv.repair(mr);//������ Ŭ������ �������̽� �����(implements Repairable)�� ������ ���ؼ� ������ ����

	}

}
