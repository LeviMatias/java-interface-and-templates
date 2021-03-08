package com.company;

import model.*;

public class Main {

    public static void main(String[] args) {
//        Persona[] arr = new Persona[7];
        Celular[] arr = new Celular[7];
//        arr[0] = new Persona(14, "Rodrigo");
//        arr[1] =  new Persona(18, "Juan");
//        arr[2] =  new Persona(4, "Mateo");
//        arr[3] =  new Persona(10, "Pedro");
//        arr[4] =  new Persona(84, "Matias");
//        arr[5] =  new Persona(132, "Lucas");
//        arr[6] = new Persona(45, "Javier");
        arr[0] = new Celular("Rodrigo");
        arr[1] =  new Celular("Juan");
        arr[2] =  new Celular("Mateo");
        arr[3] =  new Celular(10, "Pedro");
        arr[4] =  new Celular(84, "Matias");
        arr[5] =  new Celular(132, "Lucas");
        arr[6] = new Celular(45, "Javier");

        SortUtil.ordenar(arr);

        for (Persona p: arr){
            System.out.println(p.getNombre() + " " + p.getDni());

        }
    }
}
