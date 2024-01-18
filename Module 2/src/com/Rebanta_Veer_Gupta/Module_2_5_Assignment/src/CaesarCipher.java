package com.Rebanta_Veer_Gupta.Module_2_5_Assignment.src;

public class CaesarCipher {

    private final int shift;
    private final static int ALPHABET_SIZE = 26;
    private final static char FIRST_LETTER = 'A';

    public CaesarCipher(int shift) {
        if (shift < 1 || shift > 25) {
            throw new IllegalArgumentException("Shift must be between 1 and 25 inclusive");
        }
        this.shift = shift;
    }

    public String encrypt(String message) {
        StringBuilder encryptedMessage = new StringBuilder();

        for (char character : message.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isLowerCase(character) ? 'a' : 'A';
                int shifted = (character - base + shift) % ALPHABET_SIZE;
                encryptedMessage.append((char) (base + shifted));
            } else {
                encryptedMessage.append(character);
            }
        }

        return encryptedMessage.toString();
    }

    public String decrypt(String encryptedMessage) {
        StringBuilder decryptedMessage = new StringBuilder();

        for (char character : encryptedMessage.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isLowerCase(character) ? 'a' : 'A';
                int shifted = (character - base - shift + ALPHABET_SIZE) % ALPHABET_SIZE;
                decryptedMessage.append((char) (base + shifted));
            } else {
                decryptedMessage.append(character);
            }
        }

        return decryptedMessage.toString();
    }
}
