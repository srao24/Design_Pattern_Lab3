package edu.neu.csye7374;

public class IphoneFactorySingleton {
	private static AbstractItemFactory iphoneInstance;
	
	private IphoneFactorySingleton() {
		iphoneInstance = null;
	}
	
	public static AbstractItemFactory getObject() {
		if(iphoneInstance == null) {
			iphoneInstance = new IphoneFactory();
		}
		return iphoneInstance;
	}
}
