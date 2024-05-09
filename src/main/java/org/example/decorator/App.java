package org.example.decorator;

public class App {
    public static void main(String[] args) {

        Printable printer = new TextPrinter("some text to be printed");
        printer.print();

        System.out.println();
        System.out.println("-".repeat(50));

        Printable printer2 = new QuotesPrinter(new QuotesPrinter(new QuotesPrinter(new BracketPrinter(printer))));
        printer2.print();

    }
}
