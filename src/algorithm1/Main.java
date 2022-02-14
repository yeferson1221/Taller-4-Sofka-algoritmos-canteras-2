package algorithm1;

public class Main {
    public static void main(String[] args){

        System.out.println("Ingresar Planeta 1: ");
        Planet planet1 = new Planet();
        planet1.getSystemSolar();
        System.out.println("................................................");
        System.out.println("Ingresar Planeta 2: ");
        Planet planet2 = new Planet();
        planet2.getSystemSolar();

        Calculation calculation = new Calculation();
        Double distBetweenPlanets = calculation.calculateDistBetweenPlanets(planet1,planet2);
        System.out.println("");
        Double gravitationalForce = calculation.calculateDistBetweenPlanets(planet1,planet2);
        System.out.println("la distancia entre el planeta "+planet1.getName()+" y el planeta "+planet2.getName()+" es: " + distBetweenPlanets+"m");
        System.out.println("la Fuerza gravitacional entre el planeta "+planet1.getName()+" y el planeta "+planet2.getName()+" es: " + gravitationalForce+" Nm^2/kg^2");




    }
}
