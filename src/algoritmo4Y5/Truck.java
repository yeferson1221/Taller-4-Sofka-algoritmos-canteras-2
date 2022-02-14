package algoritmo4Y5;

public class Truck extends Vehicle{
    private boolean trailer;

    public void enterTruck(){
        System.out.println("Tiene o no Remolque 1)SI 2)NO");
        int trailer1 = in.nextInt();
        if(trailer1==1){
            trailer=true;
        }else if(trailer1==2){
            trailer=false;
        }

    }

    public void showCarTruck(){
        System.out.println("El trailer: "+trailer);

    }


    public boolean isTrailer() {
        return trailer;
    }

    public void setTrailer(boolean trailer) {
        this.trailer = trailer;
    }
}
