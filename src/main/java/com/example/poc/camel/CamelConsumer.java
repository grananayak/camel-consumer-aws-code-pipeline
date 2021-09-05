package com.example.poc.camel;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class CamelConsumer extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		//from("aws-sqs://arn:aws:sqs:us-east-2:399531338150:myQueue")
		//.to("log:received-message-from-aws-sqs");
		
		from("aws-sqs://arn:aws:sqs:us-east-2:399531338150:myQueue")
		.to("aws-sns://arn:aws:sns:us-east-2:399531338150:CamelTopic"); 
		
		

	}
}