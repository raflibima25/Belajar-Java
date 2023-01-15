package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        // program untuk menjumlahkan angka dengan rentang

        int nilaiAwal, nilaiAkhir, total;

        Scanner inputUser = new Scanner(System.in);

        System.out.print("nilai awal : ");
        nilaiAwal = inputUser.nextInt();
        System.out.print("nilai akhir : ");
        nilaiAkhir = inputUser.nextInt();

//        total = 0;

        // while
//        while (nilaiAwal <= nilaiAkhir) {
//
//            total = total + nilaiAwal;
//            System.out.println("ditambahkan " + nilaiAwal + " menjadi " + total);
//            nilaiAwal++;
//        }

        // do while
//        do {
//
//            total = total + nilaiAwal;
//            System.out.println("ditambahkan " + nilaiAwal + " menjadi " + total);
//            nilaiAwal++;
//
//        } while (nilaiAwal <= nilaiAkhir);

        // for loop
        for (total = 0; nilaiAwal <= nilaiAkhir; nilaiAwal++){

            total = total + nilaiAwal;
            System.out.println("ditambahkan " + nilaiAwal + " menjadi " + total);

        }

    }
}
