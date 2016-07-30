package com.altamont.realpay.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.altamont.realpay.dto.AgentDTO;

@Entity
public class Agent extends BaseEntity implements AgentDTO{

	private String firstName;
	private String lastName;
	private String licNumber;
	
	@OneToMany(mappedBy = "listingAgent")
	private Set <SalesTransacation> sellingSide;
	
	@OneToMany(mappedBy = "buyerAgent")
	private Set <SalesTransacation> buyingSide;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLicNumber() {
		return licNumber;
	}

	public void setLicNumber(String licNumber) {
		this.licNumber = licNumber;
	}

	public Set<SalesTransacation> getSellingSide() {
		return sellingSide;
	}

	public void setSellingSide(Set<SalesTransacation> sellingSide) {
		this.sellingSide = sellingSide;
	}

	public Set<SalesTransacation> getBuyingSide() {
		return buyingSide;
	}

	public void setBuyingSide(Set<SalesTransacation> buyingSide) {
		this.buyingSide = buyingSide;
	}
	
}
