package algorithm1;

import java.util.Scanner;

public class Calculation {
    private Double angleBetweenPlanets;
    private Double G = 6.67E-11;

    public Calculation() {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresar angulo entre los dos planetas con respecto al sol recuerde que debe ser desde 0 hasta 360: ");
        this.angleBetweenPlanets = in.nextDouble();
    }
    /**
     * [metodo calculateDistBetweenPlanets nos calcular la distancia entre los dos planestas
     * utiliza la ley de cocenos, la siguiente formula: a = raiz(b^2 + c^2 - 2cb * cos(angulo))
     *
     * ej.: distancia=raiz((distancia al sol planeta 1)^2 + (distancia al sol planeta 2)^2 - 2*(distancia al sol planeta 1) * (distancia al sol planeta 2) * cos(angulo de los dos planetas con respecto al sol)   )
     *...;]
     * @param planet1
     * @param planet2
     * @return distBetweenPlanets
     *
     * @author [Yeferson Valencia, apellido y correo electrónico del autor.
     *
     * @since [1.0.0]
     *
     */
    public Double calculateDistBetweenPlanets(Planet planet1, Planet planet2) {
        Double distBetweenPlanets = Math.sqrt(Math.pow(planet1.getDistanceSun(),2)+Math.pow(planet2.getDistanceSun(),2)-2*(planet1.getDistanceSun()*planet2.getDistanceSun())*Math.cos(this.angleBetweenPlanets));
        return distBetweenPlanets;
    }

    /**
     * [Este metodo nos permite calcular la fuerza gravitacional entre los dos planetas planetas
     * con la formula  // F = G*(m1*m2)/d^2
     * @param planet1
     * @param planet2
     * @return distBetweenPlanets
     *
     * @author [Yeferson Valencia, apellido y correo electrónico del autor.
     *
     * @since [1.0.0]
     *
     */
    public Double calculateGravitationalForce(Planet planet1, Planet planet2, Double distBetweenPlanets){
        Double gravitationalForce = G*(planet1.getMass()*planet2.getMass())/Math.pow(distBetweenPlanets,2);
        return gravitationalForce;
    }

}