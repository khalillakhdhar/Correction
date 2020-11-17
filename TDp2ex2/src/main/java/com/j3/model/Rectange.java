package com.j3.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class Rectange extends Polygone {
@NotNull
int hauteur;
@NotNull
int largeur;
public int getHauteur() {
	return hauteur;
}
public void setHauteur(int hauteur) {
	this.hauteur = hauteur;
}
public int getLargeur() {
	return largeur;
}
public void setLargeur(int largeur) {
	this.largeur = largeur;
}




}
