package org.mycompany.processors;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.mycompany.models.AccountDetailsType;
import org.mycompany.models.CustomerID;

public class JsonProcessor implements Processor{

	

	@Override
	public void process(Exchange exchange) throws Exception {
		String input = exchange.getIn().getBody(String.class);
        System.out.println("Input to be persisted : " + input);
        
        AccountDetailsType result =new AccountDetailsType();
        
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
        		result.setCustomerId((CustomerID) obj);
        		System.out.println("casting completed : " + obj);
        	}
        	else
        	{
        		System.out.println("object got : " + obj);
        	}
        	
        	System.out.println("final obj : " + result.toString());
        	exchange.getIn().setBody("none");
        }
	}
	
	

}