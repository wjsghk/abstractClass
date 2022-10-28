package abstractClass;

 public abstract class AbsractC {
	 //추상클래스 
	 //1. abstract제한을 붙여서 클래스를 선언한다.
	 //2. 일반클래스와 동일한게 멤버를 정의한다.
	 //3. 추상메소드를 정의한다.
	 //4. 생성이 불가하다
	 //5. 반드시 자식클래스에 상속해야된다.(상속을 위한 클래스)
	 //6. 자식클래스는 반드시 추상메소드를 오버라이딩 해야한다.
	 
	 int x;
	 
	 AbsractC(){
		 
	 }
	 void method() {
		 
	 }
	 abstract void abstractMethod();//추상 메소드
}
