package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

    final String userName;
    final StocksObservable observable;

    public MobileAlertObserverImpl(String userName, StocksObservable observable){
        this.userName = userName;
        this.observable = observable;
    }

    private void sendMsgOnMobile(String msg){
        System.out.println("Message sent to: "+userName);
    }

    @Override
    public void update() {
        sendMsgOnMobile("Product is in stock hurry up !!!");
        
    }
}
