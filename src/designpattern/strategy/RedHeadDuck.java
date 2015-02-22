package designpattern.strategy;

public class RedHeadDuck extends Duck {
 
	public RedHeadDuck() {
		flyBehaviour = new FlyWithWings();
		quackBehaviour = new Quack();
	}
 
	public void display() {
		System.out.println("I'm a real Red Headed duck");
	}
}
