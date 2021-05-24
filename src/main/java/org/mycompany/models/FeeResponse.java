package org.mycompany.models;

public class FeeResponse {
    protected FeeType fee;
    protected FaultType fault;
	public FeeType getFee() {
		return fee;
	}
	public void setFee(FeeType fee) {
		this.fee = fee;
	}
	public FaultType getFault() {
		return fault;
	}
	public void setFault(FaultType fault) {
		this.fault = fault;
	}

    
    
}
