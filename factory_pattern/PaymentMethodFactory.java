package factory_pattern;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import strategy_pattern.CreditCard;
import strategy_pattern.PayPal;
import strategy_pattern.PaymentMethod;

public class PaymentMethodFactory {
  
  private Map<String, Supplier<PaymentMethod>> paymentMethodMap = new HashMap<>();

  public PaymentMethodFactory() {
    paymentMethodMap.put("paypal", PayPal::new);
    paymentMethodMap.put("creditCard", CreditCard::new);
}
public PaymentMethod getPaymentMethod(String type) {
  Supplier<PaymentMethod> paymentMethodConstructor = paymentMethodMap.get(type);
  if (paymentMethodConstructor != null) {
      return paymentMethodConstructor.get();
  } else {
      throw new IllegalArgumentException("Invalid payment method type");
  }
}
}
