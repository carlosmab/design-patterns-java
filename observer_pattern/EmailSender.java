package observer_pattern;

public class EmailSender implements PurchaseObserver {
  @Override
  public void update(Purchase purchase) {
    System.out.println("Sending email for " + purchase);
  }
   
}
