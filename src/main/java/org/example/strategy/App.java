package org.example.strategy;

public class App {
    public static void main(String[] args) {
        String key = "key";
        String text = "text";
        Encryption encryption = new Encryption(new CaesarMethod());
        String cryptedText = encryption.crypt(text, key);
    }
}