package strategyPattern.shoppingCart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	List<Item> items;
	
	ShoppingCart() {
		this.items = new ArrayList<Item>();
	}
	public void addItem(Item item) {
		this.items.add(item);
	}

	public void removeItem(Item item) {
		this.items.remove(item);
	}

	public double calculateCost() {
		double totalCost = 0;
		for(Item i : items) {
			totalCost +=i.getCost();
		}
		return totalCost; 
	}
	
	public void pay(PaymentStrategy paymentMethod) {
		double amount = calculateCost();
		paymentMethod.pay(amount);
	}
	
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		Item item1 = new Item("adee123",899);
		cart.addItem(item1);
		cart.addItem(new Item("qwerty",765));
		cart.addItem(new Item("paytm123",895));
		cart.pay(new CreditCardPayment("Adeel Ahmad", "62201812735", "713", "12/15"));
		cart.removeItem(item1);
		cart.pay(new PaypalPayment("adzeeadeel@gmail.com","123456789"));
	}
}
