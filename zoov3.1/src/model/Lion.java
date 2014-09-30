package model;

import java.util.Date;

import dateoutils.CalculateurAge;

public class Lion extends Animal {

	
	
	public Lion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lion(String nom, Date dateNaiss, String sexe, int taille,
			double poids, double coefficient,Comportement comportement) {
		super(nom, dateNaiss, sexe, taille, poids, coefficient,comportement);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dormir() {
		System.out.println("je m'appelle "+this.getNom()+" et je dors sur le ventre.");
	}

	@Override
	public double finAlgo() {
		CalculateurAge ca = CalculateurAge.getInstance();
		return (ca.calculer(this.getDateNaiss())*1.2)*12;
		
	}

	@Override
	public String getLibelle() {
		return "vite";
	}

	
	


}
