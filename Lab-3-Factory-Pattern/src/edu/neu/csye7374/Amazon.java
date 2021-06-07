package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Amazon extends AbstractStore {
	
	
	List<AbstractItemAPI> itemList = new ArrayList<AbstractItemAPI>();

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setId(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDescription(String description) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addItem(AbstractItemAPI item) {
		// TODO Auto-generated method stub
		itemList.add(item);
		
	}

	@Override
	public void sellItem(AbstractItemAPI item) {
		// TODO Auto-generated method stub
		itemList.remove(item);
		
	}

	@Override
	public void sortInventory(Comparator<AbstractItemAPI> c) {
		// TODO Auto-generated method stub
		
	}
	


	

	
	
	/**
	 * demonstrate the use of this class
	 */
	public static void demo () {
		System.out.println(Amazon.class.getName() + " demo()...");
		//Get a store instance
		AbstractStore abStore = AmazonFactorySingleton.getObject();
			
		
		//Get the bread instance
		AbstractItemFactory bf = BreadFactorySingleton.getObject(); //return breadfactory singleton
		AbstractItemAPI bread1 =  bf.getObject(); //return bread object
		AbstractItemAPI bread2 =  bf.getObject();
		
		
		bread1.setId(3);
		bread1.setName("Bread 1");
		bread1.setPrice(2.99);
		bread1.setDescription("Sara Lee Bread");
		
		bread2.setId(2);
		bread2.setName("Bread 2");
		bread2.setPrice(4.99);
		bread2.setDescription("Nature's Bread");
		
		//add the bread to store
		abStore.addItem(bread1);
		abStore.addItem(bread2);
		
		
		//print the store items
		abStore.showInnventory();
		
		
		//sell item
		abStore.sellItem(bread2);
		
		
		//print the store items
	abStore.showInnventory();
	
		
		System.out.println(Amazon.class.getName() + " demo() done...");
		
	}

	@Override
	public void showInnventory() {
		// TODO Auto-generated method stub
		System.out.println(itemList.size() + " items in list.");
		for (AbstractItemAPI item : itemList) {
			System.out.println(item.getName()+" has been added to the store");
			System.out.printf("\n");
		}
		
	}

}
