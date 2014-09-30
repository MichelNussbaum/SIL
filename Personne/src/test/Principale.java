package test;

import model.Adresse;
import model.Etudiant;
import model.Personne;
import model.PersonneSyndiquee;
import model.Professeur;

public class Principale {

	public static void main(String[] args) {
		Personne e1 = new Etudiant("Nussbaum", "Michel", new Adresse("rue Champ Lagarde", "78000", "Versailles"), "SIL");
		Personne p1 = new Professeur("Le Coz", "aa", new Adresse("avenue IUT","78120", "Vélizy"), "Java");
		System.out.println(e1.informations());
		System.out.println(p1.informations());
		((PersonneSyndiquee)p1).setSyndique(true);
		System.out.println(((PersonneSyndiquee)p1).isSyndique());
		

	}

}
