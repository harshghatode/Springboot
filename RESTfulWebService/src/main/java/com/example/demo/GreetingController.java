package com.example.demo;


import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



/*
* The controller will ensure that the class will control how the object will be used
* it is done using 2 parts
* 	1. get mapping
*  2. request parameters
*/
@RestController
public class GreetingController {
	
	/* 
	 * s is a placeholder of run time value
	 *  for e.g. if user inputs : "abcd"
	 * result will be "Hello , abcd;
	 * */
     
	private static final String template ="Hello , %s!";
	private final AtomicLong atomicLong =new AtomicLong(); //atomicLong is a data type that will handle huge data
	
	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value ="name" , defaultValue="World") String name) {
		return new Greeting(atomicLong.incrementAndGet(),String.format(template, name));
	}
}