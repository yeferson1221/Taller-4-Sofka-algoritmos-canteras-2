package algorithm3;

import java.util.Scanner;

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
        Scanner in = new Scanner(System.in);

        System.out.println("Imprime el array aleatorio desordenado");
        System.out.println("ingresar opcion 1)Quicksort 2)bubbleSort");
        arraySort.printArray();
        arraySort.bubbleSort();

        int option = 0,left=0,right=0;

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        option= in.nextInt();
        
        if (option==1){
            System.out.println("´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´");
            System.out.println("Imprime el array ordenado Quicksort");
            arraySort.quicksortList(arraySort.printArray(),left,right);
        }else if (option==2){
            System.out.println("´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´");
            System.out.println("Imprime el array ordenado bubbleSort");
            arraySort.printArray();
        }


    }


}
