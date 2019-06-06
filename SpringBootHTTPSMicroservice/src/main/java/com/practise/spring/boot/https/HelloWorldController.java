package com.practise.spring.boot.https;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping(value="/sayHello")
	public String sayHello()
	{
		return "Hey !! Its a Https secured endpoint";
	}
	

}
