package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.Collections;
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
		Collections.sort(this.itemList, c);
		System.out.println("~~~~~~~~~~~~~~~~SORTED INVENTORY~~~~~~~~~~~~~~~~");
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
		
		AbstractItemFactory tablefactory = TableFactorySingleton.getObject();
		AbstractItemAPI table1 =  tablefactory.getObject();
		
		
		bread1.setId(3);
		bread1.setName("Bread 1");
		bread1.setPrice(2.99);
		bread1.setDescription("Sara Lee Bread");
		
		bread2.setId(2);
		bread2.setName("Bread 2");
		bread2.setPrice(4.99);
		bread2.setDescription("Nature's Bread");
		
		table1.setId(4);
		table1.setName("Coffee Table");
		table1.setPrice(49.99);
		table1.setDescription("Small table for 2 people");
		
		
		//add the bread to store
		abStore.addItem(table1);
		System.out.println("1 TABLE ADDED");
		abStore.addItem(bread1);
		System.out.println("1 BREAD ADDED");
		abStore.addItem(bread2);
		System.out.println("1 BREAD ADDED");
		
		
		//print the store items
		abStore.showInnventory();
		
		
		//sell item
		abStore.sellItem(bread2);
		System.out.println("1 BREAD SOLD");
		
		abStore.sortInventory(new SortbyName());
		//print the store items
		abStore.showInnventory();
		
	
		//Get the iPhone instance
		AbstractItemFactory iphoneFac = IphoneFactorySingleton.getObject();
		AbstractItemAPI iphone1 =  iphoneFac.getObject();
		AbstractItemAPI iphone2 =  iphoneFac.getObject();
		
		AbstractItemAPI table2 =  tablefactory.getObject();
		
		
		iphone1.setId(1);
		iphone1.setName("iphone 12 pro");
		iphone1.setPrice(1002.99);
		iphone1.setDescription("Latest iphone");
		
		iphone2.setId(2);
		iphone2.setName("iphone 11 pro");
		iphone2.setPrice(899.99);
		iphone2.setDescription("Previous iphone");
		
		table2.setId(5);
		table2.setName("Dining Table");
		table2.setPrice(449.99);
		table2.setDescription("Large table for 8 people");
		
		//add the iphone to store
		abStore.addItem(iphone1);
		System.out.println("1 PHONE ADDED");
		abStore.addItem(iphone2);
		System.out.println("1 PHONE ADDED");
		abStore.addItem(table2);
		System.out.println("1 TABLE ADDED");
		
		//print the store items
		abStore.sortInventory(new SortbyID());
		abStore.showInnventory();
		
		//sell item
		abStore.sellItem(iphone2);
		System.out.println("***1 PHONE SOLD***");
		abStore.sellItem(table1);
		System.out.println("***1 TABLE SOLD***");
		
		//print the store items
		abStore.showInnventory();
	
		
		System.out.println(Amazon.class.getName() + " demo() done...");
		
	}

	@Override
	public void showInnventory() {
		// TODO Auto-generated method stub
		System.out.println("----------------INVENTORY LIST-----------------");
		System.out.println(itemList.size() + " items in list.");
		for (AbstractItemAPI item : itemList) {
			System.out.println("Item ID: " + item.getId() + " - " + item.getName() + " with Price: $" + item.getPrice() + " and Description: " + item.getDescription());
			System.out.printf("\n");
		}
		System.out.println("----------------END OF INVENTORY---------------");
		
	}

}
