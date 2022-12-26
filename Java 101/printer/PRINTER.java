package com.company;

public class PRINTER {
    private  TONER theToner;
    private  OUTPUTTRAY theTray;
    private  CONNECTOR theConnector;


    public PRINTER(TONER theToner, OUTPUTTRAY theTray, CONNECTOR theConnector) {
        this.theToner = theToner;
        this.theTray = theTray;
        this.theConnector = theConnector;
    }

    public TONER getTheToner() {
        return theToner;
    }

    public OUTPUTTRAY getTheTray() {
        return theTray;
    }

    public CONNECTOR getTheConnector() {
        return theConnector;
    }
}

