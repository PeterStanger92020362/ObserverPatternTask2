package ObserverPatternTask2;

public class ObserverPatternTask2 {

    public static void main(String[] args) {

        Doctor doctor1 = new Doctor();
        int startingTicketNum = doctor1.getServingPatient();

        //create 15 patients
        Patient waitingRoom[] = {
                new Patient(),
                new Patient(),
                new Patient(),
                new Patient(),
                new Patient(),
                new Patient(),
                new Patient(),
                new Patient(),
                new Patient(),
                new Patient(),
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

        //create the priority case
        PriorityCase priorityCase = new PriorityCase();
        doctor1.registerObserver(priorityCase);

        doctor1.callPatient();

        doctor1.removeObserver(priorityCase); //remove the priority case once it has been dealt with

        //see all 15 patients.
        for (int i = 0; i < 15; i++) {
            doctor1.callPatient();
        }

    }

}
