package test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import model.Adresse;
import model.Girafe;
import model.Lion;
import model.Pensionnaires;
import model.Tigre;
import model.Zoo;
import dao.DAO;

public class Principale {

	public static void main(String[] args) throws ParseException {
		ArrayList<Pensionnaires> a = new ArrayList<Pensionnaires>();
		DateFormat dfm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		dfm.setTimeZone(TimeZone.getTimeZone("Europe/Paris"));
		Date d = dfm.parse("2007-02-26 20:15:00");
		Pensionnaires p1 = new Lion("Léo", d,"M", 112, 112.2, 1.5);
		Pensionnaires p2 = new Tigre("Tiger", d,"M", 250, 150.5,1.7);
		Pensionnaires p3 = new Girafe("gigi", d,"F", 320, 320.5,1.3);
		a.add(p1);
		a.add(p2);
		a.add(p3);
		Adresse adresse = new Adresse("rue du Zoo", "75000", "Paris");
		Zoo z = new Zoo(a, "ZdP", "Zoo de Paris", adresse);
		z.endormir();
		ArrayList<Zoo> lz = new ArrayList<Zoo>();
		DAO dao = new DAO();
		dao.sauvegarder(z);
		System.out.println(p3.cout());
		System.out.println(z.chargesAnimaux());
		JFrame f = new JFrame();
		f.pack();
		JPanel panel = new JPanel();
		JLabel label = new JLabel();
		label.setText(z.chargesAnimaux());
		panel.add(label);
		f.add(panel);
		f.setVisible(true);
		
	}

}
