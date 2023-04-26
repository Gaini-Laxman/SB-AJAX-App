package com.klinnovations.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserRestController {
	

	@GetMapping("/")
	public String load() {
		return "index";
	}
	
	@GetMapping("/cmsg")
	@ResponseBody
	public String getDropdownMsg(@RequestParam("cname") String cname) {
		String msg = "I am going to "+ cname+" in next month";
		return msg;
	}

	@GetMapping("/msg")
	@ResponseBody
	public String getMsg(@RequestParam("name") String name) {
		String msg = "Hello, " + name;
		return msg;
	}
	
	
	
}
