package model;

import java.util.Comparator;

public class Quicksort implements Sorter{


    @Override
    public <T> void sort(T[] arr, Comparator<T> comp) {
        quickSort(arr, comp, 0, arr.length - 1);
    }

    private <T> void quickSort(T[] numbers, Comparator<T> comp, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(numbers, comp, left, right);
            quickSort(numbers, comp, left, pivotIndex - 1);  //sort left of pivot
            quickSort(numbers, comp, pivotIndex, right);  //sort right of pivot
        }
    }

    private <T> int partition(T[] numbers, Comparator<T> comp, int left, int right) {
        T pivot = numbers[right];
        int i = left - 1;
        for (int j = left; j < right; ++j) {
            if (comp.compare(numbers[j], pivot) <= 0) {
                swap(numbers, ++i, j);
            }
        }
        swap(numbers, ++i, right);
        return i;
    }

    private <T> void swap(T[] arr, int i, int j){
        T aux = arr[i];
        arr[i] = arr[j];
        arr[j] = aux;
    }
}
