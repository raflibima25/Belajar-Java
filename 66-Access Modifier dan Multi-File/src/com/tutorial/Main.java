package com.tutorial;

import raflibima.util.Memasak;

public class Main {

    public static void main(String[] args) {
        // public, private, default, protected

        // dengan access modifier public, dapat diakses
        Lain.methodPublic();

        // dengan access modifier private, tidak dapat diakses
        // Lain.methodPrivate();

        // karena dalam package yang sama, maka dapat diakses
        Lain.methodDefault();

        // karena dalam package yang sama, maka dapat diakses
        Lain.methodProtected();

        Memasak.dagingPublic();
        // Memasak.dagingPrivate(); tidak bisa
        // Memasak.dagingDefault(); tidak bisa
        // Memasak.dagingProtected(); tidak bisa

    }

}
