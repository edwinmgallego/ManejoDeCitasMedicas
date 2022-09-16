package model;

import java.util.ArrayList;
import java.util.Date;

public class Patient  extends User{
    //Atributos

    private String Birthday;
    private double height;
    private double weight;
    private String blood;

    private ArrayList<AppointmentDoctor> appointmentDoctors = new ArrayList<>();
    private ArrayList<AppointmentNurse> appointmentNurses = new ArrayList<>();

    public ArrayList<AppointmentDoctor> getAppointmentDoctors() {
        return appointmentDoctors;
    }

    public void addAppointmentDoctors(Doctor doctor, Date date, String time) {
        AppointmentDoctor appointmentDoctor = new AppointmentDoctor(this, doctor);
        appointmentDoctor.schedule(date,time);
        appointmentDoctors.add(appointmentDoctor);
    }

    public ArrayList<AppointmentNurse> getAppointmentNurses() {
        return appointmentNurses;
    }

    public void setAppointmentNurses(ArrayList<AppointmentNurse> appointmentNurses) {
        this.appointmentNurses = appointmentNurses;
    }





    public Patient(String name, String email){

        super(name,email);
        System.out.println("El nombre del model.Doctor asignado es: " + name);

    }

    //quiero tener  acceso  a la   variable  pero  solo  por  el metodo6
    public  void setWeight(double weight){
        this.weight=weight;
    }

    public String getBirthday() {
        return Birthday;
    }

    public void setBirthday(String birthday) {
        Birthday = birthday;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    @Override
    public String toString() {
        return "model.Patient{" +
                "Birthday='" + Birthday + '\'' +
                ", height=" + getHeight() +
                ", weight=" + getWeight() +
                ", blood='" + blood + '\'' +
                '}';
    }

    @Override
    public void showDataUser() {
        System.out.println("paciente del hospital: Cruz Verde");
        System.out.println("Departamentos: Oncología");
    }
}
