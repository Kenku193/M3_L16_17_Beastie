package org.example.decorator;

public class QuotesPrinter implements Printable {// ПЕЧАТНИК КАВЫЧЕК

    Printable printable;

    public QuotesPrinter(Printable printable) {
        this.printable = printable;
    }

    @Override
    public void print() {
        System.out.print("\"");
        printable.print();
        System.out.print("\"");
    }

}
