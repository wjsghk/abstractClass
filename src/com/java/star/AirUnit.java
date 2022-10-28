package com.java.star;

public class AirUnit extends Unit {
	 
	AirUnit (int hp) {//부모클래스에 생성을 한거니까 서브클래스에도 생성을 해야된다
			super(hp);
			hitPoint = MAX_HP;
			
			}	
    @Override
	public String toString() {
    // source -> override-> to string클릭
    return "AirUnit";
}
    
}
