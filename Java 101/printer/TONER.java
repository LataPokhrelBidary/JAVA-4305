package com.company;

public class TONER {

    private  String cartridges;
    private  String manufacturer;
    private  int tonerLevel;
    private  int numberOfPages;


    public TONER(String cartridges, String manufacturer, int tonerLevel, int numberOfPages) {
        this.cartridges = cartridges;
        this.manufacturer = manufacturer;
        this.tonerLevel = tonerLevel;
        this.numberOfPages = numberOfPages;
    }

    public  int  printPages(int pages) {
        if (tonerLevel - pages > 0) {
            numberOfPages += pages;
        }
        return numberOfPages;
    }

        public int printNewPages (int newPages){
            numberOfPages += newPages;
            tonerLevel -= (numberOfPages) * 2;
            System.out.println("Total number of pages: " + numberOfPages);
            return tonerLevel;

        }

        public void fillToner () {
            tonerLevel = 100;
        }

        public String getCartridges () {
            return cartridges;
        }

        public String getManufacturer () {
            return manufacturer;
        }

        public int getTonerLevel () {
            return tonerLevel;
        }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}


