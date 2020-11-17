package com.j3.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.TableGenerator;
import javax.validation.constraints.NotNull;

@Entity
@Inheritance(strategy = InheritanceType.JOINED) //subtables
@DiscriminatorColumn(name = "Type")
//@TableGenerator(name = "Forme_GEN",table = "ID_GEN", pkColumnName = "GEN_NAME", valueColumnName = "GEN_VALUE", allocationSize = 1)
public class Forme {
	
	@Id
	private long id;
	@NotNull
	private double surface;
	@NotNull
	private double superficie;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getSurface() {
		return surface;
	}
	public void setSurface(double surface) {
		this.surface = surface;
	}
	public double getSuperficie() {
		return superficie;
	}
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}
	
	
	
	
	

}
