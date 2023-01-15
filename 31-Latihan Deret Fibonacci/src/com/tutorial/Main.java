package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        // menghitung nilai deret fibonacci ke-n
        int f_n, f_n_1, f_n_2, n;

        Scanner userInput = new Scanner(System.in);
        System.out.print("mengambil nilai ke- : ");
        n = userInput.nextInt();

        // for
        f_n_2 = 0;
        f_n_1 = 1;
        f_n = 1;

        for (int i = 1; i <= n; i++){
            System.out.println("nilai ke-" + i + " adalah " + f_n);
            f_n = f_n_1 + f_n_2;
            f_n_2 = f_n_1;
            f_n_1 = f_n;
        }

//        // while
//        int i = 1;
//
//        f_n_2 = 0;
//        f_n_1 = 1;
//        f_n = 1;
//
//        while (i <= n){
//            System.out.println("nilai ke-" + i + " adalah " + f_n);
//            f_n = f_n_1 + f_n_2;
//            f_n_2 = f_n_1;
//            f_n_1 = f_n;
//            i++;
//        }

//        // do while
//        int i = 1;
//
//        f_n_2 = 0;
//        f_n_1 = 1;
//        f_n = 1;
//
//        do {
//            System.out.println("nilai ke-" + i + " adalah " + f_n);
//            f_n = f_n_1 + f_n_2;
//            f_n_2 = f_n_1;
//            f_n_1 = f_n;
//            i++;
//        } while (i <= n);


    }
}
