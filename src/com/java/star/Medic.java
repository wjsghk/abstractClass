package com.java.star;

public class Medic extends GroundUnit  implements Repairable1 {

	Medic(int hp) {
		super(hp);
		hitPoint = MAX_HP;
		// //부모클래스에 생성을 한거니까 서브클래스에도 생성을 해야된다
		
	}
	void repair(Repairable1 r1) {//클래스 뒤에 'implements Repairable'추가되면서 =>SCV가 마린을 제외한  scv, 탱크,드랍쉽을 치료해준다
		if(r1 instanceof Unit) {//p274
			Unit u = (Unit)r1; //(unit) =캐스팅 강제변환
			
			while(u.hitPoint != u.MAX_HP){
				u.hitPoint++;
			}
			System.out.println(u.toString()+"의 치료 완료");
	
		}
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Medic";
	}
	
}
