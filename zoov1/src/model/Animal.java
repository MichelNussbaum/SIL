package model;

import java.util.Date;

public abstract class Animal implements Pensionnaires {
	private String nom;
	private Date dateNaiss;
	private String sexe;
	private int taille;
	private double poids;

	public Animal(String nomAbrege, Date dateNaiss, String sexe, int taille,
			double poids) {
		super();
		this.nom= nomAbrege;
		this.dateNaiss = dateNaiss;
		this.sexe = sexe;
		this.taille = taille;
		this.poids = poids;
	}

	public Animal() {
		super();
	}
	
	public abstract void dormir();

	public String getNom() {
		return nom;
	}

	public void setNomAbrege(String nomAbrege) {
		this.nom = nomAbrege;
	}

	public Date getDateNaiss() {
		return dateNaiss;
	}

	public void setDateNaiss(Date dateNaiss) {
		this.dateNaiss = dateNaiss;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

	public double getPoids() {
		return poids;
	}

	public void setPoids(double poids) {
		this.poids = poids;
	}
	
	

}
