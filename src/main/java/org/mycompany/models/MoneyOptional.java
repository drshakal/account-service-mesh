package org.mycompany.models;

import java.math.BigDecimal;

public class MoneyOptional {
   
	protected BigDecimal value;
    protected String isoCurrencyCode;
	
    public BigDecimal getValue() {
		return value;
	}
	public void setValue(BigDecimal value) {
		this.value = value;
	}
	public String getIsoCurrencyCode() {
		return isoCurrencyCode;
	}
	public void setIsoCurrencyCode(String isoCurrencyCode) {
		this.isoCurrencyCode = isoCurrencyCode;
	}
    
    
}
