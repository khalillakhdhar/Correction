package com.j3.model;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Polygone extends Forme {
int angles;

public int getAngles() {
	return angles;
}

public void setAngles(int angles) {
	this.angles = angles;
}

}
