package com.github.fwidder.microserviceexample.dashboardservice.controller;

import java.util.List;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.fwidder.microserviceexample.dashboardservice.service.MessageServiceProxy;
import com.github.fwidder.microserviceexample.model.model.Message;

@RefreshScope
@RestController
public class MessageInfoController {
	private final MessageServiceProxy messageServiceProxy;
	
	public MessageInfoController(MessageServiceProxy messageServiceProxy) {
		this.messageServiceProxy = messageServiceProxy;
	}
	

	 @RequestMapping("/dashboard/feign/message")
	 public List<Message> findall() {
	  return messageServiceProxy.findAll();
	 }
}
