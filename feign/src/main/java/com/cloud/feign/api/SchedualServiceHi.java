package com.cloud.feign.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client", fallback = SchedualServiceHiHystrix.class)//通过@ FeignClient（“服务名”），来指定调用哪个服务
public interface SchedualServiceHi {

	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	// 要为@RequestParam指定value不然启动报错"java.lang.IllegalStateException: RequestParam.value() was empty on parameter 0"
	String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
