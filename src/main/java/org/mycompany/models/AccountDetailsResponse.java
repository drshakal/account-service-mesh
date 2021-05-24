package org.mycompany.models;

import java.util.List;

public class AccountDetailsResponse {
	
	
    protected List<AccountDetailsType> account;
    protected FaultType fault;

    

	public FaultType getFault() {
		return fault;
	}

	public void setFault(FaultType fault) {
		this.fault = fault;
	}

	public List<AccountDetailsType> getAccount() {
		return account;
	}

	public void setAccount(List<AccountDetailsType> account) {
		this.account = account;
	}
    
    

}
