package com.altamont.realpay.domain;

import javax.persistence.Entity;

@Entity
public class User extends BaseEntity {

	public String userId;
	public String password;
	public boolean lockedOut;
	
}
