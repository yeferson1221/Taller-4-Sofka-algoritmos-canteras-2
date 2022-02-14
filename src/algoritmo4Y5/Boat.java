package algoritmo4Y5;

import java.util.Scanner;

public class Boat extends Vehicle{
    private String propellerType;
    Scanner in = new Scanner(System.in);
    public void enterBoat(){
        System.out.println("Ingresar tipo de helice: ");
        propellerType=in.nextLine();

    }

    public void showBoat(){
        System.out.println("la helice e: "+propellerType);

    }


    public String getPropellerType() {
        return propellerType;
    }

    public void setPropellerType(String propellerType) {
        this.propellerType = propellerType;
    }
}
