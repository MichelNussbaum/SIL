package model;

import java.util.Date;

import dateoutils.CalculateurAge;

public class Tigre extends Animal {

	public Tigre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tigre(String nomAbrege, Date dateNaiss, String sexe, int taille,
			double poids, double coefficient,Comportement comportement) {
		super(nomAbrege, dateNaiss, sexe, taille, poids,coefficient,comportement);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dormir() {
		System.out.println("je m'appelle "+this.getNom()+" et je dors sur le dos.");
	}

	@Override
	public double finAlgo() {
		CalculateurAge ca = CalculateurAge.getInstance();
		return (ca.calculer(this.getDateNaiss())*1.2)*12;
	}

	@Override
	public String getLibelle() {
		return "très vite";
	}


	
	
}
