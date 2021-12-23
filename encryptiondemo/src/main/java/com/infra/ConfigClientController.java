package com.infra;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {

	@Value("${server.port}")
	private String serverPort;
	
	@Value("${username}")
	private String username;
	
	@Value("${password}")
	private String password;
	
	@RequestMapping("/username")
	public String getUserName() {
		return username;
	}

	@RequestMapping("/getConfigDetails")
	public String getConfigDetails() {
		return "ConfigClientController serverPort=" + serverPort + ", username=" + username + ", password=" + password;
	}
	
	
}
