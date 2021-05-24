package org.mycompany.processors;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.apache.camel.Exchange;
import org.mycompany.models.AccountDetailsType;
import org.mycompany.models.CustomerID;

public class JsonProcessorBean {
	
	static AccountDetailsType result=null; 	


	public  AccountDetailsType jsonProcessorBean(Exchange exchange) throws Exception {
		String input = exchange.getIn().getBody(String.class);
        System.out.println("Input to be persisted : " + input);
        if (input.charAt(0)=='[')
        {
        String str = input.substring(1, input.length() - 1);
        InputStream is = new ByteArrayInputStream(str.getBytes());
        exchange.getIn().setBody(is);
        }
        else
        {
        	Object obj = exchange.getIn().getBody();
        	
        	if(obj.getClass()== CustomerID.class)
        	{	
        		System.out.println("customerid object : " + obj);
        		System.out.println("customerid object : " + result);
        		result.setAccountId("accountid");
        	}
        	else
        	{
        		System.out.println("object got : " + obj);
        	}
        	
        	System.out.println("final obj : " + result.toString());
        	
        }
		return result;
	}

}
