package chapter3.ch14;

public interface Calc {

	double PI = 3.14;
	int Error = -99999999;
	
	int add (int num1, int num2);
	int substract (int num1, int num2);
	int times (int num1, int num2);
	int divide (int num1, int num2);
	
	default void description() {
		System.out.println("정수의 사칙연산을 제공합니다.");
	}
	
	static int total(int[] arr) { 
		
		int total = 0;
		
		for (int num : arr) {
			total += num;
		}
//		MyStaticMethod(); 
		return total;
	}
	
	/*
	 * 자바버전 9이상에서 사용가능 private void myMethod() { System.out.println("myMethod"); }
	 * 
	 * 
	 * private static void MyStaticMethod() { System.out.println("MyStaticMethod");
	 * }
	 */
}
