package com.github.fwidder.microserviceexample.dashboardservice.service;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.fwidder.microserviceexample.model.model.Message;

@RibbonClient("MessageService")
@FeignClient("MessageService")
public interface MessageServiceProxy {
	
	 @RequestMapping("/message/findall")
	 public List<Message> findAll();
}
