package com.itend.cloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-helloservice")
public interface SchedualServiceHello {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	String sayHelloFromFeignClient(@RequestParam(value = "name") String name);

}
