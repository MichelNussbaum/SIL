package outils;

import java.util.List;

import modele.Conference;

public class GerantDeConference {
	private List<Conference> conferences;

	public GerantDeConference() {
		super();
	}
	
	
	public List<Conference> succes(){
		return Statistique.getInstance().succes(conferences);
	}


	public GerantDeConference(List<Conference> conferences) {
		super();
		this.conferences = conferences;
	}
	
	
}
