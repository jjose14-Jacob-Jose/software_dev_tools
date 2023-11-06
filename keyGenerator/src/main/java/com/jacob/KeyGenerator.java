package com.jacob;

import java.security.SecureRandom;
import java.util.Base64;

public class KeyGenerator {

    private static final String MSG_NEW_LINE = "\n";
    private static final String MSG_OUTPUT_PREFIX = "Format-> Length (in bits): Key";
    private static final String MSG_DELIMITER = " : ";
    private static final int [] ARRAY_KEY_LENGTH_IN_BITS = new int [] { 16, 32, 64, 128, 256, 512, 1024, 2048 };

    /**
     * Generates a key.
     * @param keyLengthInBits length of the key in bits.
     * @return Return a String containing the keys.
     */
    private static String generateKey(int keyLengthInBits) {
        byte[] secretKey = new byte[keyLengthInBits];
        new SecureRandom().nextBytes(secretKey);
        return Base64.getEncoder().encodeToString(secretKey);
    }

    /**
     * Appends duplicates of the given String into a new String and returns the new String.
     * @param stringOriginal: String which is to be duplicated.
     * @param count: number of duplicates.
     * @return : String where duplicates are concatenated.
     */
    private static String getStringDuplicatesConcatenated(String stringOriginal, int count) {
        StringBuilder stringBuilder = new StringBuilder();
        while(count-->0) {
            stringBuilder.append(stringOriginal);
        }

        return stringBuilder.toString();
    }

    /**
     * Generates keys of different lengths from an array which contains the key lengths.
     * @param arrayKeyLengthsInBits: Integer array containing different key sizes.
     * @return : String containing keys of the lengths specified in the array.
     */
    public static String generateAndPrintFromKeysArray(int [] arrayKeyLengthsInBits) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(getStringDuplicatesConcatenated(MSG_NEW_LINE, 1));
        stringBuilder.append(MSG_OUTPUT_PREFIX);
        stringBuilder.append(getStringDuplicatesConcatenated(MSG_NEW_LINE, 2));

        for (int keySize: arrayKeyLengthsInBits) {
            stringBuilder.append(keySize);
            stringBuilder.append(MSG_DELIMITER);
            stringBuilder.append(generateKey(keySize));
            stringBuilder.append(getStringDuplicatesConcatenated(MSG_NEW_LINE, 2));
        }
        return stringBuilder.toString();
    }

    public static void main (String [] args) {
        System.out.println(KeyGenerator.generateAndPrintFromKeysArray(ARRAY_KEY_LENGTH_IN_BITS));
    }
}