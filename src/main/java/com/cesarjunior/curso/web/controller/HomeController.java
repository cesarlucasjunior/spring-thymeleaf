package com.cesarjunior.curso.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	//@RequestMapping(value="/", method=RequestMethod.GET)
	@GetMapping("/")
	public String home() {
		return "/home";
	}

}
