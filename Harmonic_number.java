package com.bridgelabs.basicprogram;
import java.util.Scanner;
public class Harmonic_number {
    public static void main(String[] args) {
        int num;
        System.out.println(" enter the harmonic value :");
        Scanner Scan = new Scanner(System.in);
        num = Scan.nextInt();
        for(int i = 1; i<=num; i++){
            System.out.println("1/"+i);
        }
    }
}
