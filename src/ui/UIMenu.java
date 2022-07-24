package ui;

import model.Doctor;
import model.Patient;

import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {

    public static String[] MONTHS = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    public static  Doctor doctorlogged;
    public static  Patient patientLogged;
    public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. model.Doctor");
            System.out.println("2. model.Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("Doctor");
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                    System.out.println("Doctor");
                    authUser(2);



                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }

    private static void authUser(int userType){
        //user type 1 doctor
        //user Type 2 paciente
        ArrayList<Doctor>  doctors = new ArrayList<>();
        doctors.add(new Doctor("diana carolina panesso","dpanesso@mail.com"));
        doctors.add(new Doctor("carolina arango","carango@mail.com"));
        doctors.add(new Doctor("juliana maria caicedo","jmcaicedo@mail.com"));
        doctors.add(new Doctor("paula valencia","pvalencia@mail.com"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Edwin Mauricio Gallego","emgallego@mail.com"));
        patients.add(new Patient("alaiah  valentina gallego franco","avgfranco@mail.com"));
        patients.add(new Patient("dana cristina molano panesso","dcmolano@mail.com"));
        patients.add(new Patient("ana gabriela molano panesso","agmolanp@mail.com"));
        boolean emailCorrect = false;
        do{
            System.out.println("Insert your email : [a@a.com]");
            Scanner sc= new Scanner(System.in);
            String email = sc.nextLine();
            if(userType == 1){
                for (Doctor d: doctors){
                    if (d.getEmail().equals(email)){
                        emailCorrect= true;
                        doctorlogged = d;
                        //showdoctorMenu

                    }
                }


            }
            if(userType == 2){
                for (Patient p: patients){
                    if (p.getEmail().equals(email)){
                        emailCorrect= true;
                        patientLogged = p;
                        //showPatientMenu

                    }
                }


            }

        }while(!emailCorrect);
    }


    static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("model.Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 1; i < 4; i++) {
                        System.out.println(i +". " + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
    }
}
