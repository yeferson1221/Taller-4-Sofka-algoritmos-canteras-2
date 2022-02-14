package algoritmo4Y5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Vehicle {

    private int numberPassengers;
    private boolean passengerPresence;
    private int numberWheels;
    private Date enrollmentDate;
    private String track;

Scanner in = new Scanner(System.in);

  public void enterVehicle(){

      System.out.println("ingresar numero de pasajeros: ");
      numberPassengers=in.nextInt();

      System.out.println("Tiene o no pasajeros 1)SI 2)NO: ");
      int passengerPresenceOption =in.nextInt();
      if(passengerPresenceOption==1){
          passengerPresence=true;
      }else if(passengerPresenceOption==2){
          passengerPresence=false;
      }
      System.out.println("ingresar numero de llantas: ");
      numberWheels=in.nextInt();

      System.out.println("ingresar numero de pasajeros: ");
      track=in.nextLine();

      System.out.println("ingresar pista o medio por el que se desplaza: ");
      track=in.nextLine();

      enrollmentDate = parseDateBirthPersons();

  }

    public static Date parseDateBirthPersons(){
        Scanner in = new Scanner(System.in);
        System.out.println("ingresar fecha (dd/MM/yyyy) ");
        String enrollmentDate = in.nextLine();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date finalDate = null;
        try {
            finalDate = formato.parse(enrollmentDate);
        }
        catch (ParseException ex)
        {
            System.out.println(ex);
        }
        return finalDate;
    }

    public void showVehicle(){
        System.out.println("el numero pasajeros : "+passengerPresence);
        System.out.println("hay pasajeros : "+passengerPresence);
        System.out.println("el vehicle creado es: "+numberWheels);
        System.out.println("el vehicle creado es: "+enrollmentDate);
        System.out.println("El terreno es: "+track);

    }


    public int getNumberPassengers() {
        return numberPassengers;
    }

    public void setNumberPassengers(int numberPassengers) {
        this.numberPassengers = numberPassengers;
    }

    public boolean getPassengerPresence() {
        return passengerPresence;
    }

    public void setPassengerPresence(boolean passengerPresence) {
        this.passengerPresence = passengerPresence;
    }

    public int getNumberWheels() {
        return numberWheels;
    }

    public void setNumberWheels(int numberWheels) {
        this.numberWheels = numberWheels;
    }

    public Date getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(Date enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public boolean isPassengerPresence() {
        return passengerPresence;
    }

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }
}
