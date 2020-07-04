package ObserverPatternTask2;

import java.util.Observable;
import java.util.Observer;

public class Patient implements Observer {

    private int ticketNumber;

    //setter
    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    //constructor
    public Patient() {

    }

    //getters
    public int getTicketNumber(){
        return this.ticketNumber;
    }

    public void update(Observable mySubject, Object doctor){
        System.out.println("Thanks, here is my card number "+ getTicketNumber() +
                ". I am ready to see the doctor.");
    }

}
