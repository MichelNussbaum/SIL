package test;

import java.util.ArrayList;
import java.util.Date;

import dao.DAO;
import model.Adresse;
import model.Girafe;
import model.Lion;
import model.Pensionnaires;
import model.Tigre;
import model.Zoo;

public class Principale {

	public static void main(String[] args) {
		ArrayList<Pensionnaires> a = new ArrayList<Pensionnaires>();
		Date d = new Date();
		Pensionnaires p1 = new Lion("Léo", d,"M", 112, 112.2);
		Pensionnaires p2 = new Tigre("Tiger", d,"M", 250, 150.5);
		Pensionnaires p3 = new Girafe("gigi", d,"F", 320, 320.5);
		a.add(p1);
		a.add(p2);
		a.add(p3);
		Adresse adresse = new Adresse("rue du Zoo", "75000", "Paris");
		Zoo z = new Zoo(a, "ZdP", "Zoo de Paris", adresse);
		z.endormir();
		ArrayList<Zoo> lz = new ArrayList<Zoo>();
		DAO dao = new DAO();
		dao.sauvegarder(z);

	}

}
