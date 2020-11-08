package com.vargas.PracticaJMSWeb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vargas.PracticaJMSWeb.models.Message;
import com.vargas.PracticaJMSWeb.repositories.MessageRepository;

@Service
public class MessageService {
	
	@Autowired
	private MessageRepository mr;
	
	public void saveMessage(Message message) {
		Message msg = new Message();
		msg.setCreated_at(message.getCreated_at());
		msg.setIdDevice(message.getIdDevice());
		msg.setTemperature(message.getTemperature());
		msg.setHumidity(message.getHumidity());
		mr.save(msg);
	}
	
	public List<Message> getListMessages() {
		return mr.findAll();
	}

}
