package edu.neu.csye7374;

public class AmazonFactorySingleton {
	
	private static AbstractStore storeInstance;
	
	private AmazonFactorySingleton() {
		storeInstance = null;
	}
	
	public static AbstractStore getObject() {
		if(storeInstance == null) {
			storeInstance = new Amazon();
		}
		return storeInstance;
	}
	

}
