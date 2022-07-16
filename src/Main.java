import model.Doctor;
import model.Patient;
import model.User;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("Anahí Salgado", "anahi@anahi.com");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");
        User user = new Doctor("Anahí Salgado", "anahi@anahi.com");
        user.showDataUser();
        User userPa = new Patient("Anahí lopez", "ana@ana.com");
        userPa.showDataUser();
        //System.out.println(myDoctor);
        /*

        for (model.Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }
        */

 /*
        System.out.println();
        System.out.println();
        Patient patient = new Patient("Alejandra", "alejandra@mail.com");
        System.out.println("patient: "+patient);
        System.out.println("doctor: "+ myDoctor);
   */
    }



}