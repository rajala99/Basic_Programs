package com.bridgelabs.basicprogram;

import java.util.Scanner;

public class Tossing_Coin {
    public static void main(String[] args) {
        if (Math.random() < 0.5){
            System.out.println("Heads");
        }else{
            System.out.println("Tails");
        }
    }
}
