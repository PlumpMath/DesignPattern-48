package designpattern.strategy;

public class DecoyDuck extends Duck {
	public DecoyDuck() {
		setFlyBehaviour(new FlyNoWings());
		setQuackBehaviour(new MuteQuack());
	}
	public void display() {
		System.out.println("I'm a duck Decoy");
	}
}
