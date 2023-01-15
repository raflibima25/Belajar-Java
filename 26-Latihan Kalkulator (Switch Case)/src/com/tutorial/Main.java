package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        // switch case

        Scanner userInput;
        float a,b,hasil;
        String operator;

        userInput = new Scanner(System.in);

        System.out.print("nilai a = ");
        a = userInput.nextFloat();
        System.out.print("operator = ");
        operator = userInput.next();
        System.out.print("nilai b = ");
        b = userInput.nextFloat();

        System.out.print("input user: " + a + " " + operator + " " + b + " = ");

        // aksi

        switch (operator){
            case "+":
                hasil = a + b;
                System.out.println(hasil);
                break;
            case "-":
                hasil = a - b;
                System.out.println(hasil);
                break;
            case "*":
                hasil = a * b;
                System.out.println(hasil);
                break;
            case "/":
                hasil = a / b;
                System.out.println(hasil);
                break;
            default:
                System.out.println("operator " + operator + " tidak ditemukan");
        }
    }
}
