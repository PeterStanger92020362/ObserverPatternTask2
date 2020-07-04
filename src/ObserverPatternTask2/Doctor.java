package ObserverPatternTask2;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Doctor extends Observable{

    private ArrayList<Observer> observers;
    private int servingPatient;
    private int prizeCounter = 0;

    //setter
    public void setServingPatient(int servingPatient) {
        this.servingPatient = servingPatient;
    }

    //getters
    public ArrayList<Observer> getObservers() {
        return observers;
    }

    public int getServingPatient() {
        return servingPatient;
    }

    //constructor
    public Doctor() {
        super();
        observers = new ArrayList<Observer>(){};
        this.servingPatient = 231; //starting patient ticket number
    }

    //process next patient
    public void callPatient(){
        int nextTicket = getServingPatient();
        System.out.println("Notifying all waiting patients. Calling patient number " + nextTicket + "?");

        notifyObservers(this,nextTicket);

        if(prizeCounter%10 ==0 && prizeCounter != 0){
            System.out.println("Congratulations on winning a free entry into our monthly raffle! Hope you feel better soon.");
        }

        incrementTicketNumber();

    }

    public void incrementTicketNumber(){
        prizeCounter++;
        setServingPatient(getServingPatient()+1);
    }

    public void decrementTicketNumber(){
        prizeCounter--;
        setServingPatient(getServingPatient()-1);
    }


    public void notifyObservers(Observable observable, int nextTicket){
        for (Observer ob : observers) {
            ob.update(observable, nextTicket);
        }
        setChanged();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
}
