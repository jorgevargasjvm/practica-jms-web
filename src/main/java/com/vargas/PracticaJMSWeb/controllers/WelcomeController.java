package com.vargas.PracticaJMSWeb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	
	@GetMapping(value = "/")
	public String index() {
		return "welcome";
	}

}
