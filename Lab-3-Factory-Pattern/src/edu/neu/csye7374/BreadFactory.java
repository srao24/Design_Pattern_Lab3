package edu.neu.csye7374;

public class BreadFactory extends AbstractItemFactory {
	
	@Override
	public AbstractItemAPI getObject() {
		return new Bread();
	}
}
