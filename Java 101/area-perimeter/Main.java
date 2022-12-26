package language.Classes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Rectangle2 myRect=new Rectangle2();
        Rectangle2 rec = new Rectangle2(5.00,6.00);
        while (true) {

            System.out.println(" 1 - enter 1 to set the length\n "
                    + "2 - enter 2 to set the width\n "
                    + "3 - to get the length area \n "
                    + "4 - to get the width \n "
                    + "5 - to get the perimeter\n "
                    + "6 - to get the area\n "
                    + "0 - to quit ");
            System.out.println(" Please select length# and/or width# for area and perimeter calculation");


            Scanner num = new Scanner(System.in);
            int choice = num.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter a length: ");
                    double length = num.nextDouble();
                    rec.setLength(length);
                    break;
                case 2:
                    System.out.println("Enter a width: ");
                    double width = num.nextDouble();
                    rec.setWidth(width);
                    break;
                case 3:
                    System.out.println("Length is: " + rec.getLength());
                    break;
                case 4:
                    System.out.println("Width is: " + rec.getWidth());
                    break;
                case 5:
                    System.out.println("Perimeter is: " + rec.getPerimeter());
                    break;
                case 6:
                    System.out.println("Area is: " + rec.getArea());
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice please enter a valid selection from menu");
            }

        }

    }
}


