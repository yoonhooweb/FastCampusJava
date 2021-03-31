package ch02;

public class VIPCustomer extends Customer{
	
	double salesRatio; // VIP 추가 세일
	private String agentID; //담당 상담원

	public VIPCustomer () {
		
		bounsRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
	}

	public String getAgentID() {
		return agentID;
	}

	public void setAgentID(String agentID) {
		this.agentID = agentID;
	}
	
	
	
	
}
