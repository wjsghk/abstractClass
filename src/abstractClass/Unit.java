package abstractClass;
//부모클래스로 둔다 나머지(마린 탱크 드랍쉽)자식 클래스
abstract public class Unit {
	int x,y;                                            
	abstract void move(int x, int y);
	void stop() {};
	
}
