package org.mycompany.models;


public class FeeType {
    protected TodayType today;
    protected NextDayType nextDay;
    protected StandardType standard;
    protected String journalId;
    protected Double fee;
    protected String accountId;
    protected String feeWithoutVat;
    protected String vat;
    protected String taxRate;
	public TodayType getToday() {
		return today;
	}
	public void setToday(TodayType today) {
		this.today = today;
	}
	public NextDayType getNextDay() {
		return nextDay;
	}
	public void setNextDay(NextDayType nextDay) {
		this.nextDay = nextDay;
	}
	public StandardType getStandard() {
		return standard;
	}
	public void setStandard(StandardType standard) {
		this.standard = standard;
	}
	public String getJournalId() {
		return journalId;
	}
	public void setJournalId(String journalId) {
		this.journalId = journalId;
	}

	public Double getFee() {
		return fee;
	}
	public void setFee(Double fee) {
		this.fee = fee;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getFeeWithoutVat() {
		return feeWithoutVat;
	}
	public void setFeeWithoutVat(String feeWithoutVat) {
		this.feeWithoutVat = feeWithoutVat;
	}
	public String getVat() {
		return vat;
	}
	public void setVat(String vat) {
		this.vat = vat;
	}
	public String getTaxRate() {
		return taxRate;
	}
	public void setTaxRate(String taxRate) {
		this.taxRate = taxRate;
	}
    
    
}
