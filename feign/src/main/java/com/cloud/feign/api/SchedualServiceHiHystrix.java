package com.cloud.feign.api;

import org.springframework.stereotype.Component;

/**
 * 必须要加@Component注解
 * org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'hiController': Unsatisfied dependency expressed through field 'schedualServiceHi'; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'com.cloud.feign.api.SchedualServiceHi': FactoryBean threw exception on object creation; nested exception is java.lang.IllegalStateException: No fallback instance of type class com.cloud.feign.api.SchedualServiceHiHystrix found for feign client eureka-client
 */
@Component("schedualServiceHiHystrix")
public class SchedualServiceHiHystrix implements SchedualServiceHi {

	@Override
	public String sayHiFromClientOne(String name) {
		return "sorry, error  " + name;
	}

}
