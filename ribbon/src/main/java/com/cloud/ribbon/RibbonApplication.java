package com.cloud.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Spring Cloud 服务之间的通讯是基于http restful的。
 * Spring Cloud有两种服务调用方式，一种是ribbon+restTemplate，另一种是Feign；
 *
 * Ribbon是一个负载均衡客户端，可以很好的控制http和tcp的一些行为。
 *
 * Ribbon默认实现了：
 * IClientConfig
 * IRule
 * IPing
 * ServerList
 * ServerListFilter
 * ILoadBlancer
 */
@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class RibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibbonApplication.class, args);
	}

	@Bean// 注入bean：restTemplate
	@LoadBalanced// 表明restTemplate开启负载均衡功能
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
