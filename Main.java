import factory_pattern.PaymentMethod;
import factory_pattern.PaymentMethodFactory;

class Main {
  public static void main(String[] args) {
    String paymentMethod = "paypal";
    double amount = 100000;

    PaymentMethodFactory factory = new PaymentMethodFactory();
    PaymentMethod payment = factory.getPaymentMethod(paymentMethod);
    payment.processPaymentRequest(amount);
  }
}