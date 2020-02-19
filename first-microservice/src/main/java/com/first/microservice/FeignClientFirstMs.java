package com.first.microservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("second-microservice")
public interface FeignClientFirstMs {
	
	@GetMapping("/sayHi")
	public String hiFromSecondMs();

}
