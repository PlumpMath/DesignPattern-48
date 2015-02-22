package designPattern.decorator;

public class Soy extends CodimentDecorator{
	Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription()
	{
		return beverage.getDescription() +", Soy";
	}
	
	public double cost() {
		return .20 + beverage.cost();
	}
}
