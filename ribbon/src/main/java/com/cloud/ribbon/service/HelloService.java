package com.cloud.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {
	@Autowired
	RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "hiError")
	public String hiService(String name) {
		// TODO 待确认，EUREKA-CLIENT 应用名是否区分大小写
		return restTemplate.getForObject("http://EUREKA-CLIENT/hi?name=" + name, String.class);
	}

	public String hiError(String name) {
		return "hi, " + name + "sorry, error!";
	}

}
