package com.cloud.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;


/**
 * Feign是一个生命式的伪HTTP客户端，它使得写HTTP客户端变得简单。
 * 使用Feign只需要创建一个借口并注解，它具有可插拔的注解特性，可使用Feign注解和JAX-RS注解。
 * Feign支持可插拔的编码器和解码器；Feign默认机场了ribbon，并和eureka结合，默认实现了负载均衡的效果。
 *
 * ### Feign采用的是基于接口的注解
 * ### Feign整合了Ribbon
 * ### Feign集成了Hystrix
 */
@EnableFeignClients//@EnableFeignClients注解开启Feign的功能
@EnableDiscoveryClient
@SpringBootApplication
@EnableHystrixDashboard//开启Hystrix仪表盘
/*
 * 开启断路器，使用Hystrix仪表盘需要@EnableCircuitBreaker,
 * 并引入spring-cloud-starter-hystrix、
 * spring-boot-starter-actuator、
 * spring-cloud-starter-hystrix-dashboard三个jar包的依赖
 */
@EnableCircuitBreaker
public class FeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignApplication.class, args);
	}
}
