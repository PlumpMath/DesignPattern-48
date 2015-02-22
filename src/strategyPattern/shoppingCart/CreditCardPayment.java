package strategyPattern.shoppingCart;

public class CreditCardPayment implements PaymentStrategy {
	private String name;
	private String cardNumber;
	private String cvv;
	private String dateOfExpiry;
	
	CreditCardPayment(String name, String cardNumber, String cvv, String dateOfExpiry) {
		this.name = name;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.dateOfExpiry = dateOfExpiry;
	}
	
	public void pay(double amount) {
		System.out.println("Payment of $"+amount+" done by Credit card.");
	}
}
