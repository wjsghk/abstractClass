package com.java.inter;

public class FighetTest {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		Moveable ma = (Moveable) new Fighter();
		Attackable aa = (Attackable) f;
		
		if( f instanceof Unit/*Ŭ������ or �������̽���*/) {
			System.out.println("Unit�� ����Ŭ�����̴�.");
		}
		
		if( f instanceof Fighterable) {
			System.out.println("Fighterable�� ���� Ŭ�����̴�.");
			
		if( f instanceof Moveable) {
				System.out.println("Moveable�� ���� Ŭ�����̴�.");
		}
	}

	}

}
