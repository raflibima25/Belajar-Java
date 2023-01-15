package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        // switch case

        String input;

        Scanner userInput = new Scanner(System.in);

        System.out.print("panggil nama: ");
        input = userInput.next();

        // ekspresinya berupa satuan (int,long,short,byte), String, atau enum

        switch (input){
            case "bima":
                System.out.println(input + " hadir");
                break;
            case "putri":
                System.out.println(input + " hadir");
                break;
            case "mama":
                System.out.println(input + " hadir");
                break;
            default:
                System.out.println("daftar orang tidak ada");
        }

        System.out.println("--selesai--");

    }
}
