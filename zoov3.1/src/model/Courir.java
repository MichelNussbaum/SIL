package model;

public class Courir implements Comportement {

	@Override
	public void seMouvoir(String maniere) {
		System.out.println("je cours "+maniere);
	}

}
