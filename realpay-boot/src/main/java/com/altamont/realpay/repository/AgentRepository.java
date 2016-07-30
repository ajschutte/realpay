package com.altamont.realpay.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.altamont.realpay.domain.Agent;

public interface AgentRepository extends JpaRepository <Agent , Long> {

}
