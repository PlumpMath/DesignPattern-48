package designPattern.decorator;

public class StarBuzzCoffee {

	public static void main(String[] args) {
			Beverage beverage = new Espresso();
			System.out.println("Description :"+beverage.getDescription()+" cost $"+beverage.cost());
			
			Beverage beverage1 = new Milk(beverage);
			System.out.println("Description :"+beverage1.getDescription()+" cost $"+beverage1.cost());
			
			Beverage beverage2 = new Mocha(beverage1);
			System.out.println("Description :"+beverage2.getDescription()+" cost $"+beverage2.cost());
	}

}
