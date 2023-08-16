package observer_pattern;

public class InventoryUpdater implements PurchaseObserver {
  @Override
  public void update(Purchase purchase) {
    System.out.println("Updating inventory for " + purchase);
  }
}
