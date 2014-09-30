package dateoutils;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class CalculateurAge {
	
	public int calculer(Date datenais) {
		LocalDate aujourdhui = LocalDate.now();
		LocalDate naissance = datenais.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		Period periode = Period.between(naissance, aujourdhui);
		return periode.getYears();		
	}
	
	public static CalculateurAge getInstance() {
		if(instance == null)
			instance = new CalculateurAge();
		
		return instance;
	}
	
	private static CalculateurAge instance = null;

	private CalculateurAge() {
		super();
	}
	

}
