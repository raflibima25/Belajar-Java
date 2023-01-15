package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        // ternary operator

        int input, x;
        Scanner userInput = new Scanner(System.in);

        System.out.print("masukan nilai: ");
        input = userInput.nextInt();

        // variable x = ekspresi ? statement_true : statement_false;

        x = (input > 1) && (input < 10) ? input*input : input/2;

        System.out.println("hasilnya " + x);

    }
}
