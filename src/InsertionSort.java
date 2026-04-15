//MEtodo estable

import java.util.Arrays;

public class InsertionSort {


    public static <T extends Comparable<T>>
    void insertionSort(T[] arr) {
        for(int i = 1; i < arr.length; i++) {
            T llave = arr[i];
            int j = i - 1;

            while(j >= 0 && llave.compareTo(arr[j]) < 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = llave;
        }
    }

    public static void main(String[] args) {
        Estudiante[] estudiantes = {
                new Estudiante("JJ F",5),
                new Estudiante("T G",4),
                new Estudiante("A S",4),
                new Estudiante("M C",1)
        };

        insertionSort(estudiantes);
        System.out.println(Arrays.toString(estudiantes));
    }
}