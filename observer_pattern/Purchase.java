package observer_pattern;

import strategy_pattern.PaymentMethod;

public class Purchase {
  private String product;
  private double amount;
  private PaymentMethod paymentMethod;
  
  public Purchase(String product, double amount, PaymentMethod paymentMethod) {
    this.product = product;
    this.amount = amount;
    this.paymentMethod = paymentMethod;
  }

  public String getProduct() {
    return product;
  }

  public void setProduct(String product) {
    this.product = product;
  }

  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public PaymentMethod getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }
  
  @Override
  public String toString() {
      return "Purchase [product=" + product + ", amount=" + amount + "]";
  }
  
}
