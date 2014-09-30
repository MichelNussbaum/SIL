package dao;

import java.util.ArrayList;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;

import java.util.List;

import model.Zoo;

public class DAO {
	
	private List<Zoo> zoos = new ArrayList<Zoo>();
	
	public DAO(){}
	
	public void sauvegarder(Zoo z){
		ObjectContainer connexion = Db4oEmbedded.openFile("base");
		connexion.store(z);
		connexion.commit();
		connexion.close();
	}
	
	public List<Zoo> restaurer(String na){
		ObjectContainer connexion = Db4oEmbedded.openFile("base");
		Zoo z = new Zoo();
		z.setNomAbrege(na);
		List<Zoo> liste = connexion.queryByExample(z);
		connexion.close();
		return liste;
	}
}
