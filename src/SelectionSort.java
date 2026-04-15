//Metodo no estable

import java.util.Arrays;

public class SelectionSort {

    public static <T extends Comparable<T>>
    void selectionSort(T[] arr) {
        int totalIter = 0;

        for(int i = 0; i < arr.length; i++) {
            int indiceMinimo = i;

            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j].compareTo(arr[indiceMinimo]) < 0) {
                    indiceMinimo = j;
                }
                totalIter++;
            }

            if(indiceMinimo != i) {
                T aux = arr[i];
                arr[i] = arr[indiceMinimo];
                arr[indiceMinimo] = aux;
            }
        }

        System.out.println("Total Itera: " + totalIter);
    }

    public static void main(String[] args) {
        Estudiante[] estudiantes = {
                new Estudiante("JJ F",5),
                new Estudiante("T G",4),
                new Estudiante("A S",4),
                new Estudiante("M C",1)
        };

        selectionSort(estudiantes);
        System.out.println(Arrays.toString(estudiantes));
    }
}