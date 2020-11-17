package com.j3.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class Cercle extends Forme {
@NotNull
int centreX;
@NotNull
int centreY;
public int getCentreX() {
	return centreX;
}
public void setCentreX(int centreX) {
	this.centreX = centreX;
}
public int getCentreY() {
	return centreY;
}
public void setCentreY(int centreY) {
	this.centreY = centreY;
}



}
