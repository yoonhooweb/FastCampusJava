package chapter3.ch04;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10010, "이순신");
		customerLee.bounsPoint = 1000;
		int price = customerLee.calcPrice(1000);
		System.out.println(customerLee.showCustomerInfo() + "가격은 " + price);
		
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
		
		customerKim.bounsPoint = 1000;
		price = customerKim.calcPrice(1000);
		System.out.println(customerKim.showCustomerInfo() + "가격은 " + price);
		
		Customer vc = new VIPCustomer(12345, "noname");
		int dd = vc.calcPrice(10000);
		
		System.out.println(customerKim.showCustomerInfo() + "가격은 " + dd);
	}

}
