package com.tutorial;

public class Main {

    public static void main(String[] args) {

        // y = (x + 2) * x

        int x, y;

        x = 5;
        y = hitung(x);
        System.out.println("x = " + x + ", y = " + y);

        x = 20;
        y = hitung(x);
        System.out.println("x = " + x + ", y = " + y);

        x = 40;
        y = hitung(x);
        System.out.println("x = " + x + ", y = " + y);

    }

    private static int hitung(int input){
        int hasil;

//        hasil = (input + 2) * input;
        hasil = input * input;

        return hasil;
    }
}
