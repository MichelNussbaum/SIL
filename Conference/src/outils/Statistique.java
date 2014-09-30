package outils;

import java.util.ArrayList;
import java.util.List;

import modele.Conference;

public class Statistique {
	
	private Statistique(){}
	
	private static Statistique INSTANCE = null;
	
	public static Statistique getInstance(){
		if (INSTANCE == null){
			INSTANCE = new Statistique();
		}
		return INSTANCE;
	}
	
	
	
	public List<Conference> succes(List<Conference> arg){
		List<Conference> res = new ArrayList<Conference>();
		for (int i = 0; i< arg.size();i++) {
			if (arg.get(i).getProfesseurs().size()>2) {
				res.add(arg.get(i));
			}	
		}
		return res;
	}
}
