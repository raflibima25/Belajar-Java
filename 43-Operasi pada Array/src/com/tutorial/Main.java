package com.tutorial;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arrayAngka1 = {1,2,3,4,5};

        System.out.println("\n--Merubah array menjadi string--");
        printArray(arrayAngka1);

        System.out.println("\nMengkopi array \n=======================");
        int[] arrayAngka2 = new int[5];
        printArray(arrayAngka1);
        printArray(arrayAngka2);

        System.out.println("\nmengkopi dengan loop");
        for(int i = 0; i < arrayAngka1.length; i++){
            arrayAngka2[i] = arrayAngka1[i];
        }
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka2);
        System.out.println(arrayAngka2);

        System.out.println("\nmengkopi dengan copyOf");
        int[] arrayAngka3 = Arrays.copyOf(arrayAngka1, arrayAngka1.length);
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka3);
        System.out.println(arrayAngka3);

        System.out.println("\nmengkopi dengan copyOfRange");
        int[] arrayAngka4 = Arrays.copyOfRange(arrayAngka1,2,4);
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka4);
        System.out.println(arrayAngka4);

        // fill array
        System.out.println("\nfill array \n=======================");
        int[] arrayAngka5 = new int[10];
        printArray(arrayAngka5);
        Arrays.fill(arrayAngka5,5);
        printArray(arrayAngka5);

        // komparasi array
        System.out.println("\nkomparasi array \n=======================");
        int[] arrayAngka6 = {1,2,3,4,5};
        int[] arrayAngka7 = {1,2,3,4,5};

        System.out.println("membandingkan antara dua buah array");
        System.out.println(Arrays.equals(arrayAngka6,arrayAngka7));

        if (Arrays.equals(arrayAngka6,arrayAngka7)){
            System.out.println("array ini sama");
        } else {
            System.out.println("array ini beda");
        }

        // jika hasilnya 0  = sama
        // jika hasilnya 1  = array kiri (arrayAngka6) nilainya lebih besar
        // jika hasilnya -1 = array kanan (arrayAngka7) nilainya lebih besar
        System.out.println("\nngecek mana array yang lebih besar");
        System.out.println(Arrays.compare(arrayAngka6,arrayAngka7));

        // jika hasilnya -1 = tidak ada yang berbeda
        System.out.println("\nngecek mana index yang berbeda");
        System.out.println(Arrays.mismatch(arrayAngka6,arrayAngka7));

        // sort array
        System.out.println("\nsorting array");
        int[] arrayAngka8 = {1,6,4,5,3,5,2,6};
        printArray(arrayAngka8);
        Arrays.sort(arrayAngka8);
        printArray(arrayAngka8);

        // search array
        System.out.println("\nsearch array");
        int angka = 3;
        int posisi = Arrays.binarySearch(arrayAngka8,angka); // binerySearch harus di sorting dulu
        System.out.println("angka " + angka + " ada di index " + posisi);

        // tugas -> sort kebalik,
        // operasi tambah pada dua buah array,
        // menggabungkan dua buah array

        // Method sorting kebalik
        System.out.println("\nsorting kebalik \n=======================");
        printArray(arrayAngka8);
        reverseSortArray(arrayAngka8);

        // Method menambahkan dua buah array
        System.out.println("\nmenambah array \n=======================");
        printArray(arrayAngka6);
        printArray(arrayAngka7);
        additionArray(arrayAngka6,arrayAngka7);

        // Method menambah dua buah array
        System.out.println("\nmenggabungkan dua buah array \n=======================");
        printArray(arrayAngka6);
        printArray(arrayAngka7);
        mergeTwoArray(arrayAngka6,arrayAngka7);

    }

    private static void printArray(int[] dataArray){
        System.out.println("array = " + Arrays.toString(dataArray));
    }

    // sorting kebalik
    public static void reverseSortArray(int[] dataArray){
        Arrays.sort(dataArray);
        for(int i = 0; i < 1; i++){
            System.out.print("Data array = [");
            for(int j = dataArray.length-1; j >= 0; j--){
                if(j >= 1){
                    System.out.print(dataArray[j] + ", ");
                } else {
                    System.out.println(dataArray[j] + "]");
                }
            }
        }
    }

    // menambah array
    public static void additionArray(int[] dataArray1, int[] dataArray2){
        int[] newArray = new int[dataArray1.length];
        for(int i = 0; i < dataArray1.length; i++){
            newArray[i] = dataArray1[i] + dataArray2[i];
        }
//        System.out.println("array ditambah = " + Arrays.toString(newArray));
        printArray1Dmanual(newArray);
    }

    // menggabungkan array
    public static void printArray1Dmanual(int[] dataArray){
        for(int i = 0; i < 1; i++){
            System.out.print("Data array = [");
            for(int j = 0; j < dataArray.length; j++){
                if(j < dataArray.length-1){
                    System.out.print(dataArray[j] + ", ");
                } else {
                    System.out.println(dataArray[j] + "]");
                }
            }
        }
    }

    private static void mergeTwoArray(int[] dataArray1, int[] dataArray2){
        int[] newArray = new int[dataArray1.length + dataArray2.length];
        for(int i = 0; i < (dataArray1.length + dataArray2.length); i++){
            if(i < dataArray1.length){
                newArray[i] = dataArray1[i];
            } else if (i >= dataArray2.length) {
                newArray[i] = dataArray2[(i - dataArray2.length)];
            }
        }
        System.out.println(Arrays.toString(newArray));
    }

}
