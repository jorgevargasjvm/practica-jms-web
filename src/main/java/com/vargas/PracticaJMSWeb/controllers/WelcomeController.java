package com.vargas.PracticaJMSWeb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.vargas.PracticaJMSWeb.services.MessageService;

@Controller
public class WelcomeController {
	
	@Autowired
	private MessageService ms;
	
	@GetMapping(value = "/")
	public String index(Model model) {
		model.addAttribute("messages", ms.getListMessages());
		return "welcome";
	}

}
