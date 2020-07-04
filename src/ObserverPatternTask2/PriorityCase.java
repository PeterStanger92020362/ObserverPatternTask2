package ObserverPatternTask2;

import java.util.Observable;
import java.util.Observer;
public class PriorityCase implements Observer{

    // mandatory method because implements Observer
    public void update(Observable mySubject, Object calledNumber) {
        System.out.println("Hi, i am a priority case. I will see the doctor first.");

        // now decrement the Subject's number counter, so the waiting patient gets called next
        Doctor subjectTicketSys = (Doctor) mySubject;
        subjectTicketSys.decrementTicketNumber();
    }

}