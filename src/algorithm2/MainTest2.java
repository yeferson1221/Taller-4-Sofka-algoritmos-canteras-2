package algorithm2;

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
public class MainTest2 {
    private String name;
    private String lastName;

    public MainTest2(String name, String lastName) {
        this.name = name;
        this.lastName= lastName;
    }

    public static void main(String[] args) {
        MainTest2 mainTest2 = new MainTest2( "Yeferson", "Valencia");
        System.out.println(mainTest2.name+" "+mainTest2.lastName);
    }
}
