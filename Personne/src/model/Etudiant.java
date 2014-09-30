package model;

public class Etudiant extends PersonneImpl {
	private String formation;

	public Etudiant(String nom, String prenom, Adresse adresse, String formation) {
		super(nom, prenom, adresse);
		this.formation = formation;
	}

	@Override
	public String toString() {
		return "Etudiant [formation=" + formation + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	
}
