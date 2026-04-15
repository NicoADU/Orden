//Metodo estable

import java.util.Arrays;

public class BubbleSort {


    public static <T extends Comparable<T>>
    void bubbleSort(T[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            boolean flag = false;
            for(int j = i; j < arr.length; j++) {
                if(arr[j].compareTo(arr[i]) < 0) {
                    T aux = arr[j];
                    arr[j] = arr[i];
                    arr[i] = aux;
                    flag = true;
                }
            }
            if(!flag) break;
        }
    }

    public static void main(String[] args) {
        Estudiante[] estudiantes = {
                new Estudiante("JJ F",5),
                new Estudiante("T G",4),
                new Estudiante("A S",4),
                new Estudiante("M C",1)
        };

        bubbleSort(estudiantes);
        System.out.println(Arrays.toString(estudiantes));
    }
}