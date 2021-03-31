package ch03;

public class VIPCustomer extends Customer{
	
	

	double salesRatio; // VIP 추가 세일
	private String agentID; //담당 상담원

//	public VIPCustomer () {
//		super //컴파일 되면 자동으로 super라는 메서드가 들어간다.
//		
//		bounsRatio = 0.05;
//		salesRatio = 0.1;
//		customerGrade = "VIP";
//		
//		System.out.println("VIPCustomer() Call");
//	}
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		bounsRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
		
		System.out.println("VIPCustomer(int, String) Call");
	}

	public String getAgentID() {
		return agentID;
	}

	public void setAgentID(String agentID) {
		this.agentID = agentID;
	}
	
	
	
	
}
