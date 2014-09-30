package modele;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Conference {
	private String intitule;
	private Date date;
	public Professeur getPresident() {
		return president;
	}

	private Professeur president;
	private List<Professeur> professeurs = new ArrayList<Professeur>();

	@Override
	public String toString() {
		return "Conference [intitule=" + intitule + ", date=" + date
				+ ", president=" + president + "]";
	}

	public Conference() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Conference(String intitule, Date date) {
		super();
		this.intitule = intitule;
		this.date = date;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void ajoutConferencier(Professeur professeur) {
		if (!professeurs.contains(professeur)) {
			professeurs.add(professeur);
			professeur.ajoutParticipation(this);
		}

	}

	public void supprimerConferencier(Professeur professeur) {
		if (professeurs.contains(professeur)) {
			professeurs.remove(professeur);
			professeur.supprimerParticipation(this);
		}
	}

	public void setPresident(Professeur president) {
		if(president == null) {
			this.president = null;
			return;
		}
		if(professeurs.contains(president)) {
			this.president = president;
			president.ajoutPresidence(this);
		}
		else System.out.println("ATTENTION LE PRESIDENT DOIT ÊTRE D'ABORD PARTICPANT");
	}

	public List<Professeur> getProfesseurs() {
		return professeurs;
	}

	public void setProfesseurs(List<Professeur> professeurs) {
		this.professeurs = professeurs;
	}

}
