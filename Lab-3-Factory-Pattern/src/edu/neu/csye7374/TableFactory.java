package edu.neu.csye7374;

public class TableFactory extends AbstractItemFactory {
	
	@Override
	public AbstractItemAPI getObject() {
		return new Table();
	}
}
