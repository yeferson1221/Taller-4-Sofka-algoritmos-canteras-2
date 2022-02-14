package algoritmo4Y5;

public class Motorcycle extends Vehicle{
    private boolean crank;

    public void enterCrank(){
        System.out.println("Tiene o no crank 1)SI 2)NO");
        int crank1 = in.nextInt();
        if(crank1==1){
            crank=true;
        }else if(crank1==2){
            crank=false;
        }

    }

    public void showCrank(){
        System.out.println("Crank de la moto: "+crank);

    }


    public boolean isCrank() {
        return crank;
    }

    public void setCrank(boolean crank) {
        this.crank = crank;
    }
}
