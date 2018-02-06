package com.lp.configuration;

import com.lp.properties.HelloServiceProperties;
import com.lp.service.HelloService;
import com.lp.service.impl.HelloServiceImpl;
import javax.annotation.Resource;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;

@Configuration
@EnableConfigurationProperties(HelloServiceProperties.class)
public class HelloServiceConfig {

  @Resource
  private HelloServiceProperties helloServiceProperties;

  @ConditionalOnProperty(prefix="hello", value="enabled", matchIfMissing = true)
  @ConditionalOnClass(HelloService.class)
  @Bean
  public HelloService initHelloService() {
    HelloService helloService = new HelloServiceImpl();
    if(StringUtils.isEmpty(helloServiceProperties.getContent())){
      helloServiceProperties.setContent("hello world");
    }
    helloService.hello(helloServiceProperties.getContent());
    return helloService;
  }

}
