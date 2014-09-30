package model;

public class Professeur extends PersonneImpl {
	private String matiere;

	public Professeur(String nom, String prenom, Adresse adresse, String matiere) {
		super(nom, prenom, adresse);
		this.matiere = matiere;
	}

	@Override
	public String toString() {
		return "Professeur [matiere=" + matiere 
				+ super.toString() + "]";
	}

	
}
