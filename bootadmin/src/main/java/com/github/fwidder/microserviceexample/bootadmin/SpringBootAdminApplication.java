package com.github.fwidder.microserviceexample.bootadmin;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableAdminServer
public class SpringBootAdminApplication {
	public static void main(String[] args) {
		new SpringApplicationBuilder(SpringBootAdminApplication.class).web(WebApplicationType.REACTIVE).run(args);
	}
}
