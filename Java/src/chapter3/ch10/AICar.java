package chapter3.ch10;

public class AICar extends Car{

	@Override
	public void drive() {
		System.out.println("자율주행 합니다.");
		System.out.println("자동차가 스스로 방향을 바꿉니다.");
		
	}

	@Override
	public void stop() {
		System.out.println("장애물 앞에서 멈춥니다.");
		
	}

	@Override
	public void wiper() {
		
	}

	
}
