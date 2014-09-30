package test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import dao.DAO;
import modele.Conference;
import modele.Professeur;
import outils.GerantDeConference;

public class TestDB {

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
		
		List<Conference> l = new ArrayList<Conference>();
		l.add(c1);
		l.add(c2);
		l.add(c3);
		
		DAO d= new DAO();
		d.sauvegarder(l);

	}

}
