package com.tutorial;

public class Main {

    public static void main(String[] args) {

        // looping bersarang

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
                if (i == j) {
                    break;
                }
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
                if ((i + j) == 4) {
                    break;
                }
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print("* ");
                if (i == j) {
                    break;
                } else if ((i + j) == 8) {
                    break;
                }
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if ((i + j) < 6) {
                    System.out.print("  ");
                } else if ((i + j) > 14) {
                    System.out.print("  ");
                } else if ((j + 4) < i) {
                    System.out.print("  ");
                } else if ((i + 4) < j) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.print("\n");
        }
    }
}
