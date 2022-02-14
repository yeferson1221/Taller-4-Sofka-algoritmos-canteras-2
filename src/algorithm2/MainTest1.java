package algorithm2;

public class MainTest1 {
    /**
     * [una clase puede tener  solo un metodo main
     * esta es la que da el inicio al programa
     * no se puede iniciar otras al tiempo mientras esta se ejecutada
     *
     * @author [Yeferson Valencia, apellido y correo electrónico del autor.
     *
     * @since [1.0.0]
     *
     */
    public void showText(){
        System.out.println("experimento del metodo main ");
    }

    public static void main(String[] args) {
        MainTest1 mainTest1 = new MainTest1();
        mainTest1.showText();

    }
}
