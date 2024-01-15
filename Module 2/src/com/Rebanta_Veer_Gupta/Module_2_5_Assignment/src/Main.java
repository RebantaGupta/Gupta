package com.Rebanta_Veer_Gupta.Module_2_5_Assignment.src;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        CaesarCipher cipher = new CaesarCipher(10);

        System.out.println("Please ENTER Prompt:");
        System.out.println("(Please Note: Use Underscore '_' instead of Space ' ' for a Sentence)");

        Scanner OriginalMessage = new Scanner(System.in);
        String originalMessage = OriginalMessage.next();

        String encryptedMessage = cipher.encrypt(originalMessage);
        String decryptedMessage = cipher.decrypt(encryptedMessage);


        System.out.println("Original Message: " + originalMessage);
        System.out.println("Encrypted Message: " + encryptedMessage);
        System.out.println("Decrypted Message: " + decryptedMessage);
    }
}