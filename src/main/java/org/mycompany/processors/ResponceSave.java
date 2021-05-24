package org.mycompany.processors;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.mycompany.models.AccountDetailsType;

public class ResponceSave implements Processor{

	static AccountDetailsType result;
	
	@Override
	public void process(Exchange exchange) throws Exception {
		String input = exchange.getIn().getBody(String.class);
		System.out.println("Object :" + input);
		
		
		
		
		
		
		
		//		String input = exchange.getIn().getBody();
//      //  System.out.println("Input to be persisted : " + input);
//        String str = input.substring(1, input.length() - 1);
//        
//        InputStream targetStream = new ByteArrayInputStream(str.getBytes());
////        JSONParser parser = new JSONParser();
////        Object obj = parser.parse(str);
////        JSONObject jsonObject = (JSONObject) obj;
        exchange.getIn().setBody("done");
	}
	
}
