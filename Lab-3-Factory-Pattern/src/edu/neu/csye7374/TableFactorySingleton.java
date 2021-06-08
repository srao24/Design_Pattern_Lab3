package edu.neu.csye7374;

public class TableFactorySingleton {

	
	private static AbstractItemFactory tableInstance;
	
	private TableFactorySingleton() {
		tableInstance = null;
	}
	
	public static AbstractItemFactory getObject() {
		if(tableInstance == null) {
			tableInstance = new TableFactory();
		}
		return tableInstance;
	}
}
