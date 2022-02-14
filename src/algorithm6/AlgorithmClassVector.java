package algorithm6;

import java.util.Scanner;
import java.util.Vector;

public class AlgorithmClassVector {
    Scanner in = new Scanner(System.in);

    private Vector vectorEjemplo = new Vector();

    public AlgorithmClassVector() {
        System.out.println("El siguiente programa finaliza cuando ingrese dos numeros iguales seguidos.");
        System.out.print("Ingrese un número: ");
        int number = in.nextInt();
        vectorEjemplo.addElement(number);
        int i = 0;
        int vectorSize = vectorEjemplo.size();
        while (i < vectorSize) {
            System.out.print("Ingrese un número: ");
            number = in.nextInt();
            if (number != (int) vectorEjemplo.elementAt(i)) {
                vectorEjemplo.addElement(number);
                vectorSize = vectorEjemplo.size();
            } else {
                vectorEjemplo.addElement(number);
            }
            i++;
        }
    }

    public void printArray() {
        for (int i = 0; i < vectorEjemplo.size(); i++) {
            System.out.println(vectorEjemplo.elementAt(i));
        }
        System.out.println("Ha ingresado un número igual al anterior: "+vectorEjemplo.lastElement());
    }
}
