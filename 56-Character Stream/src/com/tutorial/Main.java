package com.tutorial;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        // Membuka file

        // byte stream -> FileInputStream - FileOutputStream
        // Character stream -> FileReader - FileWriter

        FileInputStream byteFileInput = new FileInputStream("input.txt");
        FileReader      charFileinput = new FileReader("input.txt");

        FileOutputStream byteFileOutput = new FileOutputStream("outputByte.txt");
        FileWriter      charFileOutput = new FileWriter("outputChar.txt");

        // Membaca file

        // byte file
        int buffer = byteFileInput.read();

        while(buffer != -1) {
            System.out.print((char)buffer);
            byteFileOutput.write(buffer);
            buffer = byteFileInput.read();
        }

        System.out.println("\n");

        // char file
        buffer = charFileinput.read();

        while(buffer != -1) {
            System.out.print((char)buffer);
            charFileOutput.write(buffer);
            buffer = charFileinput.read();
        }

        // Menutup file

        byteFileInput.close();
        charFileinput.close();
        byteFileOutput.close();
        charFileOutput.close();

    }
}
