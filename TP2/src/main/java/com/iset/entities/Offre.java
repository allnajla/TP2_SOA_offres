package com.iset.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
// la table dans BD est nommée Offre par défaut
@Entity
public class Offre {
	@Id @GeneratedValue
	long code;
	String intitulé;
	String specialité;
	String société;
	int nbpostes;
	String pays;
	public String getIntitulé() {
		return intitulé;
	}
	public void setIntitulé(String intitulé) {
		this.intitulé = intitulé;
	}
	public String getSpecialité() {
		return specialité;
	}
	public void setSpecialité(String specialité) {
		this.specialité = specialité;
	}
	public String getSociété() {
		return société;
	}
	public void setSociété(String société) {
		this.société = société;
	}
	public int getNbpostes() {
		return nbpostes;
	}
	public void setNbpostes(int nbpostes) {
		this.nbpostes = nbpostes;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public Offre(String intitulé, String specialité, String société, int nbpostes, String pays) {
		super();
	
		this.intitulé = intitulé;
		this.specialité = specialité;
		this.société = société;
		this.nbpostes = nbpostes;
		this.pays = pays;
	}
	public Offre() {
		super();
		// TODO Auto-generated constructor stub
	}


}
