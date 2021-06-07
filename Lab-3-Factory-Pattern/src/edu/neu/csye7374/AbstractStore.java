package edu.neu.csye7374;

import java.util.Comparator;

/**
 * API for a Store which sells consumer items must
 * Each Store must implement this API
 * @author patil
 *
 */
public abstract class AbstractStore {
	/**
	 * get the Store ID
	 * @return
	 */
	public abstract int getId();
	
	/**
	 * Set the Store ID
	 * @return
	 */
	public abstract void setId(int id);
	
	/**
	 * get the Item Name
	 * @return
	 */
	public abstract String getName();
	
	/**
	 * Set the Item Name
	 * @return
	 */
	public abstract void setName(String name);
	
	/**
	 * get the Item Description
	 * @return
	 */
	public abstract String getDescription();
	
	/**
	 * Set the Item Description
	 * @return
	 */
	public abstract void setDescription(String description);
	
	/**
	 * add a consumer item to the store Inventory
	 * @param item
	 */
	public abstract void addItem(AbstractItemAPI item);
	
	/**
	 * Remove a consumer item from store inventory
	 * @param item
	 */
	public abstract void sellItem(AbstractItemAPI item);
	
	/**
	 * Sort entire Store inventory
	 * @param c 	Comparator specifying sort criteria
	 */
	public abstract void sortInventory(Comparator<AbstractItemAPI> c);
	
	public abstract void showInnventory(); 
	
	
}
