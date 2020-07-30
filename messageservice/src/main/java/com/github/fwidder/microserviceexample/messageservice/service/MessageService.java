package com.github.fwidder.microserviceexample.messageservice.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.github.fwidder.microserviceexample.model.model.Message;
import com.google.common.collect.Lists;

@Service
public class MessageService {
	public List<Message> findAll() {
		return Lists.asList(Message.builder().id(1L).payload(LocalDateTime.now().toString()).build(), new Message[0]);
	}
}
