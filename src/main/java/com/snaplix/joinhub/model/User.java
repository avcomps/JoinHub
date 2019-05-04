package com.snaplix.joinhub.model;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue
	private String userID;
	
	public User(){
		
	}

}