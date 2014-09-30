package model;

public abstract class PersonneImpl implements Personne, PersonneSyndiquee {

	private String nom, prenom;
	private Adresse adresse;
	private boolean syndique;
	
	
	
	
	public PersonneImpl(String nom, String prenom, Adresse adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}
	
	



	/* (non-Javadoc)
	 * @see model.PersonneSyndiquee#isSyndique()
	 */
	@Override
	public boolean isSyndique() {
		return syndique;
	}





	/* (non-Javadoc)
	 * @see model.PersonneSyndiquee#setSyndique(boolean)
	 */
	@Override
	public void setSyndique(boolean syndique) {
		this.syndique = syndique;
	}





	@Override
	public String toString() {
			return "PersonneImpl [nom=" + nom + ", prenom=" + prenom + ", adresse="
					+ adresse + "]";
		
	}



	@Override
	public String informations() {
		return toString();
	}

}
