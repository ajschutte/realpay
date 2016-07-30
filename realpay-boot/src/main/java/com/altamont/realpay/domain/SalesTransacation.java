package com.altamont.realpay.domain;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class SalesTransacation extends BaseEntity {

	@ManyToOne
	private Property property;

	@ManyToOne(optional = false)
	@JoinColumn(name = "buyer_id", referencedColumnName = "id")	
	private Client buyer;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "seller_id", referencedColumnName = "id")	
	private Client seller;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "listing_agent_id", referencedColumnName = "id")
	private Agent listingAgent;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "buyer_agent_id", referencedColumnName = "id")
	private Agent buyerAgent;
	
	private BigDecimal dueDiligenceFee;
	private BigDecimal earnestMoney;
	public Property getProperty() {
		return property;
	}
	public void setProperty(Property property) {
		this.property = property;
	}
	public Client getBuyer() {
		return buyer;
	}
	public void setBuyer(Client buyer) {
		this.buyer = buyer;
	}
	public Client getSeller() {
		return seller;
	}
	public void setSeller(Client seller) {
		this.seller = seller;
	}
	public Agent getListingAgent() {
		return listingAgent;
	}
	public void setListingAgent(Agent listingAgent) {
		this.listingAgent = listingAgent;
	}
	public Agent getBuyerAgent() {
		return buyerAgent;
	}
	public void setBuyerAgent(Agent buyerAgent) {
		this.buyerAgent = buyerAgent;
	}
	public BigDecimal getDueDiligenceFee() {
		return dueDiligenceFee;
	}
	public void setDueDiligenceFee(BigDecimal dueDiligenceFee) {
		this.dueDiligenceFee = dueDiligenceFee;
	}
	public BigDecimal getEarnestMoney() {
		return earnestMoney;
	}
	public void setEarnestMoney(BigDecimal earnestMoney) {
		this.earnestMoney = earnestMoney;
	}
	
}
