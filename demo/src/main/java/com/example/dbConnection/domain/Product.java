package com.example.dbConnection.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "QMS" ,name = "subproject")
public class Product {
	
	@Id
	@Column(name ="PD_PROJSUBID")
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	

}
