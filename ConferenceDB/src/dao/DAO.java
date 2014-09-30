package dao;

import java.util.ArrayList;
import java.util.List;

import com.db4o.Db4o;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;

import modele.Conference;

public class DAO {
	
	private List<Conference> conferences = new ArrayList<Conference>();
	
	public DAO(){}
	
	public void sauvegarder(List<Conference> conferences){
		ObjectContainer connexion = Db4oEmbedded.openFile("base");
		for (Conference conference : conferences) {
			connexion.store(conference);
		}
		connexion.commit();
		connexion.close();
	}
	
	public List<Conference> restaurer(){
		ObjectContainer connexion = Db4oEmbedded.openFile("base");
		List<Conference> liste = connexion.queryByExample(new Conference());
		List<Conference> res = new ArrayList<Conference>(liste);
		connexion.close();
		return res;
	}
}
