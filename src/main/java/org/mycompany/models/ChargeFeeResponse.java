package org.mycompany.models;

public class ChargeFeeResponse {

	
    protected String journal;
    protected FaultType fault;
    
	public String getJournal() {
		return journal;
	}
	public void setJournal(String journal) {
		this.journal = journal;
	}
	public FaultType getFault() {
		return fault;
	}
	public void setFault(FaultType fault) {
		this.fault = fault;
	}

    
    
}
