package factory_pattern;

public class PayPal implements PaymentMethod {
  @Override
  public void processPaymentRequest(double amount) {
    System.out.println("Processing PayPal payment of " + amount);
  }
}
