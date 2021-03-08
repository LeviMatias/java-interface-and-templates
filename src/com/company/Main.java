package com.company;

import model.*;

import java.util.Comparator;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        try {
            Sorter s = (Sorter)MyFactory.getInstance("sorter");

            Integer[] arr = {1, 123, 45, 7567567, 123, 333, 76, 2, 4};
            String[] sarr = {"a", "d", "aaa", "asdas", "idoa", "eee", "z", "aa"};

            Comparator<Integer> intcomp = Comparator.comparingInt(a -> a);
            s.sort(arr, intcomp);

            Comparator<String> strcomp = (a, b)-> a.compareTo(b);
            s.sort(sarr, strcomp);

            for (int a: arr){
                System.out.println(a);
            }

            for (String str: sarr){
                System.out.println(str);
            }

            Timer timer = new Timer();
            timer.start();
            Integer[] boh = new Integer[100000];
            Random ran = new Random();
            for(int i=0; i<100000; i++) boh[i] = ran.nextInt();

            timer.stop();
            System.out.println(timer.elapsed_seconds());

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
