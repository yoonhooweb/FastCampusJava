package chapter3.ch06;

public class GoldCustomer extends Customer {

	double salesRatio;
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		salesRatio = 0.1;
		bounsRatio = 0.02;
		customerGrade = "Gold";
		
	}
	
	@Override
	public int calcPrice(int price) {
		bounsPoint +=  bounsRatio * price;
		return price - (int)(price * salesRatio);
	}

}
