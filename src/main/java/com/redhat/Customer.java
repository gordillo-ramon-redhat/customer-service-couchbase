package com.redhat;

import java.io.Serializable;

import org.springframework.data.couchbase.core.mapping.Document;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;

@SuppressWarnings("serial")
@Document
public class Customer implements Serializable {

	@Id
	private String id;
	
	@Field
	private String firstName;
	
	@Field
    private String lastName;
	
	@Field
    private String email;

    public Customer(String id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    
	public String getId() {
        return id;
    }
	
	public void setId(String id) {
        this.id = id;
    }
	
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
    	
}