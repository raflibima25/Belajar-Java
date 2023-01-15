package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner userInput;
        float a,b,hasil;
        char operator;

        userInput = new Scanner(System.in);

        // a operator b
        System.out.println("--KALKULATOR IF ELSE--");
        System.out.print("nilai a = ");
        a = userInput.nextInt();
        System.out.print("operator = ");
        operator = userInput.next().charAt(0);
        System.out.print("nilai b = ");
        b = userInput.nextInt();

        System.out.print("input user: " + a + " " + operator + " " + b + " = ");

        // operator tersedia * / + -

        if (operator == '+'){
            hasil = a + b;
            System.out.println(hasil);
        } else if (operator == '-'){
            hasil = a - b;
            System.out.println(hasil);
        } else if (operator == '*'){
            hasil = a * b;
            System.out.println(hasil);
        } else if (operator == '/'){
            if (b == 0){
                System.out.println("\npembagian dengan 0 menghasilkan tanpa batas");
            } else {
                hasil = a / b;
                System.out.println(hasil);
            }
        } else {
            System.out.print("operator tidak ditemukan");
        }


    }
}
