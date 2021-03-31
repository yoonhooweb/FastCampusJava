package chapter3.ch10;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	public static final double PI = 3.14;
	
	public void startCar() {
		System.out.println("시동을 겁니다.");
	}
	
	public void trunOff() {
		System.out.println("시동을 끕니다.");
	}
	
	public void washCar() {
		
	}
	
	 final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		trunOff();
		washCar();
	}
}
