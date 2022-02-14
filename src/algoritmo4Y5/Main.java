package algoritmo4Y5;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        for(int i=0; i<=10; i++){
            vehicle.enterVehicle();
            if(vehicle.getNumberPassengers()== 2 && vehicle.getNumberWheels()==2){
               Motorcycle motorcycle = new Motorcycle();
            }
        }
    }
}
