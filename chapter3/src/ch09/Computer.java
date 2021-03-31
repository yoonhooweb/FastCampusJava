package ch09;

public abstract class Computer {

	public abstract void display(); //메서드선언
	public abstract void typing();
	
	public void trunOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void trunOff() {
		System.out.println("전원을 끕니다.");
	}
}
