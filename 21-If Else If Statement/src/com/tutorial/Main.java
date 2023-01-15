package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        // tutorial if else if statement

        int a;

        Scanner userInput = new Scanner(System.in);

        System.out.println("--awal program--");

        System.out.print("masukan nilai 5/10 = ");
        a = userInput.nextInt();

        // if else statement

        if (a == 5){

            System.out.println("aksi 1");

        } else if (a == 10){

            System.out.println("aksi 2");

        } else {

            System.out.println("aksi default");

        }

        // akhir program

        System.out.println("--akhir program--");

    }
}
