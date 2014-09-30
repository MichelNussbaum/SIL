package model;

import java.util.Date;

public class Lion extends Animal {

	
	
	public Lion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lion(String nom, Date dateNaiss, String sexe, int taille,
			double poids) {
		super(nom, dateNaiss, sexe, taille, poids);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dormir() {
		System.out.println("je m'appelle "+this.getNom()+" et je dors sur le ventre.");
	}

}
