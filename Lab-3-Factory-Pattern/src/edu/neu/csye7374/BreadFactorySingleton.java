package edu.neu.csye7374;

public class BreadFactorySingleton {

	
	private static AbstractItemFactory breadInstance;
	
	private BreadFactorySingleton() {
		breadInstance = null;
	}
	
	public static AbstractItemFactory getObject() {
		if(breadInstance == null) {
			breadInstance = new BreadFactory();
		}
		return breadInstance;
	}
}
