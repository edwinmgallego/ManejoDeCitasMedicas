public class Patient {
    //Atributos
    static int id = 0; //Autoincrement
    String name;
    String speciality;
    String email;
    String address;
    String PhoneNumber;
    String Birthday;
    double height;
    double wight;
    String blood;





    Patient(){
        System.out.println("Construyendo el Objeto Patient");

    }

    Patient(String name, String email){
        System.out.println("El nombre del Doctor asignado es: " + name);
        id++;
        this.name = name;
        this.email = email;
    }

    //Comportamientos
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID Patient: " + id);
    }

}
