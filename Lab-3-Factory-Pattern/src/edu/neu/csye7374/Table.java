package edu.neu.csye7374;

public class Table extends AbstractItemAPI {

	
	private int id;
	private double price;
	private String name;
	private String description;
	
	/**
	 * Initialization BLock
	 * Executed by each constructor
	 */
	{
		this.id = 5;
		this.price = 299.00;
		this.name = "Table";
		this.description = "4 legged Table";
	}
	
	
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	@Override
	public void setId(int id) {
		// TODO Auto-generated method stub
		this.id = id;
		
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

	@Override
	public void setPrice(double price) {
		// TODO Auto-generated method stub
		this.price = price;
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
		
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.description;
	}

	@Override
	public void setDescription(String description) {
		// TODO Auto-generated method stub
		this.description = description;
		
	}

}
