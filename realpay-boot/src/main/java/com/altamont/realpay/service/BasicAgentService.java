package com.altamont.realpay.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altamont.realpay.domain.Agent;
import com.altamont.realpay.repository.AgentRepository;

@Service("agentService")
@Transactional
public class BasicAgentService implements AgentService {

	@Autowired
	AgentRepository repository;
	
	@Override
	public List<Agent> findAllAgents() {
	
		return repository.findAll();

	}

}
