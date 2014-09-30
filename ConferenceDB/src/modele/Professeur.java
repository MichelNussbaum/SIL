package modele;

import java.util.ArrayList;
import java.util.List;

public class Professeur {
	private String nom;
	private String prenom;
	private String specialite;
	private List<Conference> conferences = new ArrayList<Conference>();
	private List<Conference> conferencesPresidees = new ArrayList<Conference>();
	

	public Professeur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Professeur(String nom, String prenom, String specialite) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.specialite = specialite;
	}
	
	public void ajoutParticipation(Conference conference){
		if(!conferences.contains(conference)){
			conferences.add(conference);
			conference.ajoutConferencier(this);			
		}
	}
	
	public void supprimerParticipation(Conference conference){
		if(conferences.contains(conferences)){
			conferences.remove(conference);
			conference.supprimerConferencier(this);
		}
		
	}
	
	public void ajoutPresidence(Conference conference){
		if(!conferencesPresidees.contains(conference)) {
			conferencesPresidees.add(conference);
			conference.setPresident(this);
		}
	}
	
	public void supprimerPresidence(Conference conference){
		if(conferencesPresidees.contains(conference)) {
			conferencesPresidees.remove(conference);
			conference.setPresident(null);
		}
	}

	public List<Conference> getConferencesPresidees() {
		return conferencesPresidees;
	}

	public void setConferencesPresidees(List<Conference> conferencesPresidees) {
		this.conferencesPresidees = conferencesPresidees;
	}

	public List<Conference> getConferences() {
		return conferences;
	}

	public void setConferences(List<Conference> conferences) {
		this.conferences = conferences;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	@Override
	public String toString() {
		return "Professeur [nom=" + nom + ", prenom=" + prenom
				+ ", specialite=" + specialite + "]";
	}

}
