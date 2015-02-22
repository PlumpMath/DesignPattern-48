package strategyPattern.shoppingCart;

public class PaypalPayment implements PaymentStrategy {
	private String emailID;
	private String password;
	PaypalPayment(String emailID, String password) {
		this.emailID = emailID;
		this.password = password;
	}
	public void pay(double amount) {
		System.out.println("Payment of $"+amount+" done by paypal account.");
	}
	
}
