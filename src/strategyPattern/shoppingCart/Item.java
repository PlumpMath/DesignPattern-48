package strategyPattern.shoppingCart;

public class Item {
	private String upcCode;
	private double cost;
	
	public Item(String upcCode, double cost){
		this.upcCode = upcCode;
		this.cost = cost;
	}
	
	public String getUpcCode() {
		return this.upcCode;
	}
	
	public double getCost() {
		return this.cost;
	}
}
