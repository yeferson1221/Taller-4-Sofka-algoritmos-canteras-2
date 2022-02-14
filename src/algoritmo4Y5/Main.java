package algoritmo4Y5;

/**
 * [Esta es la clase main contiene el el iniciar el aplicativo
 * tiene los condicionales para  cuando el usuario ingrese  los datos del vehiculo
 * este inteligente mente pueda saber que vehiculo es creado
 *
 * ejemplo si el usuario ingresa  los datos  este mediante condicionales va filtrando hasta darse cuenta que vehiulo es.
 * E instancia ese objeto,
 *
 * @version [I
 *           ej: 1.04.05 2022-02-12,
 *
 * @author [Yeferson Valencia, alejandro.yandd@gmail.com]
 */
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        for(int i=0; i<=2; i++){
            vehicle.enterVehicle();
            if(vehicle.getNumberPassengers()== 2 && vehicle.getNumberWheels()==2){
               Motorcycle motorcycle = new Motorcycle();
               motorcycle.enterCrank();
                System.out.println("La moto:");
               motorcycle.showCrank();
            }else if(vehicle.getNumberPassengers()>=3 && vehicle.getNumberPassengers()<=5 && vehicle.getNumberWheels()==4){
                Car car = new Car();
                car.enterCar();
                System.out.println("el carro:");
                car.showCar();
            }else if(vehicle.getNumberPassengers()== 1 && vehicle.getNumberWheels()==2){
                Bicycle bicycle = new Bicycle();
                bicycle.enterBicycle();

                System.out.println("La bici:");
                bicycle.showCarBicycle();
            }else if(vehicle.getTrack()=="mar" || vehicle.getNumberWheels()>=0){
                Boat boat = new Boat();
                boat.enterBoat();
                System.out.println("La lancha: ");
                boat.showBoat();
            }else if(vehicle.getNumberPassengers()== 2 && vehicle.getNumberWheels()>=4){
                Truck truck = new Truck();
                truck.enterTruck();
                System.out.println("La camion");
                truck.showTruck();
            }
            vehicle.showVehicle();

        }
    }
}
