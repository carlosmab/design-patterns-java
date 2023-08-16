package observer_pattern;


// Concrete Observer
public class InvoiceGenerator implements PurchaseObserver {
  @Override
  public void update(Purchase purchase) {
    System.out.println("Generating invoice for " + purchase);
  }
}
