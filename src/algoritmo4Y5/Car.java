package algoritmo4Y5;

import java.util.Scanner;

public class Car extends Vehicle{
    private int numberOfDoor;

    Scanner in = new Scanner(System.in);

    public void enterCar(){
        System.out.println("Ingresar numero de puertas:");
        numberOfDoor=in.nextInt();
    }

    public void showCar(){
        System.out.println("Numero de puertas: "+numberOfDoor);
    }

    public int getNumberOfDoor() {
        return numberOfDoor;
    }

    public void setNumberOfDoor(int numberOfDoor) {
        this.numberOfDoor = numberOfDoor;
    }
}
