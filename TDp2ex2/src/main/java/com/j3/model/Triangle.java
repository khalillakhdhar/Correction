package com.j3.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class Triangle extends Polygone {

	@NotNull
	int base;
	@NotNull
	String types;
	public String getTypes() {
		return types;
	}
	public void setTypes(String types) {
		this.types = types;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	
	
	
	
}
