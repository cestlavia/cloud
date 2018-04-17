package com.cloud.eurekaclient;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

	@Bean
	public Queue helloQueue() {
		return new Queue("hello");
	}

	private static final String ttl_queue = "ttl_queue";

	@Bean
	public Queue ttlQueue() {
		Queue queue = new Queue(ttl_queue);

		return null;
	}
}
