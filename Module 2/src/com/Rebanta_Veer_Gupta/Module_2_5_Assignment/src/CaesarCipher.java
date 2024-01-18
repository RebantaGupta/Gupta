package com.Rebanta_Veer_Gupta.Module_2_5_Assignment.src;

import java.util.HashMap;
import java.util.Map;

public class CaesarCipher {

    private final int shift;
    private final static int ALPHABET_SIZE = 26;
    
    private Map<Character, Character> encryptionMap;
    private Map<Character, Character> decryptionMap;

    public CaesarCipher(int shift) {
        if (shift < 1 || shift > 25) {
            throw new IllegalArgumentException("Shift must be between 1 and 25 inclusive");
        }
        this.shift = shift;
        initializeMaps();
    }

    private void initializeMaps() {
        encryptionMap = new HashMap<>();
        decryptionMap = new HashMap<>();

        for (char i = 'A'; i <= 'Z'; i++) {
            char encryptedChar = (char) ((i - 'A' + shift) % ALPHABET_SIZE + 'A');
            encryptionMap.put(i, encryptedChar);
            decryptionMap.put(encryptedChar, i);
        }

        for (char i = 'a'; i <= 'z'; i++) {
            char encryptedChar = (char) ((i - 'a' + shift) % ALPHABET_SIZE + 'a');
            encryptionMap.put(i, encryptedChar);
            decryptionMap.put(encryptedChar, i);
        }
    }

    public String encrypt(String message) {
        StringBuilder encryptedMessage = new StringBuilder();

        for (char character : message.toCharArray()) {
            encryptedMessage.append(encryptionMap.getOrDefault(character, character));
        }

        return encryptedMessage.toString();
    }

    public String decrypt(String encryptedMessage) {
        StringBuilder decryptedMessage = new StringBuilder();

        for (char character : encryptedMessage.toCharArray()) {
            decryptedMessage.append(decryptionMap.getOrDefault(character, character));
        }

        return decryptedMessage.toString();
    }
}
