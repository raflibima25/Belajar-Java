package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);

        System.out.print("masukan nilai = ");
        int nilai = userInput.nextInt();
        System.out.println("anda memasukan nilai = " + nilai);

        printNilai(nilai);
        int jumlah = jumlahNilai(nilai);
        System.out.println("hasil jumlah = " + jumlah);

        int faktorial = hitungFaktorial(nilai);
        System.out.println("hasil faktorial = " + faktorial);

    }

    // fungsi rekursif sederhana

    // dikali
    private static int hitungFaktorial(int parameter){
        System.out.println("parameter = " + parameter);

        if (parameter == 1){
            return parameter;
        }

        return parameter * hitungFaktorial(parameter - 1);
    }

    // ditambah
    private static int jumlahNilai(int parameter){
        System.out.println("parameter = " + parameter);

        if (parameter == 1){
            return parameter;
        }

        return parameter + jumlahNilai(parameter - 1);
    }

    // print angka
    private static void printNilai(int parameter){
        System.out.println("nilai = " + parameter);

        if (parameter == 0){
            return;
        }
        parameter--;

        printNilai(parameter);
    }

}
