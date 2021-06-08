package edu.neu.csye7374;

public class IphoneFactory extends AbstractItemFactory {
	
	@Override
	public AbstractItemAPI getObject() {
		return new Iphone();
	}

}
