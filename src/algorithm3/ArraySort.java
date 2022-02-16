package algorithm3;
/**
 * [una clase contiene el metodo burbuja para ordenar un listado
 *
 * @author [Yeferson Valencia, apellido y correo electrónico del autor.
 *
 * @since [1.0.0]
 *
 */
public class ArraySort {
    int numberList[]=new int[10];

    public ArraySort() {

        for(int i=0; i<numberList.length; i++) {
            numberList[i] = (int) (Math.random() * 11);
        }
    }

    public void bubbleSort(){
        int aux;
        for(int i=0; i<numberList.length-1; i++){
            for(int j=0; j<numberList.length-1; j++){
                if(numberList[j]>numberList[j+1]){
                    aux=numberList[j];
                    numberList[j]=numberList[j+1];
                    numberList[j+1]=aux;
                }
            }
        }
    }

    public int[] printArray(){
        for(int i=0; i<numberList.length; i++){
            System.out.println(numberList[i]);
        }
        return new int[0];
    }

    public void quicksortList(int number[], int left, int right) {
        System.out.println("QuickSort: ");

        int list = number[left];
        int i = left,j = right,c;

        while (i < j) {
            while (number[i] <= list && i < j)
                i++;

            while (number[j] > list)
                j--;

            if (i < j) {
                c = number[i];
                number[i] = number[j];
               number[j] = c;
            }
        }

        number[left] =number[j];
        number[j] = list;

        if (left < j - 1)
            quicksortList(number, left, j - 1);

        if (j + 1 < right)
            quicksortList(number, j + 1, right);

        for (int h = 0; h < number.length; h++) {
            System.out.println(numberList[h] + " ");
        }
    }

}
