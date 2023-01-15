package com.tutorial;

public class Main {

    public static void main(String[] args) {

        // operasi aritmatika
        int variable1 = 5;
        int variable2 = 3;

        int hasil;

        // penjumlahan
        hasil = variable1 + variable2;
        System.out.println(variable1 + " + " + variable2 + " = " + hasil);

        // pengurangan
        hasil = variable1 - variable2;
        System.out.printf("%d - %d = %d \n",variable1,variable2,hasil);

        // perkalian
        hasil = variable1 * variable2;
        System.out.printf("%d x %d = %d \n",variable1,variable2,hasil);

        // pembagian
        hasil = variable1 / variable2;
        System.out.printf("%d / %d = %d \n",variable1,variable2,hasil);

        float a = 7;
        float b = 3;

        float hasilFloat = a/b;

        System.out.println(a + " + " + b + " = " + hasilFloat);

        // modulus (sisa pembagian)
        hasil = variable1 % variable2;
        System.out.printf("%d %% %d = %d \n",variable1,variable2,hasil);

    }
}
