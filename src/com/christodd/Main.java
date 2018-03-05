package com.christodd;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input a number between 1 and 23:");
        int x = scanner.nextInt();
        while(x <= 0 || x > 23) {
            System.out.println("Invalid entry. Input a number between 1 and 23:");
            x = scanner.nextInt();
        }
        printMarioBlock(x);


    }

    public static void printMarioBlock(int x) {
        for(int i = 0; i < x + 1; i++) {
            for(int j = 0; j < x - i; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < i; k++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
