package algorithm3;

/**
 * [metodo main para inicializar el ordenamiento del listado aleatorio
 *
 * @author [Yeferson Valencia, apellido y correo electrónico del autor.
 *
 * @since [1.0.0]
 *
 */
public class Main {
    public static void main(String[] args) {
        ArraySort arraySort = new ArraySort();
        System.out.println("Imprime el array aleatorio desordenado");
        arraySort.printArray();
        arraySort.bubbleSort();
        System.out.println("´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´");
        System.out.println("Imprime el array ordenado");
        arraySort.printArray();

    }
}
