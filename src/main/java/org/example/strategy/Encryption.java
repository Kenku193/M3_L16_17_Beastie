package org.example.strategy;

class Encryption {
    private Algorithm algorithm;

    public Encryption(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    public String crypt(String text, String key) {
        return algorithm.crypt(text, key);
    }

}
