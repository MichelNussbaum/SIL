package model;


public class Voler implements Comportement {

	@Override
	public void seMouvoir(String maniere) {
		System.out.println("je vole "+maniere);
	}

}
