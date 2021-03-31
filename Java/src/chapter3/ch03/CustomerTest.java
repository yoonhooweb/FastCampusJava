package chapter3.ch03;

public class CustomerTest {

	public static void main(String[] args) {
		
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
		customerKim.bounsPoint = 200;
		
		System.out.println(customerKim.showCustomerInfo());
		
		Customer vc = new VIPCustomer(12345, "노네임");
		
	}

}
