package com.tutorial;

public class Main {

    public static void main(String[] args){

//        for (inisialisasi; kondisi; step nilai){
//
//        }

        System.out.println("--awal program--");

        System.out.println("loop pertama");
        for (int nilai = 0; nilai <= 10; nilai++){

            System.out.println("for loop ke-" + nilai);

        }

        System.out.println("\nloop kedua");
        for (int nilai = 0; nilai < 10; nilai++){

            System.out.println("for loop ke-" + nilai);

        }

        System.out.println("\nloop ketiga");
        for (int nilai = 10; nilai >= 5; nilai--){

            System.out.println("for loop ke-" + nilai);

        }

        // loop keempat hanya contoh jika inisialisasi dan-
        // step nilai bisa di pisah
        System.out.println("\nloop keempat");

        int nilai = 0;

        for (; nilai <= 10;){

            System.out.println("for loop ke-" + nilai);
            nilai++;
        }

        System.out.println("--akhir program--");

    }
}
