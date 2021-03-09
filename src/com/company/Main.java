package com.company;

import model.*;

import java.util.Comparator;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        try {
            Sorter s = (Sorter)MyFactory.getInstance("sorter");

            Comparator<Integer> intcomp = (a,b)-> a - b;

            Timer timer = new Timer();
            timer.start();
            Integer[] boh = new Integer[10000];
            Random ran = new Random();
            for(int i=0; i<10000; i++) boh[i] = ran.nextInt();

            s.sort(boh, intcomp);
            timer.stop();
            System.out.println(timer.elapsed_seconds());

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
