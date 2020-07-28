package com.github.fwidder.microserviceexample.messageservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.github.fwidder.microserviceexample.model.model.Message;
import com.google.common.collect.Lists;

@Service
public class MessageService {
	public List<Message> findAll() {
		return Lists.asList(Message.builder().id(1L).payload("Test").build(), new Message[0]);
	}
}
