package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        // nested if atau if bersarang

        int a, b, c;

        Scanner userInput = new Scanner(System.in);

        System.out.println("--awal program--");

        // nested statement

        System.out.print("masukan a = ");
        a = userInput.nextInt();

        if (a == 5){

            System.out.println("aksi 1");

        } else {

            System.out.print("masukan b = ");
            b = userInput.nextInt();

            if (b == 10){

                System.out.println("aksi 4");

            } else {

                System.out.print("masukan c = ");
                c = userInput.nextInt();

                if (c == 15){

                    System.out.println("aksi 2");

                } else {

                    System.out.println("aksi 3");

                }
            }
        }

        // akhir program

        System.out.println("--akhir program--");

    }
}
