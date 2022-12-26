package language.controlflowstatement;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leapY = new Scanner(System.in);
        System.out.print("Enter a year! ");
        int year = leapY.nextInt();


        //for (year = 1; year > 0; year++) {
        while(year > 0) {
            if (year == -99) {
                break;
            }
             if ((year % 400 == 0 && year % 100 == 0)) {
                System.out.println(year + " Is a century leap year");
            }
            else if ((year % 4 == 0) && year % 100 != 0 ) {
                System.out.println(year + " Is a leap year"); //1600, 2000
            }
            else {
                System.out.println(year + " Not a leap year!");
            }
            System.out.print("Enter a year ");
            year = leapY.nextInt();
        }

    }
            public static boolean isLeapYear ( int year){

                return true;
            }
        }
