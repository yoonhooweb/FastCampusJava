package chapter3.ch06;

public class Customer {

	/*
	 * 고객의 속성 : 고객 아이디, 고객 이름, 고객 등급, 보너스 포인트, 보너스 포인트 적립비율
	 * 일반 고객의 경우 물품 구매시 1%의 보너스 포인트 적립
	 */
	
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bounsPoint;
	double bounsRatio;
	
/*	public Customer() {
		bounsRatio = 0.01;
		customerGrade = "SILVER";
		System.out.println("Customer() Call");
	}*/
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		bounsRatio = 0.01;
		customerGrade = "SILVER";
	}
	
	public int calcPrice(int price) {
		bounsPoint +=  bounsRatio * price;
		return price;
	}
	
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public String showCustomerInfo() {
		return customerName + "님의 등급은" +  customerGrade + "이며, 보너스 포인트는 " + bounsPoint + "입니다." ;
	}
	
	public String showCustomerInfo(int price , int bounsPoint, String customerName , String customerGrade) {
		return customerName + "님의 등급은" +  customerGrade + "이며, 보너스 포인트는 " + bounsPoint + "입니다. 가격은" + price + "입니다." ;
	}
}
