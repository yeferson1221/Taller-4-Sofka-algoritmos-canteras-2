package algorithm3;

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
