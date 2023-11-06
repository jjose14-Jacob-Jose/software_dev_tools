package com.jacob;

import java.security.SecureRandom;
import java.util.Base64;

public class KeyGenerator {

    private static final String MSG_NEW_LINES = "\n\n";
    private static final String MSG_OUTPUT_PREFIX = "Key Generated is: ";

    public static String GenerateKey () {
        int keyLength = 256 / 8; // 256 bits
        byte[] secretKey = new byte[keyLength];
        new SecureRandom().nextBytes(secretKey);
        return Base64.getEncoder().encodeToString(secretKey);
    }

    public static void printOutput(String output) {
        System.out.print(MSG_NEW_LINES);
        System.out.print(MSG_OUTPUT_PREFIX);
        System.out.print(output);
        System.out.print(MSG_NEW_LINES);

    }

    public static void main (String [] args) {
        KeyGenerator.printOutput(KeyGenerator.GenerateKey());
    }
}