package factory_pattern;

public class PaymentMethodFactory {
  
  public PaymentMethod getPaymentMethod(String type) {
    if (type.equals("paypal")) {
      return new PayPal();
    } else if (type.equals("creditCard")) {
      return new CreditCard();
    } else {
      throw new IllegalArgumentException("Invalid payment method type");
    }
  }
}
