package model;

public class Adresse {
	private String voie,codePostale,ville;

	@Override
	public String toString() {
		return "Adresse [voie=" + voie + ", codePostale=" + codePostale
				+ ", ville=" + ville + "]";
	}

	public Adresse(String voie, String codePostale, String ville) {
		super();
		this.voie = voie;
		this.codePostale = codePostale;
		this.ville = ville;
	}

	public Adresse() {
		super();
	}

	public String getVoie() {
		return voie;
	}

	public void setVoie(String voie) {
		this.voie = voie;
	}

	public String getCodePostale() {
		return codePostale;
	}

	public void setCodePostale(String codePostale) {
		this.codePostale = codePostale;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}
	
}
