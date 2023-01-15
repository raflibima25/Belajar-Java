package com.tutorial;

public class Main {

    public static void main(String[] args){

//        while (kondisi){
//            aksi
//        }

        int a = 0;
        boolean kondisi = true;

        System.out.println("--awal program--");

        while (kondisi){
            System.out.println("saya ganteng ke-" + a);
            // a++;

            if (a == 100){
                kondisi = false;
            }
            a++;
        }

        System.out.println("--akhir program--");

    }
}
