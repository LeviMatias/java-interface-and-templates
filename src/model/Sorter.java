package model;

import java.util.Comparator;

public interface Sorter {
    public <T> void sort(T arr[], Comparator<T> comp);
}
