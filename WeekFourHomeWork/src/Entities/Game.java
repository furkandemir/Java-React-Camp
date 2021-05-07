package Entities;

public class Game {
	
	private int id;
	private String name;
	private int unitPrice;
	
	public Game(int id, String name, int unitPrice) {
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
	}

	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	
	

}
