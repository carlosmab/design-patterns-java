package strategy_pattern;

public class CreditCard implements PaymentMethod {
  @Override
  public void processPaymentRequest(double amount) {
    System.out.println("Processing credit card payment of " + amount);
  }
}

