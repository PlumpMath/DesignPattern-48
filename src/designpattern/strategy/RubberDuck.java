package designpattern.strategy;
public class RubberDuck extends Duck {
 
	public RubberDuck() {
		flyBehaviour = new FlyNoWings();
		quackBehaviour = new Squeak();
	}
 
	public void display() {
		System.out.println("I'm a rubber duckie");
	}
}
