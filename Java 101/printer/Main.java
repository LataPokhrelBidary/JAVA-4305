package com.company;

public class Main {

    public static void main(String[] args) {

        CONNECTOR theConnector = new CONNECTOR("M203dw","HP","Wireless");
        OUTPUTTRAY theTray = new OUTPUTTRAY(250,"A4",true);
        TONER theToner = new TONER("jetIntelligence","HP",100,2);

        PRINTER thePrinter = new PRINTER(theToner,theTray,theConnector);

        thePrinter.getTheConnector().pressPowerButton();
        System.out.println("Initial number of Pages: "+ thePrinter.getTheToner().getNumberOfPages());
        System.out.println("Total Print Pages "+thePrinter.getTheToner().printPages(3));
        System.out.println("The level of Toner: "+ thePrinter.getTheToner().printNewPages(4));
        thePrinter.getTheTray().isDuplex();


    }
}
