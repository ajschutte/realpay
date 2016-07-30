package com.altamont.realpay.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Client extends BaseEntity {

	@OneToMany(mappedBy = "buyer")
	private Set <SalesTransacation> sales;
	
	@OneToMany (mappedBy = "seller")
	private Set <SalesTransacation> purchases;

	public Set<SalesTransacation> getSales() {
		return sales;
	}

	public void setSales(Set<SalesTransacation> sales) {
		this.sales = sales;
	}

	public Set<SalesTransacation> getPurchases() {
		return purchases;
	}

	public void setPurchases(Set<SalesTransacation> purchases) {
		this.purchases = purchases;
	}
	
}
