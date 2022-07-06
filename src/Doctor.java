import java.util.ArrayList;
import java.util.Date;

public class Doctor  extends  User{
    //Atributos
    Doctor(String name, String email){
        super(name, email);
        System.out.println("El nombre del Doctor asignado es: " + name);

        this.speciality = speciality;
    }

    private String speciality;


    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }



    //Comportamientos

    //arreglo de coleccion de  objetos   donde  se colocan   las  disponibilidad del doctor.
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    //metodo que recibe  los datos!
    //metodo  donde se agrega  las  citas  diponibles
    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date,time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }



    //aqca  se  encuentra  la  clase  anidada.
    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }

}