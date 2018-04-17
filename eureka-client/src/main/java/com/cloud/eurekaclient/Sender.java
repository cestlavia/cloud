package com.cloud.eurekaclient;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.MessagePostProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Sender {

	@Autowired
	private AmqpTemplate rabbitmqTemplate;

	public void send() {
//		DLXMessage
//		MessagePostProcessor
		String context = "hello " + new Date();
		System.out.println("Sender : " + context);
		this.rabbitmqTemplate.convertAndSend("hello", context);
	}
}


