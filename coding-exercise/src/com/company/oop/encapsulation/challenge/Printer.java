package com.company.oop.encapsulation.challenge;

public class Printer {

    private int tonerLevel = 100;
    private int numberOfPages;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {

        if (tonerLevel > -1 && tonerLevel <= 100)
            this.tonerLevel = tonerLevel;
        else
            this.tonerLevel = -1;

        this.numberOfPages = 0;
        this.isDuplex = isDuplex;
    }

    public int addToner(int tonerAmount){

        if (tonerAmount > 0 && tonerAmount <= 100){
            if(tonerAmount + this.tonerLevel > 100){
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;

        } else {
            return -1;
        }
    }

    public int printPages(int pages){

        int pagesToPrint = pages;
        if(this.isDuplex){
            pagesToPrint = (pagesToPrint / 2) + (pagesToPrint % 2);
            System.out.println("Printing in duplex mode.");
        }
        this.numberOfPages += pagesToPrint;
        return pagesToPrint;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}
