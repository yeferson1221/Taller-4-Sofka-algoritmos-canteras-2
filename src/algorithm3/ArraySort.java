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

    public  void printArray(){
        for(int i=0; i<numberList.length; i++){
            System.out.println(numberList[i]);
        }
    }
}
