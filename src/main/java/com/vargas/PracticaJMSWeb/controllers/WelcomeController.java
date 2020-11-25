package com.vargas.PracticaJMSWeb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.vargas.PracticaJMSWeb.models.Message;
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
	
	@GetMapping("/messages/graphs")
    public String graficas(Model model){
		float tDevice1[] = new float[]{ 0, 0, 0, 0, 0 };
        float tDevice2[] = new float[]{ 0, 0, 0, 0, 0 };
        float hDevice1[] = new float[]{ 0, 0, 0, 0, 0 };
        float hDevice2[] = new float[]{ 0, 0, 0, 0, 0 };
        
        List<Message> messages = ms.getListMessages();
        
        int indicator1 = 0;
        int indicator2 = 0;

        for (Message m : messages) {
            if (m.getIdDevice() == 1){
            	tDevice1[indicator1] = m.getTemperature();
            	hDevice1[indicator1] = m.getHumidity();
            	indicator1++;
            } else if (m.getIdDevice() == 2){
            	tDevice2[indicator2] = m.getTemperature();
            	hDevice2[indicator2] = m.getHumidity();
            	indicator2++;
            }
        }

        model.addAttribute("tDevice1", tDevice1);
        model.addAttribute("tDevice2", tDevice2);
        model.addAttribute("hDevice1", hDevice1);
        model.addAttribute("hDevice2", hDevice2);
        return "graphs";
        
    }

}
