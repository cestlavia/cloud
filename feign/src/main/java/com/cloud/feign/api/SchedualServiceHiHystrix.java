package com.cloud.feign.api;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystrix implements SchedualServiceHi {

	@Override
	public String sayHiFromClientOne(String name) {
		return "sorry, error  " + name;
	}

}
