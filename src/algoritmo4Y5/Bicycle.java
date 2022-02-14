package algoritmo4Y5;

import java.util.Scanner;

public class Bicycle {
   private String pedalType;
   Scanner in = new Scanner(System.in);
   public void enterBicycle(){
      System.out.println("Ingrese tipo de pedal ");
      pedalType=in.nextLine();

   }

   public void showCarBicycle(){
      System.out.println("El tipo de penal: "+pedalType);

   }


   public String getPedalType() {
      return pedalType;
   }

   public void setPedalType(String pedalType) {
      this.pedalType = pedalType;
   }
}
