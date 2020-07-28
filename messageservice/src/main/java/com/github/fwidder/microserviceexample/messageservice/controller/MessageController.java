package com.github.fwidder.microserviceexample.messageservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.fwidder.microserviceexample.messageservice.service.MessageService;
import com.github.fwidder.microserviceexample.model.model.Message;

@RestController
public class MessageController {
	
	private final MessageService messageService;
	
	public MessageController(MessageService messageService) {
		this.messageService = new MessageService();		
	}
	
	@GetMapping("message/findall")
	public List<Message> findAll(){
		return messageService.findAll();
	}
}
