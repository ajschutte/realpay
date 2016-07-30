package com.altamont.realpay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.altamont.realpay.domain.Agent;
import com.altamont.realpay.service.AgentService;

@RestController
public class AgentController {
	
	@Autowired
	AgentService service;

	@RequestMapping(value = "/agent/", method = RequestMethod.GET)
	public ResponseEntity <List<Agent>> listAllAgents(){
		List<Agent> agents = service.findAllAgents(); 
		
		return new ResponseEntity <List<Agent>>(agents, HttpStatus.OK);
	}
}
