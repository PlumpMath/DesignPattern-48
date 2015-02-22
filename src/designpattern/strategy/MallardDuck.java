package designpattern.strategy;

public class MallardDuck extends Duck {

	MallardDuck() {
		setFlyBehaviour(new FlyWithWings());
		setQuackBehaviour(new Quack());
	}
	
	void display() {
		System.out.println("I'm real Mallard Duck!!");
	}

}
