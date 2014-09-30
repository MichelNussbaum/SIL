package model;

import java.util.Date;

public class Tigre extends Animal {

	public Tigre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tigre(String nomAbrege, Date dateNaiss, String sexe, int taille,
			double poids) {
		super(nomAbrege, dateNaiss, sexe, taille, poids);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dormir() {
		System.out.println("je m'appelle "+this.getNom()+" et je dors sur le dos.");
	}

}
