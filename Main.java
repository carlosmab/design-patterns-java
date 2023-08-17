import factory_pattern.PaymentMethod;
import factory_pattern.PaymentMethodFactory;
import observer_pattern.EmailSender;
import observer_pattern.InventoryUpdater;
import observer_pattern.InvoiceGenerator;
import observer_pattern.Purchase;
import observer_pattern.PurchaseProcessor;

class Main {
  public static void main(String[] args) {
    String paymentMethod = "paypal";
    double amount = 100000;

    System.out.println("\n\n Factory Pattern:");
    PaymentMethodFactory factory = new PaymentMethodFactory();
    PaymentMethod payment = factory.getPaymentMethod(paymentMethod);
    payment.processPaymentRequest(amount);

    System.out.println("\n\n Observer Pattern:");
    Purchase purchase = new Purchase("Product", amount, payment);
    PurchaseProcessor purchaseProcessor = new PurchaseProcessor();
    
    purchaseProcessor.subscribe(new EmailSender());
    purchaseProcessor.subscribe(new InventoryUpdater());
    purchaseProcessor.subscribe(new InvoiceGenerator());

    purchaseProcessor.generatePurchase(purchase);
  }
}