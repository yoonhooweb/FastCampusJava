package chapter3.ch11;

public class ComplaeteCalc extends Calculator{

	@Override
	public int times(int num1, int num2) {
		
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		
		if (num2 == 0) {
			return Error;
		}
		
		return num1 / num2;
	}
	
	public void showCalc() {
		
		System.out.println("모두 구현했습니다.");
	}

}
