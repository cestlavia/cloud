package com.cloud.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Spring Cloud Config
 * 在分布式系统中，由于服务数量巨多，为了方便服务配置文件统一管理，实时更新，所以需要分布式配置中心组件。
 * 在Spring Cloud中，有分布式配置中心组件spring cloud config ，
 * 它支持配置服务放在配置服务的内存中（即本地），也支持放在远程Git仓库中。
 * 在spring cloud config 组件中，分两个角色，
 * 一是config server，二是config client。
 *
 *
 * 访问：http://localhost:8888/foo/dev，查看configserver是否可以获取远程配置信息
 * http请求地址和资源文件映射如下:
	 /{application}/{profile}[/{label}]
	 /{application}-{profile}.yml
	 /{label}/{application}-{profile}.yml
	 /{application}-{profile}.properties
	 /{label}/{application}-{profile}.properties
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}
}
