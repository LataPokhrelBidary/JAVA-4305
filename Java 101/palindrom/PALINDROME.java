package com.company;

public class PALINDROME {

    public int getSize(int num) {
        String s = "" + num;
        return s.length();
    }

    public void fillArray(int num, int[] intArray) {

        String string = Integer.toString(num);
        for(int i = 0; i < string.length(); i++) {
            String s = "" + string.charAt(i);
            intArray[i] = Integer.parseInt(s);
            System.out.println("At index " + i + ", the number is " + intArray[i]);
        }

    }
    public  boolean isPalindrome(int[] intArray ){
        String s = "";
        for(int value : intArray)
            s = s + value;
        String reverse = "";
        for(int i = s.length() - 1; i >= 0; i--){
            reverse = reverse + s.charAt(i);
        }
        return s.equals(reverse);
    }
}


