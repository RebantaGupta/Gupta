import java.util.*;

public class CaesarCipher {
    private int shift;

    public CaesarCipher(int shift) {
        if (shift < 1 || shift > 25) {
            throw new IllegalArgumentException("Shift must be between 1 and 25");
        }
        this.shift = shift;
    }

    public String encrypt(String message) {
        StringBuilder encryptedMessage = new StringBuilder();

        for (char c : message.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                char encryptedChar = (char) ((c - base + shift) % 26 + base);
                encryptedMessage.append(encryptedChar);
            } else {
                encryptedMessage.append(c);
            }
        }

        return encryptedMessage.toString();
    }

    public String decrypt(String encryptedMessage) {
        CaesarCipher decryptCipher = new CaesarCipher(26 - shift);
        return decryptCipher.encrypt(encryptedMessage);
    }

}
