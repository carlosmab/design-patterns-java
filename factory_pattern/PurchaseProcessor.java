package factory_pattern;

import java.util.ArrayList;
import java.util.List;

import observer_pattern.Purchase;
import observer_pattern.PurchaseObserver;

public class PurchaseProcessor {
  private List<PurchaseObserver> observers = new ArrayList<PurchaseObserver>();

  public void subscribe(PurchaseObserver observer) {
    observers.add(observer);
  }

  public void unsubscribe(PurchaseObserver observer) {
    observers.remove(observer);
  }

  public void generatePurchase(Purchase purchase) {
    System.out.println("Generating purchase for " + purchase);
    notifyPurchase(purchase);
  }
  
  public void notifyPurchase(Purchase purchase) {
    for (PurchaseObserver observer : observers) {
      observer.update(purchase);
    }
  }
  
}
