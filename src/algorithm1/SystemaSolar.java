package algorithm1;
import java.util.Random;
import java.util.Scanner;
public abstract class SystemaSolar  {
    Random claseRandom = new Random();
    Scanner in = new Scanner(System.in);

    protected String name;
    protected int id;
    protected Double mass;
    protected Double density;
    protected Double diameter;
    protected Double distanceSun;
//constructor
    public SystemaSolar() {
        System.out.println("Ingresar nombre del planeta: ");
        this.name=in.nextLine();
        this.id =  claseRandom.nextInt(1000);;
        System.out.println("Ingresar masa del planeta en kg: ");
        this.mass=in.nextDouble();
        System.out.println("Ingresar dencidad: ");
        this.density=in.nextDouble();
        System.out.println("Ingresar diametro: ");
        this.diameter=in.nextDouble();
        System.out.println("Ingresar distancia al sol en metros: ");
        this.distanceSun=in.nextDouble();

    }

    public void getSystemSolar(){
        System.out.println("El nombre del planeta es: "+name);
        System.out.println("El Identificador es: "+id);
        System.out.println("Masa: "+mass+"kg");
        System.out.println("dencidad: "+density);
        System.out.println("Diametro: "+diameter);
        System.out.println("Distancia hasta el sol: "+distanceSun);
    }



    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getMass() {
        return mass;
    }

    public void setMass(Double mass) {
        this.mass = mass;
    }

    public Double getDensity() {
        return density;
    }

    public void setDensity(Double density) {
        this.density = density;
    }

    public Double getDiameter() {
        return diameter;
    }

    public void setDiameter(Double diameter) {
        this.diameter = diameter;
    }

    public Double getDistanceSun() {
        return distanceSun;
    }

    public void setDistanceSun(Double distanceSun) {
        this.distanceSun = distanceSun;
    }


}
