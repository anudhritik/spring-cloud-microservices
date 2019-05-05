package com.demo.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.microservices.limitsservice.Configuration;
import com.demo.microservices.limitsservice.bean.LimitsConfiguration;

@RestController
public class LimitsConfigurationController {
	@Autowired
	private Configuration configuration;

	@GetMapping("/limits")
	public LimitsConfiguration retrieveLimitsFromConfigurations() {
		return new LimitsConfiguration(configuration.getMaximum(), configuration.getMinium());
	}
}
