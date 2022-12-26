package com.company;

public class OUTPUTTRAY {
 private int pagesCount;
 private String size;
 private boolean duplex;

    public OUTPUTTRAY(int pagesCount, String size, boolean duplex) {
        this.pagesCount = pagesCount;
        this.size = size;
        this.duplex = duplex;
    }

    public int printNewPages (int newPages) {
        pagesCount += newPages;
        return pagesCount;
    }
        public int getPagesCount() {
        return pagesCount;
    }

    public String getSize() {
        return size;
    }

    public boolean getDuplex() {
        return duplex;
    }
    public boolean isDuplex(){
        if(this.duplex == true){
            System.out.println("Printing in Duplex Mode");
        }
        return  true;

    }

}

