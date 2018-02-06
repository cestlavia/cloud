package com.cloud.feign.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//通过@ FeignClient（“服务名”），来指定调用哪个服务，用value或name都行
@FeignClient(name = "eureka-client", fallback = SchedualServiceHiHystrix.class)
public interface SchedualServiceHi {

	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	// 要为@RequestParam指定value不然启动报错"java.lang.IllegalStateException: RequestParam.value() was empty on parameter 0"
	String sayHiFromClientOne(@RequestParam(value = "name") String name);

}
