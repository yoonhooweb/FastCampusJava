package ch02;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer();
		
		customerLee.setCustomerName("이순신");
		customerLee.setCustomerID(10010);
		customerLee.bounsPoint = 1000;
		
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer();
		
		customerKim.setCustomerName("김유신");
		customerKim.setCustomerID(10020);
		customerKim.bounsPoint = 200;
		
		System.out.println(customerKim.showCustomerInfo());
		
		System.out.println("********************************");
		
		Customer customerJo = new Customer();
		customerJo.calcPrice(2000);
		System.out.println(customerJo.showCustomerInfo());
		
		VIPCustomer customerbaek = new VIPCustomer();
		
		System.out.println(customerbaek.showCustomerInfo(2000,1,"백진주","VIP"));
		
	}

}
