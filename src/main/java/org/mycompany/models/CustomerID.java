package org.mycompany.models;

import java.math.BigInteger;

public class CustomerID {
    
	protected String cid;
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	protected BigInteger id;
    protected String type;
    
    
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
    
    
}
