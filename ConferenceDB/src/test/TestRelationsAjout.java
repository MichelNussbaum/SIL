package test;

import java.util.Date;

import modele.Conference;
import modele.Professeur;

public class TestRelationsAjout {

	public static void main(String[] args) {
		
		Professeur p1 = new Professeur("DUPONT","Pierre", "JAVA EE");
		Professeur p2 = new Professeur("MARTIN","Isabelle", "SGBDR");
		Professeur p3 = new Professeur("ABEL", "Christian", "LINUX");
		
		Conference c1 = new Conference("Haute Disponibilté", new Date());
		Conference c2 = new Conference("CLOUD COMPUTING", new Date());
		Conference c3 = new Conference("Les Bases NoSQL et le Big Data", new Date());
		
		c1.ajoutConferencier(p1);
		c1.ajoutConferencier(p2);
		c1.setPresident(p1);
		
		c2.ajoutConferencier(p1);
		c2.ajoutConferencier(p2);
		c2.ajoutConferencier(p3);
		c2.setPresident(p1);
		
		c3.ajoutConferencier(p3);
		c3.setPresident(p2); // provoque une erreur
		c3.setPresident(p3);
		
		System.out.println("C1 "+ c1.getProfesseurs().size());
		System.out.println("C2 "+ c2.getProfesseurs().size());
		System.out.println("C3 "+ c3.getProfesseurs().size());
		
		System.out.println("P1 "+p1.getConferences().size()+" présidences "+p1.getConferencesPresidees().size());
		System.out.println("P2 "+p2.getConferences().size()+" présidences "+p2.getConferencesPresidees().size());
		System.out.println("P3 "+p1.getConferences().size()+" présidences "+p3.getConferencesPresidees().size());

	}

}
