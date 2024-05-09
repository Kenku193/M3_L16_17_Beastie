package org.example.decorator;

public class TextPrinter implements Printable{

    private String textForPrinting;

    public TextPrinter(String textForPrinting) {
        this.textForPrinting = textForPrinting;
    }

    @Override
    public void print() {
        System.out.print(textForPrinting);
    }
}
