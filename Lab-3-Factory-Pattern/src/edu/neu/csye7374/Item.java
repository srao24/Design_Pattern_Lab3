package edu.neu.csye7374;

/**
 * Concrete class implementing AbstractItemAPI
 * Use to as a basis to deriveother Item classes
 * 		bread
 * 		iphone
 * 		travel trip
 * @author patil
 *
 */
public class Item extends AbstractItemAPI {

	private int id;
	private double price;
	private String name;
	private String description;
	
	/**
	 * Initialization BLock
	 * Executed by each constructor
	 */
	{
		this.id = 1;
		this.price = 0.99;
		this.name = "item";
		this.description = "Consumer Item";
	}
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void setId(int id) {
		this.id = id;
		
	}
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	@Override
	public void setPrice(double price) {
		this.price = price;
		
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	@Override
	public void setName(String name) {
		this.name = name;
		
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}
	@Override
	public void setDescription(String description) {
		this.description = description;
		
	}
	
	/**
	 * return a STring represtation of the object State
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("# ").append(this.id);
		
		return super.toString();
	}
	
	/**
	 * demonstrate the use of this class
	 */
	public static void demo () {
		System.out.println(Item.class.getName() + " demo()...");
		
		System.out.println(new Item());
		
		System.out.println(Item.class.getName() + " demo() done...");
		
	}
	

}
