package ui;

import model.Doctor;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UIPatientMenu {
    public static void showPatientMenu(){
        int response = 0;
        do{
            System.out.println("\n\n");
            System.out.println("------------------------------------------");
            System.out.println("welcome: "+ UIMenu.patientLogged.getName());
            System.out.println("------------------------------------------");
            System.out.println("1. book Available Appointment");
            System.out.println("2. My  Appointment");
            System.out.println("0. logout");
            System.out.println("------------------------------------------");
            Scanner sc= new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
            switch(response){
                 case 1:
                     showBookAppointmentMenu();
                     break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;

            }
        }while(response!=0);

    }
    private static void showBookAppointmentMenu(){

        int response =0;
        do {
            System.out.println("------------------------------------------");
            System.out.println(":: Book an  appointment::");
            System.out.println("------------------------------------------");
            System.out.println(":: Select a date::");
            //numeracion  de listas de
            //indice de la fecha que seleccione  el usuario
            //[Doctors]
            //1.doctor1
                //1-fecha1
                //2-fecha2
                //3-fecha3
            //2.doctor2
            //3.doctor3
            Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();
            int k=0;
            for (int i = 0; i <UIDoctorMenu.doctorsAvailableAppointments.size() ; i++) {
                ArrayList<Doctor.AvailableAppointment>availableAppointments= UIDoctorMenu.doctorsAvailableAppointments.get(i).getAvailableAppointments();
                Map<Integer,Doctor> doctorAppointments = new TreeMap<>();
                //recorremos las fechas de los doctores  que  tienen  citas  diponibles.
                for (int j = 0; j < availableAppointments.size(); j++) {
                    k++;
                    System.out.println(k +" . "+availableAppointments.get(j).getDate());
                    doctorAppointments.put(Integer.valueOf(j),UIDoctorMenu.doctorsAvailableAppointments.get(i));
                    doctors.put(Integer.valueOf(k),doctorAppointments);
                }
            }
            Scanner sc= new Scanner(System.in);
            int responseDateSelected = Integer.valueOf(sc.nextLine());
            Map<Integer,Doctor>doctorAvailableSelected =doctors.get(responseDateSelected);
            Integer indexDate =0;
            Doctor doctorSelected = new Doctor("","");
            for (Map.Entry<Integer,Doctor> doc :doctorAvailableSelected.entrySet()) {
                indexDate=doc.getKey();
                doctorSelected=doc.getValue();
            }
            System.out.println(doctorSelected.getName()+". date: " + doctorSelected.getAvailableAppointments().get(indexDate).getDate() + ". Time: " + doctorSelected.getAvailableAppointments().get(indexDate).getTime() );
            System.out.println("Confirm yout  Appointment: \n1. yes. \n2. no.  ");
            response = Integer.valueOf(sc.nextLine());
            if (response==1){
                UIMenu.patientLogged.addAppointmentDoctors(doctorSelected,doctorSelected.getAvailableAppointments().get(indexDate).getDate(null),doctorSelected.getAvailableAppointments().get(indexDate).getTime());
                showPatientMenu();
            }
        }while (response!=0);
    }
    private static void showPatientMyAppointments(){
        int response =0;
        do{
            if (UIMenu.patientLogged.getAppointmentDoctors().size()==0){
                System.out.println("Dont have Appointments");
                break;

            }
            for (int i = 0; i <UIMenu.patientLogged.getAppointmentDoctors().size() ; i++) {
                int j = i+1;
                System.out.println(j+" . "+" Date: "+ UIMenu.patientLogged.getAppointmentDoctors().get(i).getDate()+" Time: "+UIMenu.patientLogged.getAppointmentDoctors().get(i).getTime());
            }

        }while(response!=0);
    }
}

