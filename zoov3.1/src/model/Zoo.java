package model;

import java.util.ArrayList;

public class Zoo {
	
	private ArrayList<Pensionnaires> pensionnaires = new ArrayList<Pensionnaires>();
	private String nomAbrege,nomLong;
	private Adresse adresse;

	public Zoo() {
		super();
	}
	
	
	
	public ArrayList<Pensionnaires> getPensionnaires() {
		return pensionnaires;
	}



	public void setPensionnaires(ArrayList<Pensionnaires> pensionnaires) {
		this.pensionnaires = pensionnaires;
	}



	public String getNomAbrege() {
		return nomAbrege;
	}



	public void setNomAbrege(String nomAbrege) {
		this.nomAbrege = nomAbrege;
	}



	public String getNomLong() {
		return nomLong;
	}



	public void setNomLong(String nomLong) {
		this.nomLong = nomLong;
	}



	public Adresse getAdresse() {
		return adresse;
	}



	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}



	public Zoo(ArrayList<Pensionnaires> pensionnaires, String nomAbrege,
			String nomLong, Adresse adresse) {
		super();
		this.pensionnaires = pensionnaires;
		this.nomAbrege = nomAbrege;
		this.nomLong = nomLong;
		this.adresse = adresse;
	}



	public void endormir(){
		for (Pensionnaires p : pensionnaires) {
			p.dormir();
		}
	}
	
	public String chargesAnimaux(){
		double cout = 0;
		for (Pensionnaires p : pensionnaires) {
			cout+= p.cout();
		}
		return "Le cout des charges du zoo est de "+cout;
	}
	
	public void faireCourir(){
		for (Pensionnaires p : pensionnaires) {
			p.seMouvoir();
		}
	}
	
	

	
	
}
