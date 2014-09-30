package model;

import java.util.Date;

import dateoutils.CalculateurAge;

public class Girafe extends Animal {

	public Girafe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Girafe(String nomAbrege, Date dateNaiss, String sexe, int taille,
			double poids, double coefficient) {
		super(nomAbrege, dateNaiss, sexe, taille, poids,coefficient );
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dormir() {
		System.out.println("je m'appelle "+this.getNom()+" et je dors debout.");
		
	}

	@Override
	public double finAlgo() {
		CalculateurAge ca = CalculateurAge.getInstance();
		return (this.getTaille()*2)*7;
	}

	@Override
	public void courir() {
		System.out.println("Je m'appelle "+this.getNom()+"et je cours assez vite");
		
	}

}
