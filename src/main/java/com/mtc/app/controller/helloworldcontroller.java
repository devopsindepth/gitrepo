package com.mtc.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloworldcontroller {
	
	 
	@RequestMapping(value="/")
	public String hello() {
		return"Hello World!!";
		
	}

}
