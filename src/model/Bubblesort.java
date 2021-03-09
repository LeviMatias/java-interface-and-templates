package model;

import java.util.Comparator;

public class Bubblesort implements Sorter {

    @Override
    public <T> void sort(T[] arr, Comparator<T> comp) {
        bubblesort(arr, comp);
    }

    public <T> void bubblesort(T[] arr, Comparator<T> comp) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (comp.compare(arr[j], arr[j+1]) >= 0 ) {
                    T aux = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = aux;
                }
            }
        }
    }
}
