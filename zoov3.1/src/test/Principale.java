package test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;

import model.Adresse;
import model.Aigle;
import model.Comportement;
import model.Courir;
import model.Girafe;
import model.Lion;
import model.Pensionnaires;
import model.Tigre;
import model.Voler;
import model.Zoo;

public class Principale {

	public static void main(String[] args) throws ParseException {
		ArrayList<Pensionnaires> a = new ArrayList<Pensionnaires>();
		DateFormat dfm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		dfm.setTimeZone(TimeZone.getTimeZone("Europe/Paris"));
		Date d = dfm.parse("2007-02-26 20:15:00");
		Comportement c = new Courir();
		Comportement v = new Voler();
		Pensionnaires p1 = new Lion("Léo", d,"M", 112, 112.2, 1.5,c);
		Pensionnaires p2 = new Tigre("Tiger", d,"M", 250, 150.5,1.7,c);
		Pensionnaires p3 = new Girafe("gigi", d,"F", 320, 320.5,1.3,c);
		Pensionnaires p4 = new Aigle("Eagle", d,"F", 200, 50,1.3,v);
		a.add(p1);
		a.add(p2);
		a.add(p3);
		a.add(p4);
		Adresse adresse = new Adresse("rue du Zoo", "75000", "Paris");
		Zoo z = new Zoo(a, "ZdP", "Zoo de Paris", adresse);
		z.endormir();
		z.faireCourir();
		
	}

}
