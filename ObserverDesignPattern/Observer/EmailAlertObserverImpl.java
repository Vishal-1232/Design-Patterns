package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

    final StocksObservable observable;
    final String emailId;

    public EmailAlertObserverImpl(String emailId, StocksObservable observable){
        this.observable = observable;
        this.emailId = emailId;
    }

    private void sendMail(String msg){
        System.out.println("Mail sent to: "+emailId);
    }



    @Override
    public void update() {
        sendMail("Product is in Stock hurry up!!!");
    }

}
