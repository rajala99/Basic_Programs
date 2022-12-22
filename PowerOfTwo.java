package com.bridgelabs.basicprogram;
import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        boolean b = true;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a number : ");
        int num = scan.nextInt();
        {
            while (num != 1) {
                if (num % 2 != 0) {
                    b = !b;
                    System.out.print(b);
                    System.exit(0);
                }
                num = num / 2;
            }
            System.out.print(b);
        }
    }
}

