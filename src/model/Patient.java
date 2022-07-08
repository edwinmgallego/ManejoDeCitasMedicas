package model;

public class Patient  extends User{
    //Atributos

    private String Birthday;
    private double height;
    private double weight;
    private String blood;






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
}
