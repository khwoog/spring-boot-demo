package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculateController {
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public int add(@RequestParam(value="a") int a, @RequestParam(value="b") int b) {
		return a+b;
	}
	
	@RequestMapping(value="/minus", method=RequestMethod.GET)
	public int minus(@RequestParam(value="a") int a, @RequestParam(value="b") int b) {
		return a-b;
	}
	
	@RequestMapping(value="/divide", method=RequestMethod.GET)
	public double divide(@RequestParam(value="a") int a, @RequestParam(value="b") int b) {
		return a/(double)b;
	}
	
	@RequestMapping(value="/multiply", method=RequestMethod.GET)
	public int multiply(@RequestParam(value="a") int a, @RequestParam(value="b") int b) {
		return a*b;
	} 
}
