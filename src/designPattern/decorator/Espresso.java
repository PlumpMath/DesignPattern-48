package designPattern.decorator;

public class Espresso extends Beverage {

	public Espresso() {
		description = "Espresso Coffee";
	}
	
	public double cost() {
		return 2.0;
	}
}
