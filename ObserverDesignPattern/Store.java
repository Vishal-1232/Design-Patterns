package ObserverDesignPattern;

import ObserverDesignPattern.Observable.IphoneObservableImpl;
import ObserverDesignPattern.Observable.StocksObservable;
import ObserverDesignPattern.Observer.EmailAlertObserverImpl;
import ObserverDesignPattern.Observer.MobileAlertObserverImpl;
import ObserverDesignPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {

        StocksObservable iphonStocksObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("user1@gmail.com",iphonStocksObservable);
        NotificationAlertObserver observer2 = new MobileAlertObserverImpl("Aktr47", iphonStocksObservable);

        iphonStocksObservable.add(observer1);
        iphonStocksObservable.add(observer2);

        iphonStocksObservable.setStockCount(20);
        iphonStocksObservable.setStockCount(10);
        iphonStocksObservable.setStockCount(0);
        iphonStocksObservable.setStockCount(100);

    }
}
