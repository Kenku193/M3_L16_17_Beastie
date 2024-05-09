package org.example.decorator;

public class BracketPrinter implements Printable{

    Printable printable;

    public BracketPrinter(Printable printable) {
        this.printable = printable;
    }

    @Override
    public void print() {
        System.out.print("(");
        printable.print();
        System.out.print(")");
    }
}
