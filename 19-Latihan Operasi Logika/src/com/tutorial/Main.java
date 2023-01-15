package com.tutorial;

import java.util.*;

public class Main {

    public static void main(String[] args){

        // membuat sebuah objek untuk menangkap input dari user
        Scanner userInput = new Scanner(System.in);

        // program sederhana untuk menebak sebuah angka
        int nilaiBenar = 6;
        int nilaiTebakan;
        boolean statusTebakan;

        System.out.print("\nmasukan nilai tebakan: " );
        nilaiTebakan = userInput.nextInt();
        System.out.println("hasil tebakan anda: " + nilaiTebakan);

        // operasi logika
        statusTebakan = (nilaiBenar == nilaiTebakan);
        System.out.println("tebakan anda: " + statusTebakan);

        // operasi aljabar boolean (and / or)
        System.out.print("\nmasukan nilai diantara 4 - 9: ");
        nilaiTebakan = userInput.nextInt();
        statusTebakan = (nilaiTebakan > 4) && (nilaiTebakan < 9);
        /*
                &&
            a | b | c
            0   0   0
            0   1   0
            1   0   0
            1   1   1
         */
        System.out.println("tebakan anda: " + statusTebakan);



    }
}
