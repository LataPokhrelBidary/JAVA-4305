package language.Classes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Rectangle Ap = new Rectangle();
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the length of the perimeter?");
        double length = sc.nextDouble();
        System.out.println("What is the Width of the perimeter?");
        double width = sc.nextDouble();
        Ap.setLength(length);
        Ap.setWidth(width);

        System.out.println("The Area of the rectangle: "+ Ap.areaOfRectangle(length , width));
        System.out.println("The perimeter of the rectangle: "+ Ap.perimeterOfRectangle(length, width));


    }
}
