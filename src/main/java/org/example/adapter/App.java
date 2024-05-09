package org.example.adapter;

public class App {
    public static void main(String[] args) {

        Database db = new DbAdapter();
        db.update();
        db.insert();

    }
}
