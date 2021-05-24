package org.mycompany.models;

public class NextDayType {
    protected double fee;
    protected String valueDate;
    protected String status;
    protected String commission;
    protected String feeWithoutVat;
    protected String vatOnFee;
    protected String commissionWithoutVat;
    protected String vatOnCommission;
    protected String taxRate;
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public String getValueDate() {
		return valueDate;
	}
	public void setValueDate(String valueDate) {
		this.valueDate = valueDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCommission() {
		return commission;
	}
	public void setCommission(String commission) {
		this.commission = commission;
	}
	public String getFeeWithoutVat() {
		return feeWithoutVat;
	}
	public void setFeeWithoutVat(String feeWithoutVat) {
		this.feeWithoutVat = feeWithoutVat;
	}
	public String getVatOnFee() {
		return vatOnFee;
	}
	public void setVatOnFee(String vatOnFee) {
		this.vatOnFee = vatOnFee;
	}
	public String getCommissionWithoutVat() {
		return commissionWithoutVat;
	}
	public void setCommissionWithoutVat(String commissionWithoutVat) {
		this.commissionWithoutVat = commissionWithoutVat;
	}
	public String getVatOnCommission() {
		return vatOnCommission;
	}
	public void setVatOnCommission(String vatOnCommission) {
		this.vatOnCommission = vatOnCommission;
	}
	public String getTaxRate() {
		return taxRate;
	}
	public void setTaxRate(String taxRate) {
		this.taxRate = taxRate;
	}
    
    
}
