package com.cloud.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Zuul的主要功能是路由的转发和过滤。
 * Zuul默认和Ribbon结合实现了负载均衡的能力。
 * Zuul有以下功能
 *  Authentication
 *  Insights
 *  Stress Testing
 *  Canary Testing
 *  Dynamic Routing
 *  Service Migration
 *  Load Shedding
 *  Security
 *  Staitc Response handling
 *  Active/Active traffic management
 */
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class ZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApplication.class, args);
	}
}
