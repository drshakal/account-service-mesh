package org.mycompany.models;

public class AccountDetailsRequest {
	protected String accountId;
    protected String accountType;
    protected String accountTypeDescription;
    protected String branch;
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountTypeDescription() {
		return accountTypeDescription;
	}
	public void setAccountTypeDescription(String accountTypeDescription) {
		this.accountTypeDescription = accountTypeDescription;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
    
    
}
