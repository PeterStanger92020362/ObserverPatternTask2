package ObserverPatternTask2;

public class ObserverPatternTask2 {

    public static void main(String[] args) {

        Doctor doctor1 = new Doctor();
        int startingTicketNum = doctor1.getServingPatient();

        Patient waitingRoom[] = {
                new Patient(),
                new Patient(),
                new Patient(),
                new Patient(),
                new Patient()
        };

        for (int i = 0; i < waitingRoom.length; i++) {
            waitingRoom[i].setTicketNumber(startingTicketNum + i);
            doctor1.registerObserver(waitingRoom[i]);
        }

        doctor1.callPatient();

    }

}
