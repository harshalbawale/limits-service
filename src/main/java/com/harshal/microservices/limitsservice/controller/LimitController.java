package com.harshal.microservices.limitsservice.controller;

import com.harshal.microservices.limitsservice.module.LimitConfiguration;
import com.harshal.microservices.limitsservice.util.configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {

    @Autowired
    private configuration config;
    
    @Autowired
    Environment env;

    @GetMapping("/getlimits")
    public LimitConfiguration getLimits(){
    	if(env.getActiveProfiles().length >= 1) {
    	return  new LimitConfiguration(config.getMaximum(),config.getMinimum(),env.getActiveProfiles()[0]);
    	}else {
    		return  new LimitConfiguration(config.getMaximum(),config.getMinimum(),env.getDefaultProfiles()[0]);
		}
    }

}
