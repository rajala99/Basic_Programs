package com.bridgelabs.basicprogram;

import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        boolean Vowel = false;;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character : ");
        char ch = scanner.next().charAt(0);
        scanner.close();
        switch(ch)
        {
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
            case 'A' :
            case 'E' :
            case 'I' :
            case 'O' :
            case 'U' : Vowel = true;
        }
        if(Vowel == true) {
            System.out.println(ch+" is  a Vowel");
        }
        else {
            if((ch >= 'a' && ch <= 'z')||(ch >= 'A' && ch<='Z'))
                System.out.println(ch+" is a Consonant");
            else
                System.out.println("Input is not an alphabet");
        }
    }

}
