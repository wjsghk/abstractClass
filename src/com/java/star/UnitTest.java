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
		//scv.repair(mr);//마린은 클래스에 인터페이스 리페어(implements Repairable)를 설정을 안해서 오류가 난다

	}

}
