package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PALINDROME pal = new PALINDROME();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();

        int size = pal.getSize(num);
        int [] intArray = new int[size];
        System.out.println("\nNumber of digits: " + size + "\n");
        pal.fillArray(num, intArray);
        boolean bool = pal.isPalindrome(intArray);
        System.out.println("\n" +(bool == true ? "Yes, entered number is a palindrome.\n" : "No, entered number is not a palindrome.\n"));
    }


}

