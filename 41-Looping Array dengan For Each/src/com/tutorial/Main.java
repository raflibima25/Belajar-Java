package com.tutorial;

public class Main {

    public static void main(String[] args){

        int[] arrayAngka = {11,12,13,14,15,16,17,18,19,20};

        // looping standard
        System.out.println("--looping standard--");
        for(int i = 0; i < 10; i++){
            System.out.println("index ke-" + i + " adalah = " + arrayAngka[i]);
        }

        // looping dengan properti array
        System.out.println("--looping dengan properti length--");
        for(int i = 0; i < arrayAngka.length; i++){
            System.out.println("index ke-" + i + " adalah = " + arrayAngka[i]);
        }

        // looping khusus untuk collection <-- Array
        System.out.println("--looping for each--");
        for(int angka : arrayAngka){
            System.out.println("angka pada looping ini = " + angka);
        }

        /* kapan bisa pake for each? : kita pake for each disaat index [i]
        * sudah tidak berguna lagi. jadi kalo kita mau looping aja tanpa mau ngambil
        * index nya maka kita pake yang for each. */

    }
}
