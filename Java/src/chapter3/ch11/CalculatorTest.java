package chapter3.ch11;

public class CalculatorTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		Calc calc = new ComplaeteCalc();
		
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		
		
		
		System.out.println("=============");
		
		ComplaeteCalc cc = new ComplaeteCalc();
		
		System.out.println(cc.add(num1, num2));
		System.out.println(cc.substract(num1, num2));
		System.out.println(cc.times(num1, num2));
		System.out.println(cc.divide(num1, num2));
		
				
	}
}
