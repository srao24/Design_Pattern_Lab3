package edu.neu.csye7374;

/**
 * API for a consumer Item
 * each Itme derives class must implement this API
 * @author patil
 *
 */
public abstract class AbstractItemAPI {
	/**
	 * get the Item ID
	 * @return
	 */
	public abstract int getId();
	
	/**
	 * Set the Item ID
	 * @return
	 */
	public abstract void setId(int id);
	
	/**
	 * get the Item Price
	 * @return
	 */
	public abstract double getPrice();
	
	/**
	 * Set the Item Price
	 * @return
	 */
	public abstract void setPrice(double price);
	
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
}
