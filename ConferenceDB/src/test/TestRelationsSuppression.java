package test;

import java.util.Date;

import modele.Conference;
import modele.Professeur;

public class TestRelationsSuppression {

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
		c3.setPresident(p3);
		
		System.out.println("C1 participations "+ c1.getProfesseurs().size()+" C1 président "+c1.getPresident());
		System.out.println("C2 participations "+ c2.getProfesseurs().size()+" C2 président "+c2.getPresident());
		System.out.println("C3 participations "+ c3.getProfesseurs().size()+" c3 président "+c3.getPresident());
		
		System.out.println("P1 participations "+p1.getConferences().size()+" présidences "+p1.getConferencesPresidees().size());
		System.out.println("P2 participations "+p2.getConferences().size()+" présidences "+p2.getConferencesPresidees().size());
		System.out.println("P3 participations "+p1.getConferences().size()+" présidences "+p3.getConferencesPresidees().size());
		
		//suppression du participant p2 à la conférence c2
		c2.supprimerConferencier(p2);
		System.out.println("C2 participants "+ c2.getProfesseurs().size());
		
		// le professeur p3 ne veut plus être président de la conférence C3
		p3.supprimerPresidence(c3);
		System.out.println("P3 présidences "+p3.getConferencesPresidees().size());
		System.out.println(" c3 président "+c3.getPresident());
		
	}

}
