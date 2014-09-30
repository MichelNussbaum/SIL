package test;

import java.util.List;

import modele.Conference;
import dao.DAO;

public class TestRestaure {

	public static void main(String[] args) {
		DAO dao = new DAO();
		List<Conference> conf= dao.restaurer();
		for (Conference conference : conf) {
			System.out.println(conference);
		}

	}

}
